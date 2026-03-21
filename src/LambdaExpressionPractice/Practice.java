package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.stream()
//                .limit(5)
//                .skip(4)
//                .forEach(System.out::println);
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println("=== PEEK EXAMPLE ===");
//        List<Integer> result = list.stream()
//                .peek(n -> System.out.println("Original: " + n))
//                .map(n -> n * 2)
//                .peek(n -> System.out.println("After map: " + n))
//                .filter(n -> n > 5)
//                .peek(n -> System.out.println("After filter: " + n))
//                .collect(Collectors.toList());
//        System.out.println("\nFinal Result: " + result);

        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        // Simple forEach
        System.out.println("=== SIMPLE FOREACH ===");
        names.stream()
                .forEach(System.out::println);

        // forEach with index
        System.out.println("\n=== WITH INDEX ===");
        IntStream.range(2, names.size())
                .forEach( i -> System.out.println(names.get(i)));

        // Custom action
        System.out.println("\n=== CUSTOM ACTION ===");
        names.stream()
                .forEach(name -> System.out.println("Hello, " + name + "!"));

        // Collect to List
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperNames+" ");


// Collect to Set
        Set<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println("Set: " + lengths);

        // Collect to Map
        Map<String, Integer> nameLength = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));
        System.out.println("Map: " + nameLength);

        // Joining strings
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // Joining with prefix and suffix
        String formatted = names.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Formatted: " + formatted);

        // Grouping by length
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped: " + grouped);

        // Partitioning (true/false)
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("Partitioned: " + partitioned);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        int product = numbers.stream()
                .reduce(1 , (a,b) -> a * b);
        System.out.println(product);

//        //Max
//        Optional<Integer> max = numbers.stream()
//                .reduce(Integer::max);
//        System.out.println(max);
//
//        Optional<Integer> min = numbers.stream()
//                .reduce(Integer::min);
//        System.out.println(min);

        List<String> words = Arrays.asList("Java", "Stream", "API");
        String concatenated = words.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println("Concatenated:" + concatenated);

        // Min
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        min.ifPresent(m -> System.out.println("Min: " + m));

        // Max
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        max.ifPresent(m -> System.out.println("Max: " + m));

        // String operations
        List<String> name = Arrays.asList("John", "Alice", "Bob", "Charlie");
        // Shortest name
        Optional<String> shortest = name.stream()
                .min(Comparator.comparing(String::length));
        shortest.ifPresent(s -> System.out.println("Shortest: " + s));

        // Longest name
        Optional<String> longest = name.stream()
                .max(Comparator.comparing(String::length));
        longest.ifPresent(s -> System.out.println("Longest: " + s));

        // anyMatch - At least one element matches
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("Has even number? " + hasEven);

        boolean hasGreaterThan15 = numbers.stream()
                .anyMatch(n -> n > 15);
        System.out.println("Has number > 15? " + hasGreaterThan15);

        // allMatch - All elements match
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All positive? " + allPositive);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("All even? " + allEven);

        // noneMatch - No element matches
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("None negative? " + noneNegative);

        boolean noneGreaterThan20 = numbers.stream()
                .noneMatch(n -> n > 20);
        System.out.println("None > 20? " + noneGreaterThan20);

        // String examples
        List<String> word = Arrays.asList("apple", "banana", "cherry");
        boolean anyStartsWithA = word.stream()
                .anyMatch(w -> w.startsWith("a"));
        System.out.println("\nAny starts with 'a'? " + anyStartsWithA);

        boolean allLowercase = word.stream()
                .allMatch(w -> w.equals(w.toLowerCase()));
        System.out.println("All lowercase? " + allLowercase);

        Optional<Integer> anyGreater =  numbers.stream()
                .filter( n-> n >5)
                .findAny();
        anyGreater.ifPresent(System.out::println);

        // String example
        List<String> names1 = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Optional<String> firstLong = names1.stream()
                .filter( n-> n.length() > 4)
                .findFirst();
        firstLong.ifPresent(System.out::println);

    }
}
