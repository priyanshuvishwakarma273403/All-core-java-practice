package LambdaExpressionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
   public int getAge() {
        return age;
   }
   public double getMarks() {
        return marks;
   }

   @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
   }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Rahul", 20, 85.5),
                new Student("Priya", 19, 92.0),
                new Student("Amit", 21, 78.5),
                new Student("Sneha", 20, 88.0),
                new Student("Vijay", 22, 95.5));

        System.out.println("=== ALL STUDENTS ===");
        students.forEach(System.out::println);

        // Filter students with marks > 85
        System.out.println("\n=== STUDENTS WITH MARKS > 85 ===");
        students.stream()
                .filter(s -> s.getMarks() >85)
                .forEach(s -> System.out.println(s.getName()+" "+s.getMarks()));

        // Sort by marks (descending)

        System.out.println("\n=== SORTED BY MARKS (DESC) ===");
        students.stream()
                .sorted((s1,s2) ->Double.compare(s2.getMarks(), s1.getMarks()))
                .forEach(s -> System.out.println(s.getName()+" "+s.getMarks()));

        // Get names of all student
        System.out.println("\n=== STUDENT NAMES ===");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        // Average mark
        double avgMarks = students.stream()
                .mapToDouble(Student::getMarks)
                .average()
                .orElse(0.0);

        System.out.println("\n=== AVERAGE MARKS ===");
        System.out.println(avgMarks);

        // Find topper
        System.out.println("\n=== TOPPER ===");
        Student topper = students.stream()
                .max(Comparator.comparingDouble(Student::getMarks))
                .orElse(null);
        System.out.println(topper);
    }
}
