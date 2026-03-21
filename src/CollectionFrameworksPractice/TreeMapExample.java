package CollectionFrameworksPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");
        map.put(5, "Five");

        System.out.println("TreeMap (sorted): " + map);

        System.out.println("\nFirst key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Lower key than 3: " + map.lowerKey(3));
        System.out.println("Higher key than 3: " + map.higherKey(3));
        System.out.println("Floor key of 3.5: " + map.floorKey(3));
        System.out.println("Ceiling key of 3.5: " + map.ceilingKey(4));
        System.out.println("\nHeadMap (<3): " + map.headMap(3));
        System.out.println("TailMap (>=3): " + map.tailMap(3));
        System.out.println("SubMap [2, 4): " + map.subMap(2, 4));

        System.out.println("\nPoll first: " + map.pollFirstEntry());
        System.out.println("Poll last: " + map.pollLastEntry());
        System.out.println("After polls: " + map);
        System.out.println("\nDescending: " + map.descendingMap());

        TreeMap<String, Integer> reverseMap = new TreeMap<>(
                Comparator.reverseOrder()
        );

        reverseMap.put("A", 1);
        reverseMap.put("B", 2);
        reverseMap.put("C", 3);

        System.out.println("\nReverse order: " + reverseMap);

    }
}
