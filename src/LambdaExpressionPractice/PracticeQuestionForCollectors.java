package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class Student1{
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class PracticeQuestionForCollectors {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1(101, "Rahul", 85),
                new Student1(102, "Priya", 92),
                new Student1(103, "Amit", 78),
                new Student1(104, "Sneha", 88)
        );

        // === toMap(keyMapper, valueMapper) ===
        System.out.println("=== METHOD 1: ID -> Name ===");
        Map<Integer,String> idToName = students.stream()
                .collect(Collectors.toMap(
                        Student1::getId,
                        Student1::getName
                ));
        System.out.println(idToName);

        // === toMap with student object as value ===
        System.out.println("\n=== METHOD 2: Name -> Student ===");
        Map<String, Student1> nameToStudent = students.stream()
                .collect(Collectors.toMap(
                        Student1::getName,
                        student -> student
                ));
        System.out.println(nameToStudent);

        // === toMap with marks ===
        System.out.println("\n=== METHOD 3: Name -> Marks ===");
        Map<String ,Integer> nameToMarks  = students.stream()
                .collect(Collectors.toMap(
                        Student1::getName,
                        Student1::getMarks
                ));
        System.out.println(nameToMarks);

        // === Handling duplicate keys ===
        System.out.println("\n=== METHOD 4: Handling Duplicates ===");
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");

        Map<String,Integer> wordCount = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));
        System.out.println(wordCount);

        // === TreeMap (sorted) ===
        System.out.println("\n=== METHOD 5: TreeMap (Sorted) ===");
        TreeMap<String,Integer> sortedMap = students.stream()
                .collect(Collectors.toMap(
                        Student1::getName,
                        Student1::getMarks,
                        (v1,v2) -> v1,
                        TreeMap::new
                ));
        System.out.println(sortedMap);


    }
}
