package CollectionFrameworksPractice;

import java.util.HashMap;

public class HashMapAdvance {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.compute("A" ,(K,V) -> V +5);
        System.out.println("After compute: " + map);

        map.computeIfAbsent("B", key -> 20);
        System.out.println("After computeIfAbsent: " + map);

        map.computeIfPresent("A", (key, value) -> value * 2);
        System.out.println("After computeIfPresent: " + map);

        map.put("C", 15);
        map.merge("C", 5, Integer::sum); // C = 15 + 5
        System.out.println("After merge: " + map);

        System.out.println("\nGet D (default 0): " + map.getOrDefault("D", 0));
        map.replace("A", 100);
        map.replaceAll((key, value) -> value + 10);
        System.out.println("After replaceAll: " + map);

        String text = "hello world hello";
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : text.split(" ")) {
            wordCount.merge(word, 1, Integer::sum);
        }

        System.out.println("\nWord count: " + wordCount);

        HashMap<Integer, Integer> numberGroups = new HashMap<>();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numbers) {
            int key = num % 2; // Group by even/odd
            numberGroups.merge(key, num, Integer::sum);
        }

        System.out.println("\nSum by group (0=even, 1=odd): " + numberGroups);


    }
}
