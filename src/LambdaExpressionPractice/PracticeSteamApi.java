package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeSteamApi {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Ram", "Shyam", "Mohan");
//        List<String> upperaname = list.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(upperaname);

        List<Integer> numbers = Arrays.asList(1, 2,2,4,5, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original numbers: " + numbers);

        // === toList() ===
        System.out.println("\n=== toList() ===");
        List<Integer> list = numbers.stream()
                .filter(n->n >2)
                .collect(Collectors.toList());
        System.out.println("List"+ list);

        // === toSet() - removes duplicates ==
        System.out.println("\n=== toSet() ===");
        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println("Set"+ set);

        // === toCollection() - specific collection type ===
        System.out.println("\n=== toCollection() ===");
        // LinkedHashSet - maintains insertion order
        LinkedHashSet<Integer> linkedSet = numbers.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("LinkedHashSet"+ linkedSet);

        // TreeSet - sorted
        TreeSet<Integer> treeSet = numbers.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet"+ treeSet);

        // ArrayList
        ArrayList<Integer> arrayList = numbers.stream()
                .filter(n->n %2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList"+ arrayList);

        // === String to List ===
        System.out.println("\n=== String Collection ===");
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        List<String> uppername = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppername);

        Set<Integer> nameLenghts = names.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println(nameLenghts);

    }
}
