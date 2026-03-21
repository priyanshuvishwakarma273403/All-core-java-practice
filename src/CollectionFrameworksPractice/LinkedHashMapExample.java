package CollectionFrameworksPractice;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> insertionOrder = new LinkedHashMap<>();
        insertionOrder.put("Third", 3);
        insertionOrder.put("First", 1);
        insertionOrder.put("Second", 2);
        insertionOrder.put("Fourth", 4);

        System.out.println("Insertion order: " + insertionOrder);

        LinkedHashMap<String, String> accessOrder = new LinkedHashMap<>(
                16, 0.75f, true // initialCapacity, loadFactor, accessOrder
        );
        accessOrder.put("A", "Apple");
        accessOrder.put("B", "Banana");
        accessOrder.put("C", "Cherry");

        System.out.println("\nInitial: " + accessOrder);
        accessOrder.get("A");
        System.out.println("After accessing A: " + accessOrder);
        accessOrder.get("B");
        System.out.println("After accessing B: " + accessOrder);

        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println("\nLRU Cache: " + cache);
        cache.get(1); // Access 1
        cache.put(4, "Four"); // Evicts least recently used (2)
        System.out.println("After adding 4: " + cache);

    }
}
