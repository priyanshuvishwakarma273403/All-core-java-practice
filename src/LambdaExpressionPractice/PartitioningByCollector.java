package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class Students{
    private String name;
    private int marks;
    private String gender;
    public Students(String name, int marks, String gender) {
        this.name = name;
        this.marks = marks;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class PartitioningByCollector {
    public static void main(String[] args) {

        List<Students> students = Arrays.asList(
                new Students("Rahul", 85, "Male"),
                new Students("Priya", 92, "Female"),
                new Students("Amit", 65, "Male"),
                new Students("Sneha", 88, "Female"),
                new Students("Vijay", 45, "Male"),
                new Students("Kavita", 78, "Female"),
                new Students("Ravi", 95, "Male"),
                new Students("Meera", 72, "Female")
        );

        // === Simple partitioning - Pass/Fail (>= 70) ===
        System.out.println("=== PASS/FAIL PARTITION ===");
        Map<Boolean , List<Students>> passFail = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() >= 70));
        System.out.println("\nPASSED:");
        passFail.get(true).forEach(System.out::println);

        System.out.println("\nFAILED:");
        passFail.get(false).forEach(s -> System.out.println("  " + s));

        // === Partition with counting ===
        System.out.println("\n\n=== COUNT: PASS/FAIL ===");
        Map<Boolean,Long> passFailCount = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getMarks() >= 70,
                        Collectors.counting()
                ));
        System.out.println("Passed: " + passFailCount.get(true));
        System.out.println("Failed: " + passFailCount.get(false));

        // === Partition with averaging ===
        System.out.println("\n=== AVERAGE MARKS: PASS/FAIL ===");
        Map<Boolean,Double> avgMarks = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getMarks() >= 70,
                        Collectors.averagingInt(Students::getMarks)
                ));
        System.out.printf("Passed average: %.2f%n", avgMarks.get(true));
        System.out.printf("Failed average: %.2f%n", avgMarks.get(false));

        // === Partition by gender ===
        System.out.println("\n=== HIGH ACHIEVERS BY GENDER (>= 85) ===");
        Map<Boolean ,List<Students>> highAchievers = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getMarks() >= 85
                ));
        System.out.println("\nHigh achievers:");
        highAchievers.get(true).forEach(s -> System.out.println("  " + s));
        System.out.println("\nOthers:");
        highAchievers.get(false).forEach(s -> System.out.println("  " + s));

        // === Partition with max ===
        System.out.println("\n\n=== TOPPER IN EACH PARTITION ===");
        Map<Boolean, Optional<Students>> toppers = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getMarks() >= 70,
                        Collectors.maxBy(Comparator.comparing(Students::getMarks))
                ));
        System.out.print("Topper (Passed): ");
        toppers.get(true).ifPresent(s -> System.out.println(s.getName() + " - " + s.getMarks()));
        System.out.print("Topper (Failed): ");
        toppers.get(false).ifPresent(s -> System.out.println(s.getName() + " - " + s.getMarks()));

        // === Practical example: Even/Odd numbers ===
        System.out.println("\n\n=== EVEN/ODD PARTITION ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean , List<Integer>> evenOdd = numbers.stream()
                .collect(Collectors.partitioningBy( n -> n % 2 ==0 ));
        System.out.println("Even: " + evenOdd.get(true));
        System.out.println("Odd: " + evenOdd.get(false));

        // === Statistics for each partition ===
        System.out.println("\n=== MARKS STATISTICS BY PARTITION ===");
        Map<Boolean , IntSummaryStatistics> stats = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.getMarks() >= 70,
                        Collectors.summarizingInt(Students::getMarks)
                ));
        System.out.println("\nPassed students statistics:");
        IntSummaryStatistics passStats = stats.get(true);
        System.out.println("  Count: " + passStats.getCount());
        System.out.println("  Average: " + passStats.getAverage());
        System.out.println("  Min: " + passStats.getMin());
        System.out.println("  Max: " + passStats.getMax());

        System.out.println("\nFailed students statistics:");
        IntSummaryStatistics failStats = stats.get(false);
        System.out.println("  Count: " + failStats.getCount());
        System.out.println("  Average: " + failStats.getAverage());
        System.out.println("  Min: " + failStats.getMin());
        System.out.println("  Max: " + failStats.getMax());

    }
}
