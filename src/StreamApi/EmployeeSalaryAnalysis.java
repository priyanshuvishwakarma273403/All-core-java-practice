package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;
    private int experience; // years

    public Employee(String name, String department, double salary, int experience) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
    @Override
    public String toString() {
        return String.format("Employee{name='%s', dept='%s', salary=%.2f, exp=%d}",
                name, department, salary, experience);
    }
}

public class EmployeeSalaryAnalysis {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 75000, 5),
                new Employee("Alice", "HR", 60000, 3),
                new Employee("Bob", "IT", 85000, 7),
                new Employee("Charlie", "Finance", 70000, 4),
                new Employee("Diana", "IT", 65000, 2),
                new Employee("Eve", "HR", 55000, 2),
                new Employee("Frank", "Finance", 80000, 6),
                new Employee("Grace", "IT", 90000, 8)
        );

        // 1. IT department employees
        System.out.println("=== IT DEPARTMENT ===");
        employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .forEach(System.out::println);

        // 2. Employees with salary > 70000
        System.out.println("\n=== SALARY > $70,000 ===");
        employees.stream()
                .filter( e -> e.getSalary() > 7000)
                .forEach(System.out::println);

        // 3. Average salary by department
        System.out.println("\n=== AVERAGE SALARY BY DEPARTMENT ===");
        Map<String,Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        avgSalary.forEach((k,v) -> System.out.printf("%s: %.2f%n", k, v));


        // 4. Highest paid employee
        System.out.println("\n=== HIGHEST PAID ===");
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        // 5. Department-wise count
        System.out.println("\n=== EMPLOYEE COUNT BY DEPARTMENT ===");
        Map<String , Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        countByDept.forEach((k,v) -> System.out.printf("%s: %d%n", k, v));

        // 6. Total payroll
        double totalPayroll = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.printf("\n=== TOTAL PAYROLL ===\n$%.2f%n", totalPayroll);

        // 7. Experienced employees (> 5 years)
        System.out.println("\n=== EXPERIENCED (5+ YEARS) ===");
        employees.stream()
                .filter(e -> e.getExperience() > 5)
                .forEach(System.out::println);

        // 8. Top 3 earners
        System.out.println("\n=== TOP 3 EARNERS ===");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

//        // 9. Department with highest average salary
//        System.out.println("\n=== DEPARTMENT WITH HIGHEST AVG SALARY ===");
//        avgSalaryByDept.entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .ifPresent(e -> System.out.printf("%s: $%.2f%n", e.getKey(), e.getValue()))l

        // 10. Salary statistics
        System.out.println("\n=== SALARY STATISTICS ===");
        DoubleSummaryStatistics stats = employees.stream()
                .mapToDouble(Employee::getSalary)
                .summaryStatistics();
        System.out.printf("Count: %d%n", stats.getCount());
        System.out.printf("Sum: $%.2f%n", stats.getSum());
        System.out.printf("Min: $%.2f%n", stats.getMin());
        System.out.printf("Average: $%.2f%n", stats.getAverage());
        System.out.printf("Max: $%.2f%n", stats.getMax());
    }
}
