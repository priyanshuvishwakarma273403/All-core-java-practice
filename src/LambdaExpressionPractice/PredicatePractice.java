package LambdaExpressionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PredicatePractice {
    public static void main(String[] args) {
//        Predicate<Integer> isSum = x -> x % 2 == 0;
//        System.out.println(isSum.test(12));

//        Predicate<String> isLong =  s -> s.length() >= 5;
//        System.out.println(isLong.test("Java Developer"));

//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.stream()
//                .filter( n -> n % 2 == 0)
//                .forEach(System.out::println);

//        Predicate<Integer> p1 = n -> n > 10;
//        Predicate<Integer> p2 = n -> n % 2 == 0;
//
//        Predicate<Integer> p3 = p1.and(p2);
//        System.out.println(p3.test(10));

//        Function
//        Function<Integer, String> toString = n -> "Number: "+n;
//        System.out.println(toString.apply(10));

//        Consumer
//        Consumer<String> printer = s -> System.out.println(s);
//        printer.accept("Hello Java");

//        small example to get better understanding
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.stream()
//                .filter( n -> n > 2)
//                .map(n -> n * 2)
//                .forEach(System.out::println);

//        Supplier
//        Supplier<String> msg = () -> "Hello Java";
//        System.out.println(msg.get());

//        Supplier<Integer> randomNum = () -> new Random().nextInt(100);
//        System.out.println(randomNum.get());

        Supplier<Double> random = Math::random;
        Stream.generate(random)
                .limit(5)
                .forEach(System.out::println);

    }
    
}
