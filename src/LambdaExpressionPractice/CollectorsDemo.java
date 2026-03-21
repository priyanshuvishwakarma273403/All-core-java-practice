package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carl", "David");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        String concatenateNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenateNames);

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt( x -> x));
        System.out.println("Count: "+stats.getCount());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());

        Double average = numbers.stream().collect(Collectors.averagingInt(x->x));
        System.out.println("Average: "+average);

        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: "+count);

        List<String> words = Arrays.asList("hello", "world","java","streams","collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining())));
        TreeMap<Integer,Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.counting()));
        System.out.println(treeMap);

        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>5,Collectors.counting())));

        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));


        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));;



    }
}
