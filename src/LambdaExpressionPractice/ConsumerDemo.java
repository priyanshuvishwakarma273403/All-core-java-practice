package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        printUpper.accept("Rahul");

        List<String> names = Arrays.asList("Rahul", "Shyam", "Mohan");

        Consumer<String> printName = name -> System.out.println("Hello " + name);
        names.forEach(printName);

        // Chaining consumer
        Consumer<String> c1 = str -> System.out.println(str.toUpperCase());
        Consumer<String> c2 = str -> System.out.println("- length "+str.length());
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("lambda");


    }
}
