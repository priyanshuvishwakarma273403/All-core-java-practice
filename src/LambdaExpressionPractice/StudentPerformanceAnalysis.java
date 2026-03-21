package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class StudentResult{
    private String name;
    private String subject;
    private int marks ;
    private String grade;

    public StudentResult(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private String calculateGrade(int marks) {
        if(marks >=90 ) return "A+";
        else if(marks >=80 ) return "A";
        else if(marks >=70 ) return "B";
        else if(marks >=60 ) return "C";
        else if(marks >=50 ) return "D";
        return "F";
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public int getMarks() {
        return marks;
    }
    public String getGrade() {
        return grade;
    }
}

public class StudentPerformanceAnalysis {
    public static void main(String[] args) {
        List<StudentResult> results = Arrays.asList(
                new StudentResult("Rahul", "Math", 85),
                new StudentResult("Rahul", "Science", 90),
                new StudentResult("Rahul", "English", 78),
                new StudentResult("Priya", "Math", 92),
                new StudentResult("Priya", "Science", 95),
                new StudentResult("Priya", "English", 88),
                new StudentResult("Amit", "Math", 70),
                new StudentResult("Amit", "Science", 75),
                new StudentResult("Amit", "English", 72),
                new StudentResult("Sneha", "Math", 88),
                new StudentResult("Sneha", "Science", 85),
                new StudentResult("Sneha", "English", 90)
        );

        // === Marks by student ===
        System.out.println("=== MARKS BY STUDENT ===");
        Map<String , List<Integer>> marksByStudent = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getName,
                        Collectors.mapping(StudentResult::getMarks, Collectors.toList())
                ));
        marksByStudent.forEach((name, marks) ->
                System.out.println(name + ": " + marks));

        // === Average marks by student ===
        System.out.println("\n=== AVERAGE MARKS BY STUDENT ===");
        Map<String , Double> avgByStudent = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getName,
                        Collectors.averagingInt(StudentResult::getMarks)
                ));
        avgByStudent.forEach((name , avg) ->
            System.out.printf("%s: %.2f%n", name, avg));

        // === Total marks by student ===
        System.out.println("\n=== TOTAL MARKS BY STUDENT ===");
        Map<String ,Integer> totalByStudent = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getName,
                        Collectors.summingInt(StudentResult::getMarks)
                ));
        totalByStudent.forEach((name , total ) -> System.out.println(name + " "+ total ));

        // === Subject-wise average ===
        System.out.println("\n=== SUBJECT-WISE AVERAGE ===");
        Map<String, Double>  avgBySubject = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getSubject,
                        Collectors.averagingInt(StudentResult::getMarks)
                ));
        avgBySubject.forEach((subject , avg) ->    System.out.printf("%s: %.2f%n", subject, avg));

        // === Grade distribution ===
        System.out.println("\n=== GRADE DISTRIBUTION ===");
        Map<String , Long> gradeCount = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getGrade,
                        Collectors.counting()
                ));
        gradeCount.forEach((grade , count) -> System.out.println(grade + " " + count));

        // === Subjects taken by each student ===
        System.out.println("\n=== SUBJECTS BY STUDENT ===");
        Map<String , List<String>> subjectsByStudent = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getName,
                        Collectors.mapping(StudentResult::getSubject, Collectors.toList())
                ));
        subjectsByStudent.forEach((name , subjects) -> System.out.println(name + " " + subjects));


        // === Performance summary ===
        System.out.println("\n=== PERFORMANCE SUMMARY ===");
        Map<String, IntSummaryStatistics> summaryByStudent = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getName,
                        Collectors.summarizingInt(StudentResult::getMarks)
                ));
        summaryByStudent.forEach((name , stats) -> {
            System.out.println("\n" + name + ":");
            System.out.println("  Subjects: " + stats.getCount());
            System.out.println("  Total: " + stats.getSum());
            System.out.printf("  Average: %.2f%n", stats.getAverage());
            System.out.println("  Lowest: " + stats.getMin());
            System.out.println("  Highest: " + stats.getMax());
        });

        // === Top performer per subject ===
        System.out.println("\n\n=== TOP PERFORMER PER SUBJECT ===");
        Map<String , Optional<StudentResult>> topPerSubject = results.stream()
                .collect(Collectors.groupingBy(
                        StudentResult::getSubject,
                        Collectors.maxBy(Comparator.comparing(StudentResult::getMarks))
                ));
        topPerSubject.forEach((subject , optResult) -> {
            optResult.ifPresent(r ->
                    System.out.printf("%s: %s (%d marks)%n", subject, r.getName(), r.getMarks()));
        });

        // === Overall topper ===
        System.out.println("\n=== OVERALL TOPPER ===");
        avgByStudent.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.printf("%s with average %.2f%n", entry.getKey(), entry.getValue()));
    }
}
