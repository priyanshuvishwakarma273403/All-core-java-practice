package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private String grade;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(String name, int age, String grade, double marks) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, grade='%s', marks=%.2f}",
                name, age, grade, marks);
    }
}

public class StudentsGradeSyatem {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Rahul", 20, "A", 85.5),
                new Student("Priya", 19, "A", 92.0),
                new Student("Amit", 21, "B", 78.5),
                new Student("Sneha", 20, "A", 88.0),
                new Student("Vijay", 22, "C", 65.5),
                new Student("Kavita", 19, "B", 75.0),
                new Student("Ravi", 21, "A", 95.0),
                new Student("Meera", 20, "B", 72.5)
        );

        System.out.println("=== ALL STUDENTS ===");
        students.forEach(System.out::println);
        // 1. Students with grade A
        System.out.println("\n=== GRADE A STUDENTS ===");
        students.stream()
                .filter(s -> "A".equals(s.getGrade()))
                .forEach(System.out::println);

        // 2. Top 3 students by marks
        System.out.println("\n=== TOP 3 STUDENTS ===");
        students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .limit(3)
                .forEach(System.out::println);
        // 3. Average marks
        double avgMarks = students.stream()
                .mapToDouble(Student::getMarks)
                .average()
                .orElse(0.0);
        System.out.println("\n=== AVERAGE MARKS ===");
        System.out.printf("Average: %.2f%n", avgMarks);

        // 4. Students above average
        System.out.println("\n=== ABOVE AVERAGE STUDENTS ===");
        students.stream()
                .filter(s -> s.getMarks() > avgMarks)
                .forEach(System.out::println);

        // 5. Count by grade
        System.out.println("\n=== COUNT BY GRADE ===");
        Map<String, Long> gradeCount = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));
        gradeCount.forEach((grade, count) ->
                System.out.println(grade + ": " + count));

        // 6. Students grouped by grade
        System.out.println("\n=== GROUPED BY GRADE ===");
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        grouped.forEach((grade, list) -> {
            System.out.println("\nGrade " + grade + ":");
            list.forEach(System.out::println);
        });

        // 7. Total marks by grade
        System.out.println("\n=== TOTAL MARKS BY GRADE ===");
        Map<String, Double> totalByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.summingDouble(Student::getMarks)
                ));
        totalByGrade.forEach((grade, total) ->
                System.out.printf("%s: %.2f%n", grade, total));

        // 8. Student names only
        System.out.println("\n=== STUDENT NAMES ===");
        List<String> names = students.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);
        // 9. Pass/Fail (marks >= 70 is pass)
        System.out.println("\n=== PASS/FAIL ===");
        Map<Boolean, List<Student>> passFail = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() >= 70));
        System.out.println("PASSED:");
        passFail.get(true).forEach(System.out::println);
        System.out.println("\nFAILED:");
        passFail.get(false).forEach(System.out::println);

        // 10. Highest marks
        System.out.println("\n=== TOPPER ===");
        students.stream()
                .max(Comparator.comparing(Student::getMarks))
                .ifPresent(System.out::println);
    }
}
