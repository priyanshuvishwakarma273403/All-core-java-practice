package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("David", 78);
        System.out.println("HashMap: " + scores);

        System.out.println("\nAlice's score: " + scores.get("Alice"));

        System.out.println("Contains Bob? " + scores.containsKey("Bob"));
        System.out.println("Contains score 92? " + scores.containsValue(92));

        scores.put("Bob", 90); // Replaces old value
        System.out.println("Bob's updated score: " + scores.get("Bob"));

        scores.putIfAbsent("Eve", 88);
        scores.putIfAbsent("Alice", 100); // Won't update
        System.out.println("\nAfter putIfAbsent: " + scores);

        scores.remove("David");
        System.out.println("After removing David: " + scores);

        System.out.println("\nIterating entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nAll keys:");
        for (String key : scores.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println("\n\nAll values:");
        for (Integer value : scores.values()) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nSize: " + scores.size());

    }
}
