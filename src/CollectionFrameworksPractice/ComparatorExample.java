package CollectionFrameworksPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s(Age:%d, Salary:%.0f)", name, age, salary);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 50000),
                new Employee("Bob", 25, 45000),
                new Employee("Charlie", 35, 60000),
                new Employee("David", 28, 48000)
        );

        Collections.sort(employees);
        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);

        Collections.sort(employees, Comparator.comparingInt(e -> e.age));
        System.out.println("\nSorted by age:");
        employees.forEach(System.out::println);

        Collections.sort(employees,
                Comparator.comparingDouble((Employee e) -> e.salary).reversed()
        );
        System.out.println("\nSorted by salary (desc):");
        employees.forEach(System.out::println);

        Collections.sort(employees,
                Comparator.comparingInt((Employee e) -> e.age)
                        .thenComparingDouble(e -> e.salary)
        );
        System.out.println("\nSorted by age, then salary:");
        employees.forEach(System.out::println);

        List<String> withNulls = Arrays.asList("A", null, "B", null, "C");
        Collections.sort(withNulls,
                Comparator.nullsLast(Comparator.naturalOrder())
        );
        System.out.println("\nWith nulls last: " + withNulls);

    }
}
