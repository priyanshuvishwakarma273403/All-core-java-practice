package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Find first
        Optional<Integer> first = numbers.stream()
                .findFirst();
        first.ifPresent(f -> System.out.println("First: " + f));

        // Find first even
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresent(f -> System.out.println("First even: " + f));

        // Find any
        Optional<Integer> any = numbers.stream()
                .findAny();
        any.ifPresent(a -> System.out.println("Any: " + a));
        // Find any greater than 5
        Optional<Integer> anyGreater = numbers.stream()
                .filter(n -> n > 5)
                .findAny();
        anyGreater.ifPresent(a -> System.out.println("Any > 5: " + a));

        // String example
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Optional<String> firstLong = names.stream()
                .filter(n -> n.length() > 4)
                .findFirst();
        firstLong.ifPresent(n -> System.out.println("First long name: " + n));

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        // anyMatch - At least one element matches
//        boolean hasEven = numbers.stream()
//                .anyMatch(n -> n % 2 == 0);
//        System.out.println("Has even number? " + hasEven);
//
//        boolean hasGreaterThan15 = numbers.stream()
//                .anyMatch(n -> n > 15);
//        System.out.println("Has number > 15? " + hasGreaterThan15);
//        // allMatch - All elements match
//        boolean allPositive = numbers.stream()
//                .allMatch(n -> n > 0);
//        System.out.println("All positive? " + allPositive);
//
//        boolean allEven = numbers.stream()
//                .allMatch(n -> n % 2 == 0);
//        System.out.println("All even? " + allEven);
//
//        // noneMatch - No element matches
//        boolean noneNegative = numbers.stream()
//                .noneMatch(n -> n < 0);
//        System.out.println("None negative? " + noneNegative);
//        boolean noneGreaterThan20 = numbers.stream()
//                .noneMatch(n -> n > 20);
//        System.out.println("None > 20? " + noneGreaterThan20);
//
//        // String examples
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        boolean anyStartsWithA = words.stream()
//                .anyMatch(w -> w.startsWith("a"));
//        System.out.println("\nAny starts with 'a'? " + anyStartsWithA);
//
//        boolean allLowercase = words.stream()
//                .allMatch(w -> w.equals(w.toLowerCase()));
//        System.out.println("All lowercase? " + allLowercase);

//        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6);
//        // Count
//        long count = numbers.stream().count();
//        System.out.println("Count: " + count);
//
//        // Count even numbers
//        long evenCount = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .count();
//        System.out.println("Even count: " + evenCount);
//
//        // Min
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        min.ifPresent(m -> System.out.println("Min: " + m));
//        // Max
//        Optional<Integer> max = numbers.stream().max(Integer::compare);
//        max.ifPresent(m -> System.out.println("Max: " + m));
//
//        // String operations
//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
//        // Shortest name
//        Optional<String> shortest = names.stream()
//                .min(Comparator.comparing(String::length));
//        shortest.ifPresent(s -> System.out.println("Shortest: " + s));
//        // Longest name
//        Optional<String> longest = names.stream()
//                .max(Comparator.comparing(String::length));
//        longest.ifPresent(s -> System.out.println("Longest: " + s));


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        // Sum using reduce
//        int sum = numbers.stream()
//                .reduce(0, (a, b) -> a + b);
//        System.out.println("Sum: " + sum);
//
//        // Sum using method reference
//        int sum2 = numbers.stream()
//                .reduce(0, Integer::sum);
//        System.out.println("Sum (method ref): " + sum2);
//
//        // Product
//        int product = numbers.stream()
//                .reduce(1, (a, b) -> a * b);
//        System.out.println("Product: " + product);
//
//        // Max
//        Optional<Integer> max = numbers.stream()
//                .reduce((a, b) -> a > b ? a : b);
//        max.ifPresent(m -> System.out.println("Max: " + m));
//
//        // Max using Integer::max
//        Optional<Integer> max2 = numbers.stream()
//                .reduce(Integer::max);
//        max2.ifPresent(m -> System.out.println("Max (method ref): " + m));
//
//        // Min
//        Optional<Integer> min = numbers.stream()
//                .reduce(Integer::min);
//        min.ifPresent(m -> System.out.println("Min: " + m));
//
//        // String concatenation
//        List<String> words = Arrays.asList("Java", "Stream", "API");
//        String concatenated = words.stream()
//                .reduce("", (a, b) -> a + " " + b);
//        System.out.println("Concatenated:" + concatenated);

//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "Diana");
//        // Collect to List
//        List<String> upperNames = names.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println("Upper Names: " + upperNames);
//
//        // Collect to Set
//        Set<Integer> lengths = names.stream()
//                .map(String::length)
//                .collect(Collectors.toSet());
//        System.out.println("Set: " + lengths);
//
//        // Collect to Map
//        Map<String, Integer> nameLength = names.stream()
//                .collect(Collectors.toMap(
//                        name -> name,
//                        String::length
//                ));
//        System.out.println("Map: " + nameLength);
//
//        // Joining strings
//        String joined = names.stream()
//                .collect(Collectors.joining(", "));
//        System.out.println("Joined: " + joined);
//
//        // Joining with prefix and suffix
//        String formatted = names.stream()
//                .collect(Collectors.joining(", ", "[", "]"));
//        System.out.println("Formatted: " + formatted);
//
//        // Grouping by length
//        Map<Integer, List<String>> grouped = names.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println("Grouped: " + grouped);
//
//        // Partitioning (true/false)
//        Map<Boolean, List<String>> partitioned = names.stream()
//                .collect(Collectors.partitioningBy(name -> name.length() > 4));
//        System.out.println("Partitioned: " + partitioned);
//
//
//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
//        // Simple forEach
//        System.out.println("=== SIMPLE FOREACH ===");
//        names.stream()
//                .forEach(System.out::println);
//
//        // forEach with index
//        System.out.println("\n=== WITH INDEX ===");
//        IntStream.range(0, names.size())
//                .forEach(i -> System.out.println(i + ": " + names.get(i)));
//
//        // Custom action
//        System.out.println("\n=== CUSTOM ACTION ===");
//        names.stream()
//                .forEach(name -> System.out.println("Hello, " + name + "!"));
    }
}
