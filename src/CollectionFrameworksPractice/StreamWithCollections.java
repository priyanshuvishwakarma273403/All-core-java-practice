package CollectionFrameworksPractice;

import java.util.*;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    String department;
    Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString(){
        return name + "(" + age + ")";
    }
}

public class StreamWithCollections {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> squared = numbers.stream()
                .map(n -> n*n)
                .toList();
        System.out.println("Squared: " + squared);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nSum: " + sum);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("\nPartitioned: " + partitioned);

        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "IT"),
                new Person("Bob", 30, "HR"),
                new Person("Charlie", 25, "IT"),
                new Person("David", 35, "Finance")
        );

        Map<String, List<Person>> byDept = people.stream()
                .collect(Collectors.groupingBy(p -> p.department));
        System.out.println("\nBy department: " + byDept);


        Map<String, Long> deptCount = people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.department,
                        Collectors.counting()
                ));
        System.out.println("Department count: " + deptCount);

        Map<String, Double> avgAge = people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.department,
                        Collectors.averagingInt(p -> p.age)
                ));
        System.out.println("Average age by dept: " + avgAge);

        String names = people.stream()
                .map(p -> p.name)
                .collect(Collectors.joining(", "));
        System.out.println("\nAll names: " + names);

        Set<String> depts = people.stream()
                .map(p -> p.department)
                .collect(Collectors.toSet());
        System.out.println("Unique departments: " + depts);

        TreeSet<String> sortedNames = people.stream()
                .map(p -> p.name)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Sorted names: " + sortedNames);

    }
}

