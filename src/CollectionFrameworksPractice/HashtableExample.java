package CollectionFrameworksPractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Add elements
        table.put("A", 10);
        table.put("B", 20);
        table.put("C", 30);

        System.out.println("Hashtable: " + table);

        System.out.println("Value for A: " + table.get("A"));

        System.out.println("Contains key B? " + table.containsKey("B"));
        System.out.println("Contains value 20? " + table.containsValue(20));

        System.out.println("\nKeys using Enumeration:");
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + table.get(key));
        }

        // Note: Prefer ConcurrentHashMap for new code
        System.out.println("\nNote: Use ConcurrentHashMap instead for better performance");
    }
}
