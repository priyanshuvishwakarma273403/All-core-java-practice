package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.stream().skip(1).toList();
        list.stream().skip(1).toList();
        list.forEach(System.out::println);

        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        boolean b = list.stream().anyMatch(x -> x % 2 ==0);
        System.out.println(b);
        boolean b1 = list.stream().anyMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch( x -> x < 0);
        System.out.println(b2);

        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        Object[] array = Stream.of(1,2,3).toArray();

        System.out.println("max : "+Stream.of(2,44,69).max((o1,o2) -> o2 - o1));
        System.out.println("min : "+ Stream.of(2,44,69).min(Comparator.naturalOrder()));

        List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("using for each with parallel stream:");
        numbers0.parallelStream().forEach(System.out::print);
        System.out.println("using for eachOrdered with parallel stream:");
        numbers0.parallelStream().forEachOrdered(System.out::print);

        List<String> names = Arrays.asList("Anna","bob","karan","johar","katmandhu");
        System.out.println(names.stream().filter(x -> x.length()>3).toList());

        List<Integer> numbers = Arrays.asList(5,2,5,7,8,3,5,1);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        String sentences = "Hello World!";
        System.out.println(sentences.chars().filter(x-> x =='1').count());

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

//        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception

    }
}
