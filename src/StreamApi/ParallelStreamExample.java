package StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Sequential stream
        long startSeq = System.currentTimeMillis();
        int sumSeq = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long endSeq = System.currentTimeMillis();
        System.out.println("Sequential Sum: " + sumSeq);
        System.out.println("Time: " + (endSeq - startSeq) + "ms");

        // Parallel stream
        long startPar = System.currentTimeMillis();
        int sumPar = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        long endPar = System.currentTimeMillis();
        System.out.println("\nParallel Sum: " + sumPar);
        System.out.println("Time: " + (endPar - startPar) + "ms");

        // Large dataset example
        System.out.println("\n=== LARGE DATASET ===");
        List<Integer> largeList = IntStream.rangeClosed(1, 10000000)
                .boxed()
                .collect(Collectors.toList());
        // Sequential
        long start1 = System.currentTimeMillis();
        long count1 = largeList.stream()
                .filter(n -> n % 2 == 0)
                .count();
        long end1 = System.currentTimeMillis();

        System.out.println("Sequential - Count: " + count1 + ", Time: " + (end1 - start1) + "ms");

        // Parallel
        long start2 = System.currentTimeMillis();
        long count2 = largeList.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();
        long end2 = System.currentTimeMillis();
        System.out.println("Parallel - Count: " + count2 + ", Time: " + (end2 - start2) + "ms");
    }
}
