package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ComplexStreamOperations {
    public static void main(String[] args) {
        // 1. Generate Fibonacci sequence
        System.out.println("=== FIBONACCI (10 numbers) ===");
        Stream.iterate(new int[]{0,1}, f ->  new int[]{ f[1],f[0],+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);

        // 2. Factorial using reduce
        System.out.println("\n=== FACTORIAL OF 5 ===");
        int factorial = IntStream.rangeClosed(1, 5)
                .reduce(1, (a, b) -> a * b);
        System.out.println(factorial);

        // 3. Prime numbers
        System.out.println("\n=== PRIME NUMBERS (2-50) ===");
        IntStream.rangeClosed(2, 50)
                .filter(ComplexStreamOperations::isPrime)
                .forEach(System.out::println);

        // 4. Nested list flattening
        System.out.println("\n\n=== FLATTENED NESTED LIST ===");
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattened);

        // 5. Character frequency
        System.out.println("\n=== CHARACTER FREQUENCY ===");
        String text = "hello world";
        Map<Character, Long> charFrequency = text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        charFrequency.forEach((ch, count) ->
                System.out.println(ch + ": " + count));

        // 6. Word count
        System.out.println("\n=== WORD COUNT ===");
        String sentence = "java stream api is powerful api";
        Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
        wordCount.forEach((word, count) ->
                System.out.println(word + ": " + count));

        // 7. Partition numbers
        System.out.println("\n=== PARTITION (EVEN/ODD) ===");
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even: " + partitioned.get(true));
        System.out.println("Odd: " + partitioned.get(false));

        // 8. Running sum
        System.out.println("\n=== RUNNING SUM ===");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> runningSum = new ArrayList<>();
        nums.stream()
                .reduce(0, (sum, n) -> {
                    int newSum = sum + n;
                    runningSum.add(newSum);
                    return newSum;
                });
        System.out.println(runningSum);


    }

    // Helper method to check prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
    }
