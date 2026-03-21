package Project06;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EmployeeService {
    private final EmployeeDAO employeeDAO;

//    Thread-safe collections
    private final ConcurrentHashMap<Integer ,Employee> employeeCache;
    private final CopyOnWriteArrayList<String> operationLog;
    private final ConcurrentSkipListMap<String, List<Employee>> departmentIndex;

    public EmployeeService() {
        this.employeeDAO = new EmployeeDAO();
        this.employeeCache = new ConcurrentHashMap<>();
        this.operationLog = new CopyOnWriteArrayList<>();
        this.departmentIndex = new ConcurrentSkipListMap<>();
    }

    public void initialize() {
        employeeDAO.createTable();
        refreshCache();

    }

    public void refreshCache(){
        List<Employee> employees = employeeDAO.getAllEmployees();
        employeeCache.clear();
        departmentIndex.clear();

        for(Employee emp:employees){
            employeeCache.put(emp.getId(),emp);
            departmentIndex.computeIfAbsent(emp.getDepartment(), k -> new CopyOnWriteArrayList<>()).add(emp);

        }
        logOperation("Cache refreshed with " + employees.size() + " employees");
    }

    public boolean addEmployee(Employee employee){
        if(employeeDAO.insertEmployee(employee)){
            employeeCache.put(employee.getId() , employee);
            departmentIndex.computeIfAbsent(employee.getDepartment(), k -> new CopyOnWriteArrayList<>()).add(employee);
            logOperation("Added: " + employee.getName());
            return true;
        }
        return false;
    }

    public Employee getEmployeeById(int id){
        return employeeCache.get(id);
    }

    public Collection<Employee> getAllEmployees(){
        return new ArrayList<>(employeeCache.values());
    }

    public boolean updateEmployee(Employee employee){
        if(employeeDAO.updateEmployee(employee)){
            Employee oldEmp = employeeCache.get(employee.getId());
            if(oldEmp != null && !oldEmp.getDepartment().equals(employee.getDepartment())){
                departmentIndex.getOrDefault(oldEmp.getDepartment() , new  CopyOnWriteArrayList<>()).remove(oldEmp);
                departmentIndex.computeIfAbsent(employee.getDepartment(), k -> new CopyOnWriteArrayList<>()).add(employee);
            }
            employeeCache.put(employee.getId(),employee);
            logOperation("Updated: " + employee.getName());
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id){
        Employee emp = employeeCache.get(id);
        if(emp != null  && employeeDAO.deleteEmployee(id)){
            employeeCache.remove(id);
            departmentIndex.getOrDefault(emp.getDepartment(), new CopyOnWriteArrayList<>()).remove(emp);
            logOperation("Deleted: " + emp.getName());
            return true;
        }
        return false;
    }

    public List<Employee> getEmployeesByDepartment(String department){
        return new ArrayList<>(departmentIndex.getOrDefault(department, new CopyOnWriteArrayList<>()));
    }

    // Get top paid employees using Stream API
    public List<Employee> getTopPaidEmployees(int count){
        return employeeCache.values().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployeesBySalaryRange(double min , double max){
        return employeeCache.values().stream()
                .filter(emp -> emp.getSalary() >= min && emp.getSalary() <= max)
                .collect(Collectors.toList());
    }

    public Map<String,DoubleSummaryStatistics> getDepartmentStatistics () {
        return employeeCache.values().stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summarizingDouble(Employee::getSalary)
                ));
    }

    public Map<String,Long> getEmployeeCountByDepartment(){
        return employeeCache.values().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    public List<Employee> searchEmployeesByName(String keyword){
        return employeeCache.values().stream()
                .filter(emp -> emp.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<String> getOperationLog(){
        return new ArrayList<>(operationLog);
    }

    public List<String> getLastOperations(int count){
        int size = operationLog.size();
        int fromIndex = Math.max(0, size - count);
        return new ArrayList<>(operationLog.subList(fromIndex, size));
    }

    private void logOperation(String operation) {
        String timestamp = new Date().toString();
        operationLog.add(timestamp + " - " + operation);
    }

    public int getCacheSize() {
        return employeeCache.size();
    }

    public Set<String> getAllDepartments() {
        return new TreeSet<>(departmentIndex.keySet());
    }
}
