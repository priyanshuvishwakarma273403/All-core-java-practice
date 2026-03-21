package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiDemo {
    static class Employee{
        int id;
        String name;
        String dept;
        int salary;

        public Employee(int id, String name, String dept, int salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }
        public int getId() { return id; }
        public String getName() { return name; }
        public String getDept() { return dept; }
        public int getSalary() { return salary; }
        public String toString() {
            return name + " (" + dept + ", " + salary + ")";
        }
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 25, 30));
        List<Integer> result = nums.stream()
                .filter(n->n >=15)
                .map(n->n*2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

        // reduce
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        // anyMatch / allMatch
        System.out.println(nums.stream().anyMatch(n -> n >20));
        System.out.println(nums.stream().allMatch(n -> n > 0));

        // flatMap
        List<List<String>> data = List.of( List.of("Java", "Spring"),
                List.of("React", "Node"));

        List<String> flat = data.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(flat);

        List<Employee> employees = List.of( new Employee(1, "Aman", "IT", 90000),
                new Employee(2, "Ravi", "HR", 60000),
                new Employee(3, "Neha", "IT", 120000));

        Map<String, List<Employee>> byDept =employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(byDept);

    }
}
