package LambdaExpressionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaPractice {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Runnable Interface");
        r.run();

        Consumer<String> print = System.out::println;
        print.accept("Lambda with one parameter");

        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println("Sum: "+ add.apply(1, 2));

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(" Is Even ? : "+ even.test(2));
        System.out.println(" Is Even ? : "+ even.test(5));

        Function <Integer,String> checkAge = age -> age >= 18 ? "Adult" : "Minor";
        System.out.println("Check Age : "+ checkAge.apply(15));

        Consumer<Integer> sqr = n -> System.out.println("Square Root : " + (n*n));
        sqr.accept(5);

        Supplier<Double> random = Math::random;
        System.out.println("Random Number : "+ random.get());

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(System.out::print);
        System.out.println();

        list.stream()
                .filter(e -> e % 2 == 0)
                .map( e-> e*e)
                .forEach(System.out::print);

        System.out.println();

        List<String> word = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        word.stream()
                .filter(s-> s.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();

        List<String> name = new ArrayList<>(Arrays.asList("Ram","Shyam","Mohan"));
        name.sort(String::compareTo);
        System.out.println(name);

        Calculato1 calc = (d,e) -> d * e;
        System.out.println("Multiply "+ calc.calculate(5,4));
    }
}
interface Calculato1{
    int calculate(int a, int b);
}
