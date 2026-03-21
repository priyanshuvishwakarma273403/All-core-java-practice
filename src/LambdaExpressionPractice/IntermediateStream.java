package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshit","Ram","Shyam","Mohan","Ankur");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        filteredStream.forEach(System.out::println);

        long res =list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        Stream<String> sortedStream = list.stream().map(String::toUpperCase);

        Stream<String> sortedStream2 = list.stream().sorted();
        Stream<String> sortedStreamsUsingComparator = list.stream().sorted((a,b) -> a.length() - b.length());
        System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());

        System.out.println(Stream.iterate(1,x -> x +1).limit(100).count());

        Stream.iterate(1,x -> x +1).skip(10).limit(100).peek(System.out::println).count();

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());

    }
}
