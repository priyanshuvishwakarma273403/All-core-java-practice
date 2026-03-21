package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        Stream<String> stream2 = Stream.of("a", "b");

        Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1);
    }
}
