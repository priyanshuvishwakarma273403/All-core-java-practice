package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class Employee1{
    private String name;
    private String department;
    private int age;
    private double salary;

    public Employee1(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("%s (%s, $%.0f)", name, department, salary);
    }
}

public class GroupingByCollector {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("John", "IT", 30, 75000),
                new Employee1("Alice", "HR", 28, 60000),
                new Employee1("Bob", "IT", 35, 85000),
                new Employee1("Charlie", "Finance", 32, 70000),
                new Employee1("Diana", "IT", 29, 65000),
                new Employee1("Eve", "HR", 31, 55000),
                new Employee1("Frank", "Finance", 40, 90000),
                new Employee1("Grace", "IT", 27, 62000)
        );

        // === Simple grouping by department ===
        System.out.println("=== GROUP BY DEPARTMENT ===");
        Map<String, List<Employee1>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment));
        byDepartment.forEach((dept, empList) -> {
            System.out.println("\n" + dept + ":");
            empList.forEach(System.out::println);
        });

        // === Grouping with counting ===
        System.out.println("\n\n=== COUNT BY DEPARTMENT ===");
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.counting()
                ));
        countByDept.forEach((dept, count) -> {
            System.out.println(dept + ": " + count + " employees");
        });

        // === Grouping with summing ===
        System.out.println("\n=== TOTAL SALARY BY DEPARTMENT ===");
        Map<String, Double> salaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.summingDouble(Employee1::getSalary)
                ));
        salaryByDept.forEach((dept, total) ->
                System.out.printf("%s: $%.2f%n", dept, total));

        // === Grouping with averaging ===
        System.out.println("\n=== AVERAGE SALARY BY DEPARTMENT ===");
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.averagingDouble(Employee1::getSalary)
                ));
        avgSalaryByDept.forEach((dept, avg) -> System.out.printf("%s: $%.2f%n", dept, avg));

        // === Grouping by age range ===
        System.out.println("\n=== GROUP BY AGE RANGE ===");
        Map<String, List<Employee1>> byAgeRange = employees.stream()
                .collect(Collectors.groupingBy(emp -> {
                    if (emp.getAge() < 30) return "20-29";
                    else if (emp.getAge() < 35) return "30-34";
                    else return "35+";
                }));

        byAgeRange.forEach((range, empList) -> {
            System.out.println("\n" + range + ":");
            empList.forEach(e -> System.out.println("  " + e.getName() + " (Age: " + e.getAge() + ")"));

        });

        // === Multi-level grouping ===
        System.out.println("\n\n=== MULTI-LEVEL GROUPING ===");
        System.out.println("(Department -> Age Range)");

        Map<String, Map<String, List<Employee1>>> multiLevel = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.groupingBy(emp -> {
                            if (emp.getAge() < 30) return "Junior";
                            else if (emp.getAge() < 35) return "Mid";
                            else return "Senior";
                        })
                ));

        multiLevel.forEach((dept, ageMap) -> {
            System.out.println("\n" + dept + ":");
            ageMap.forEach((level, empList) -> {
                System.out.println("  " + level + ":");
                empList.forEach(e -> System.out.println("    " + e.getName()));
            });
        });

        // === Collecting names only ===
        System.out.println("\n\n=== EMPLOYEE NAMES BY DEPARTMENT ===");
        Map<String , List<String>> namesByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.mapping(Employee1::getName, Collectors.toList())
                ));
        namesByDept.forEach((dept, names) ->
                System.out.println(dept + ": " + names));

        // === Get highest paid employee per department ===
        System.out.println("\n=== HIGHEST PAID PER DEPARTMENT ===");
        Map<String , Optional<Employee1>> topEarners = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee1::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee1::getSalary))
                ));
        topEarners.forEach((dept, optEmp) -> {
            optEmp.ifPresent(emp ->
                    System.out.printf("%s: %s ($%.0f)%n", dept, emp.getName(), emp.getSalary()));
        });




    }
}
