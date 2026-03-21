package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("=== PEEK EXAMPLE ===");

        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Original: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After map: " + n))
                .filter(n -> n > 5)
                .peek(n -> System.out.println("After filter: " + n))
                .collect(Collectors.toList());
        System.out.println("\nFinal Result: " + result);



//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println("Original: " + numbers);
//        // First 5 elements
//        System.out.println("\n=== FIRST 5 ELEMENTS ===");
//        numbers.stream()
//                .limit(5)
//                .forEach(System.out::println);
//
//        // Skip first 5 elements
//        System.out.println("\n=== SKIP FIRST 5 ===");
//        numbers.stream()
//                .skip(5)
//                .forEach(System.out::println);
//
//        // Pagination: Skip 3, take 3
//        System.out.println("\n=== PAGE 2 (3 items per page) ===");
//        numbers.stream()
//                .skip(3)
//                .limit(3)
//                .forEach(System.out::println);
//
//        // Get top 3 even numbers
//        System.out.println("\n=== TOP 3 EVEN NUMBERS ===");
//        numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .limit(3)
//                .forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
//        System.out.println("Original: " + numbers);
//        // Natural sorting (ascending)
//        System.out.println("\n=== ASCENDING ORDER ===");
//        numbers.stream()
//                .sorted()
//                .forEach(System.out::println);
//
//        // Descending order
//        System.out.println("\n=== DESCENDING ORDER ===");
//        numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//
//        // String sorting
//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "Diana");
//        System.out.println("\n=== SORTED NAMES ===");
//        names.stream()
//                .sorted()
//                .forEach(System.out::println);
//
//        // Sort by length
//        System.out.println("\n=== SORTED BY LENGTH ===");
//        names.stream()
//                .sorted(Comparator.comparing(String::length))
//                .forEach(System.out::println);
//
//        // Reverse alphabetical
//        System.out.println("\n=== REVERSE ALPHABETICAL ===");
//        names.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5);
//        System.out.println("Original: " + numbers);
//
//        System.out.println("\n=== UNIQUE NUMBERS ===");
//        numbers.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        // Strings
//        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
//        System.out.println("\n=== UNIQUE WORDS ===");
//        words.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        // Count unique elements
//        long uniqueCount = numbers.stream()
//                .distinct()
//                .count();
//        System.out.println("\nUnique count: " + uniqueCount);


//        // List of lists
//        List<List<Integer>> nestedList = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//
//        System.out.println("=== FLATTENED LIST ===");
//        nestedList.stream()
//                .flatMap(list -> list.stream())
//                .forEach(System.out::println);
//
//        // String split
//        List<String> sentences = Arrays.asList(
//                "Hello World",
//                "Java Programming",
//                "Stream API");
//
//        System.out.println("\n=== ALL WORDS ===");
//        sentences.stream()
//                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
//                .forEach(System.out::println);
//
//        // Array of arrays
//        String[][] array = {
//                {"A", "B"},
//                {"C", "D"},
//                {"E", "F"}
//        };
//        System.out.println("\n=== FLATTENED ARRAY ===");
//        Arrays.stream(array)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);


//        //map
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream()
//                .map(n -> n * n)
//                .forEach(System.out::println);
//
//        // String operations
//        List<String> names = Arrays.asList("john", "jane", "jack");
//        System.out.println("\n=== UPPERCASE ===");
//        names.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        names.stream()
//                .map((String::length))
//                .forEach(System.out::println);
//
//        // Object transformation
//        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");
//        items.stream()
//                .map(name -> new Fruit(name,name.length()))
//                .forEach(System.out::println);


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println("Original: " + numbers);
//        // Filter even number
//        numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .forEach(System.out::println);
//
//        // Filter numbers > 5
//        System.out.println("\n=== NUMBERS > 5 ===");
//        numbers.stream()
//                .filter(n -> n > 5)
//                .forEach(System.out::println);
//
//        System.out.println("\n=== NUMBERS > 5 ===");
//        numbers.stream()
//                .filter(n -> n < 5)
//                .forEach(System.out::println);
//
//        // String filtering
//        List<String> names = Arrays.asList("John", "Jane", "Jack", "Alice", "Bob");
//        System.out.println("\n=== NAMES STARTING WITH J ===");
//        names.stream()
//                .filter(name -> name.startsWith("J"))
//                .forEach(System.out::println);
//        System.out.println("\n=== NAMES WITH LENGTH > 4 ===");
//        names.stream()
//                .filter(name -> name.length() > 4)
//                .forEach(System.out::println);
    }
}
class Fruit {
    String name;
    int nameLength;
    Fruit(String name, int nameLength) {
        this.name = name;
        this.nameLength = nameLength;
    }
    @Override
    public String toString() {
        return name + " (length: " + nameLength + ")";
    }
}
