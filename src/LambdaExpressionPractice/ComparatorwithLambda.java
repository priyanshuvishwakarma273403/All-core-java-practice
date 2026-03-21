//package LambdaExpressionPractice;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Employee{
//    String name;
//    int salary;
//    public Employee(String name, int salary){
//        this.name = name;
//        this.salary = salary;
//    }
//    @Override
//    public String toString(){
//        return "name: "+name+", salary: "+salary;
//    }
//}
//
//public class ComparatorwithLambda {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", 50000),
//                new Employee("Alice", 60000),
//                new Employee("Bob", 45000),
//                new Employee("Charlie", 70000)
//
//        );
//
//        System.out.println("Original List:");
//        employees.forEach(System.out::println);
//
//        employees.sort(Comparator.comparingInt(e -> e.salary));
//        System.out.println("\nSorted by Salary:");
//        employees.forEach(System.out::println);
//
//        // Sort by name
//        employees.sort(Comparator.comparing(e -> e.name));
//        System.out.println("\nSorted by Name:");
//        employees.forEach(System.out::println);
//
//    }
//}
