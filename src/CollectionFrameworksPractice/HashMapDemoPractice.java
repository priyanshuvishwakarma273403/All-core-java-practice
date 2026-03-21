package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemoPractice {
    public static void main(String[] args) {
        System.out.println("=== HashMap Method Demonstrations ===\n");

        // HashMap instance methods
        demonstrateBasicOperations();
        demonstrateComputeMethods();
        demonstrateReplaceMethods();
        demonstrateViewMethods();
//        demonstrateIterationMethods();
//        demonstrateCloneMethod();

        // Methods from AbstractMap
//        demonstrateAbstractMapMethods();

        // Methods from Object
//        demonstrateObjectMethods();

        // Practical examples
//        demonstratePracticalExamples();
    }

    public static void demonstrateBasicOperations() {
        System.out.println("=== Basic HashMap Operations ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("--- put(K key, V value) ---");
        Integer prev1 = map.put("Apple", 10);
        Integer prev2 = map.put("Banana", 20);
        Integer prev3 = map.put("Cherry", 30);
        System.out.println("Put Apple=10: previous value = " + prev1);
        System.out.println("Put Banana=20: previous value = " + prev2);
        System.out.println("Put Cherry=30: previous value = " + prev3);
        System.out.println("Map: " + map);

        // Updating existing key
        Integer prev4 = map.put("Apple", 15);
        System.out.println("Put Apple=15 (update): previous value = " + prev4);
        System.out.println("Map: " + map);
        System.out.println();

        // 2. putAll(Map<? extends K, ? extends V> m)
        System.out.println("--- putAll(Map<? extends K, ? extends V> m) ---");
        HashMap<String, Integer> newItems = new HashMap<>();
        newItems.put("Date", 40);
        newItems.put("Elderberry", 50);
        map.putAll(newItems);
        System.out.println("After putAll: " + map);
        System.out.println();

        // 3. putIfAbsent(K key, V value)
        System.out.println("--- putIfAbsent(K key, V value) ---");
        Integer result1 = map.putIfAbsent("Fig", 60);
        System.out.println("putIfAbsent Fig=60: " + result1 + " (null means added)");

        Integer result2 = map.putIfAbsent("Apple", 100);
        System.out.println("putIfAbsent Apple=100: " + result2 + " (existing value returned)");
        System.out.println("Map: " + map);
        System.out.println();

        // 4. get(Object key)
        System.out.println("--- get(Object key) ---");
        Integer value1 = map.get("Apple");
        Integer value2 = map.get("Grape");
        System.out.println("get('Apple'): " + value1);
        System.out.println("get('Grape'): " + value2 + " (null - key doesn't exist)");
        System.out.println();

        // 5. getOrDefault(Object key, V defaultValue)
        System.out.println("--- getOrDefault(Object key, V defaultValue) ---");
        Integer value3 = map.getOrDefault("Apple", 0);
        Integer value4 = map.getOrDefault("Grape", 0);
        System.out.println("getOrDefault('Apple', 0): " + value3);
        System.out.println("getOrDefault('Grape', 0): " + value4);
        System.out.println();

        // 6. containsKey(Object key)
        System.out.println("--- containsKey(Object key) ---");
        System.out.println("containsKey('Apple'): " + map.containsKey("Apple"));
        System.out.println("containsKey('Grape'): " + map.containsKey("Grape"));
        System.out.println();

        // 7. containsValue(Object value)
        System.out.println("--- containsValue(Object value) ---");
        System.out.println("containsValue(15): " + map.containsValue(15));
        System.out.println("containsValue(999): " + map.containsValue(999));
        System.out.println();

        // 8. size()
        System.out.println("--- size() ---");
        System.out.println("Map size: " + map.size());
        System.out.println();

        // 9. isEmpty()
        System.out.println("--- isEmpty() ---");
        System.out.println("Is map empty: " + map.isEmpty());
        HashMap<String, Integer> emptyMap = new HashMap<>();
        System.out.println("Is empty map empty: " + emptyMap.isEmpty());
        System.out.println();

        // 10. remove(Object key)
        System.out.println("--- remove(Object key) ---");
        Integer removed1 = map.remove("Date");
        Integer removed2 = map.remove("Grape");
        System.out.println("Removed 'Date': " + removed1);
        System.out.println("Removed 'Grape': " + removed2 + " (null - key didn't exist)");
        System.out.println("Map after removes: " + map);
        System.out.println();

        // 11. remove(Object key, Object value)
        System.out.println("--- remove(Object key, Object value) ---");
        boolean removed3 = map.remove("Apple", 15);
        boolean removed4 = map.remove("Banana", 999);
        System.out.println("remove('Apple', 15): " + removed3 + " (matched)");
        System.out.println("remove('Banana', 999): " + removed4 + " (value didn't match)");
        System.out.println("Map: " + map);
        System.out.println();

        // 12. clear()
        System.out.println("--- clear() ---");
        HashMap<String, Integer> tempMap = new HashMap<>(map);
        System.out.println("Before clear - size: " + tempMap.size());
        tempMap.clear();
        System.out.println("After clear - size: " + tempMap.size());
        System.out.println("Is empty: " + tempMap.isEmpty());
        System.out.println();

    }

    public static void  demonstrateComputeMethods() {
        System.out.println("=== Compute Methods ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial map: " + map);
        System.out.println();

        // Compute for existing key
        Integer result1 = map.compute("Apple", (key, value) -> {
            System.out.println("  Computing for key: " + key + ", current value: " + value);
            return value == null ? 1 : value * 2;
        });
        System.out.println("compute('Apple', v -> v*2): " + result1);

        // Compute for non-existing key
        Integer result2 = map.compute("Date", (key, value) -> {
            System.out.println("  Computing for key: " + key + ", current value: " + value);
            return value == null ? 1 : value * 2;
        });
        System.out.println("compute('Date', v -> v*2): " + result2);

        // Compute returning null (removes entry)
        Integer result3 = map.compute("Banana", (key, value) -> null);
        System.out.println("compute('Banana', returns null): " + result3 + " (entry removed)");

        System.out.println("Map after compute operations: " + map);
        System.out.println();


        // 2. computeIfAbsent(K key, Function<? super K, extends V> mappingFunction)
        System.out.println("--- computeIfAbsent(K key, Function mappingFunction) ---");
        // Compute for non-existing key
        Integer result4 = map.computeIfAbsent("Elderberry", key -> {
            System.out.println("  Computing for new key: " + key);
            return 50;
        });
        System.out.println("computeIfAbsent('Elderberry', k -> 50): " + result4);

        // Try to compute for existing key (function not called)
        Integer result5 = map.computeIfAbsent("Apple", key -> {
            System.out.println("  This should not print");
            return 999;
        });
        System.out.println("computeIfAbsent('Apple', k -> 999): " + result5 + " (existing value)");

        System.out.println("Map: " + map);
        System.out.println();

        // 3. computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        System.out.println("--- computeIfPresent(K key, BiFunction remappingFunction) ---");

        // Compute for existing key
        Integer result6 = map.computeIfPresent("Cherry", (key, value) -> {
            System.out.println("  Computing for key: " + key + ", value: " + value);
            return value + 5;
        });
        System.out.println("computeIfPresent('Cherry', (k,v) -> v+5): " + result6);

        // Try to compute for non-existing key (function not called)
        Integer result7 = map.computeIfPresent("Fig", (key, value) -> {
            System.out.println("  This should not print");
            return 999;
        });
        System.out.println("computeIfPresent('Fig', (k,v) -> 999): " + result7 + " (key doesn't exist)");

        // Compute returning null (removes entry)
        Integer result8 = map.computeIfPresent("Elderberry", (key, value) -> null);
        System.out.println("computeIfPresent('Elderberry', returns null): " + result8 + " (entry removed)");

        System.out.println("Map: " + map);
        System.out.println();

        // 4. merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        System.out.println("--- merge(K key, V value, BiFunction remappingFunction) ---");

        // Merge with existing key
        Integer result9 = map.merge("Apple", 5, (oldValue, newValue) -> {
            System.out.println("  Merging: old=" + oldValue + ", new=" + newValue);
            return oldValue + newValue;
        });
        System.out.println("merge('Apple', 5, (old,new) -> old+new): " + result9);

        // Merge with non-existing key (value is directly put)
        Integer result10 = map.merge("Fig", 60, (oldValue, newValue) -> {
            System.out.println("  This should not print for new key");
            return oldValue + newValue;
        });
        System.out.println("merge('Fig', 60, (old,new) -> old+new): " + result10 + " (new entry)");

//        / Merge returning null (removes entry)
        Integer result11 = map.merge("Cherry", 0, (oldValue, newValue) -> null);
        System.out.println("merge('Cherry', 0, returns null): " + result11 + " (entry removed)");

        System.out.println("Map after merge operations: " + map);
        System.out.println();
    }

    public static void demonstrateReplaceMethods(){
        System.out.println("=== Replace Methods ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial map: " + map);
        System.out.println();

        // 1. replace(K key, V value)
        System.out.println("--- replace(K key, V value) ---");
        Integer replaced1 = map.replace("Apple", 15);
        Integer replaced2 = map.replace("Date", 40);
        System.out.println("replace('Apple', 15): " + replaced1 + " (old value)");
        System.out.println("replace('Date', 40): " + replaced2 + " (null - key doesn't exist)");
        System.out.println("Map: " + map);
        System.out.println();

        // 2. replace(K key, V oldValue, V newValue)
        System.out.println("--- replace(K key, V oldValue, V newValue) ---");
        boolean replaced3 = map.replace("Banana", 20, 25);
        boolean replaced4 = map.replace("Cherry", 999, 35);
        System.out.println("replace('Banana', 20, 25): " + replaced3 + " (old value matched)");
        System.out.println("replace('Cherry', 999, 35): " + replaced4 + " (old value didn't match)");
        System.out.println("Map: " + map);
        System.out.println();

//        / 3. replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        System.out.println("--- replaceAll(BiFunction function) ---");
        System.out.println("Before replaceAll: " + map);
        map.replaceAll((key, value) -> {
            System.out.println("  Processing: " + key + "=" + value + " -> " + (value * 2));
            return value * 2;
        });
        System.out.println("After replaceAll (doubled all values): " + map);
        System.out.println();
    }

    public static void demonstrateViewMethods(){
        System.out.println("=== View Methods ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        System.out.println("Original map: " + map);
        System.out.println();

        // 1. keySet()
        System.out.println("--- keySet() ---");
        Set<String> keys = map.keySet();
        System.out.println("Key set: " + keys);
        System.out.println("Key set class: " + keys.getClass().getName());

        // Demonstrate that it's a view
        System.out.println("Removing 'Date' from key set...");
        keys.remove("Date");
        System.out.println("Original map after key removal: " + map);
        System.out.println();

    }
}
