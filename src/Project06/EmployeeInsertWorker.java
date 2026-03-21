package Project06;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class EmployeeInsertWorker implements Runnable {
    private final EmployeeService service;
    private final String department;
    private final int count;
    private final CountDownLatch latch;

    public EmployeeInsertWorker(EmployeeService service, String department, int count, CountDownLatch latch) {
        this.service = service;
        this.department = department;
        this.count = count;
        this.latch = latch;
    }

    @Override
    public void run(){
        Random random = new  Random();
        String threadName = Thread.currentThread().getName();

        for(int i =0; i< count; i++){
            Employee emp = new Employee(
                    0,
                    "Employee_" + threadName + "_" + i,
                    department,
                    30000 + random.nextInt(70000),
                    "emp_" + threadName.toLowerCase() + "_" + i + "@company.com"
            );

            boolean success = service.addEmployee(emp);
            if(success){
                System.out.println(threadName + " inserted: "+emp.getName());
            }

            try{
                Thread.sleep(random.nextInt(50)); // Simulate work
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        latch.countDown();
        System.out.println(threadName + " completed insertions");
    }
}

class EmployeeUpdateWorker implements Runnable{
    private final EmployeeService service;
    private final CountDownLatch latch;
    private final CyclicBarrier barrier;

    public EmployeeUpdateWorker(EmployeeService service, CountDownLatch latch, CyclicBarrier barrier){
        this.service = service;
        this.latch = latch;
        this.barrier = barrier;
    }

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        Random random = new  Random();

        try{
            barrier.await();
            List<Employee> employees = (List<Employee>) service.getAllEmployees();
            for(Employee emp : employees){
                if (random.nextInt(100) < 30) { // 30% chance to update
                    emp.setSalary(emp.getSalary() * 1.1); // 10% raise
                    service.updateEmployee(emp);
                    System.out.println(threadName + " updated: " + emp.getName());
                    Thread.sleep(random.nextInt(30));
                }
             }
        } catch (Exception e){
            System.err.println(threadName + " error: " + e.getMessage());
        } finally{
            latch.countDown();
            System.out.println(threadName + " completed updates");
        }
    }
}

class EmployeeQueryWorker implements Runnable{
    private final EmployeeService service;
    private final CountDownLatch latch;

    public EmployeeQueryWorker(EmployeeService service, CountDownLatch latch){
        this.service = service;
        this.latch = latch;
    }

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        Random random = new Random();
        try{
            for(int i =0; i< 10; i++){
                int operation = random.nextInt(5);
                switch (operation){
                    case 0:
                        List<Employee> allEmps = (List<Employee>) service.getAllEmployees();
                        System.out.println(threadName + " queried: "+allEmps.size() + " employees");
                        break;
                    case 1:
                        List<Employee> topPaid = service.getTopPaidEmployees(5);
                        System.out.println(threadName + " queried top 5 paid employees");
                        break;
                    case 2:
                        String[] depts = {"IT", "HR", "Finance", "Sales", "Marketing"};
                        String dept = depts[random.nextInt(depts.length)];
                        List<Employee> deptEmps = service.getEmployeesByDepartment(dept);
                        System.out.println(threadName + " queried " + dept + ": " + deptEmps.size() + " employees");
                        break;
                    case 3:
                        var stats = service.getDepartmentStatistics();
                        System.out.println(threadName + " calculated department statistics");
                        break;
                    case 4:
                        List<Employee> salaryRange = service.getEmployeesBySalaryRange(40000, 60000);
                        System.out.println(threadName + " queried salary range: " + salaryRange.size() + " employees");
                        break;
                }
                Thread.sleep(random.nextInt(100));
            }
        } catch (Exception e){
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
            System.out.println(threadName + " completed queries");
        }
    }
}

class EmployeeDeleteWorker implements Runnable{
    private final EmployeeService service;
    private final CountDownLatch latch;

    public EmployeeDeleteWorker(EmployeeService service, CountDownLatch latch) {
        this.service = service;
        this.latch = latch;
    }

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        Random random = new Random();

        try {
            Thread.sleep(2000);

            List<Employee> employees = (List<Employee>) service.getAllEmployees();

            for (Employee emp : employees) {
                if (random.nextInt(100) < 10) { // 10% chance to delete
                    service.deleteEmployee(emp.getId());
                    System.out.println(threadName + " deleted: " + emp.getName());
                    Thread.sleep(random.nextInt(50));
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
            System.out.println(threadName + " completed deletions");
        }
    }
}
