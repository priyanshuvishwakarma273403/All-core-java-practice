package CollectionFrameworksPractice;

import java.util.*;

public class HashMapQuestion {
    public static void main(String[] args) {
        System.out.println("=== HashMap Method Demonstrations ===\n");

        // HashMap instance methods
        demonstrateBasicOperations();
        demonstrateComputeMethods();
        demonstrateReplaceMethods();
        demonstrateViewMethods();
        demonstrateIterationMethods();
        demonstrateCloneMethod();

        // Methods from AbstractMap
        demonstrateAbstractMapMethods();

        // Methods from Object
        demonstrateObjectMethods();

        // Practical examples
        demonstratePracticalExamples();
    }

    public static void demonstrateBasicOperations() {
        System.out.println("=== Basic HashMap Operations ===\n");

        HashMap<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value)
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

    public static void demonstrateComputeMethods(){
        System.out.println("=== Compute Methods ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial map: " + map);
        System.out.println();

        // 1. compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        System.out.println("--- compute(K key, BiFunction remappingFunction) ---");

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

        // 2. computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
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

        // Merge returning null (removes entry)
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

        // 3. replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
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

        // 2. values()
        System.out.println("--- values() ---");
        Collection<Integer> values = map.values();
        System.out.println("Values collection: " + values);
        System.out.println("Values class: " + values.getClass().getName());

        // Demonstrate that it's a view
        System.out.println("Removing value 20 from values collection...");
        values.remove(20);
        System.out.println("Original map after value removal: " + map);
        System.out.println();

        // 3. entrySet()
        System.out.println("--- entrySet() ---");
        map.put("Elderberry", 50); // Add back some data
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entry set: " + entries);
        System.out.println("Entry set class: " + entries.getClass().getName());

        // Iterate through entries
        System.out.println("Iterating through entries:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }

        // Modify through entry
        System.out.println("Modifying 'Apple' value through entry...");
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().equals("Apple")) {
                entry.setValue(100);
            }
        }
        System.out.println("Map after entry modification: " + map);
        System.out.println();
    }

    public static void demonstrateIterationMethods(){
        System.out.println("=== Iteration Methods ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // forEach(BiConsumer<? super K, ? super V> action)
        System.out.println("--- forEach(BiConsumer action) ---");
        System.out.println("Using forEach to print entries:");
        map.forEach((key, value) ->
                System.out.println("  " + key + " -> " + value)
        );
    }

    public static void demonstrateCloneMethod(){
        System.out.println("=== Clone Method ===\n");

        // clone()
        System.out.println("--- clone() ---");
        HashMap<String, StringBuilder> map = new HashMap<>();
        map.put("Key1", new StringBuilder("Value1"));
        map.put("Key2", new StringBuilder("Value2"));

        System.out.println("Original map: " + map);

        // Clone the map
        @SuppressWarnings("unchecked")
        HashMap<String, StringBuilder> clonedMap = (HashMap<String, StringBuilder>) map.clone();

        System.out.println("Cloned map: " + clonedMap);
        System.out.println("Are they the same object? " + (map == clonedMap));

        // Demonstrate shallow copy
        System.out.println("\nDemonstrating shallow copy:");
        map.get("Key1").append(" - Modified");
        System.out.println("Original map after modifying value: " + map);
        System.out.println("Cloned map (also affected): " + clonedMap);
        System.out.println("Note: Values are shared (shallow copy), not keys");

        // Adding new entry to original doesn't affect clone
        map.put("Key3", new StringBuilder("Value3"));
        System.out.println("\nAfter adding Key3 to original:");
        System.out.println("Original map: " + map);
        System.out.println("Cloned map: " + clonedMap);
        System.out.println();

    }

    public static void demonstrateAbstractMapMethods(){
        System.out.println("=== Methods from AbstractMap ===\n");

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A", 1);
        map2.put("B", 2);
        map2.put("C", 3);

        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("A", 1);
        map3.put("B", 2);
        map3.put("C", 4);

        // 1. equals(Object o)
        System.out.println("--- equals(Object o) ---");
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println("map3: " + map3);
        System.out.println("map1.equals(map2): " + map1.equals(map2));
        System.out.println("map1.equals(map3): " + map1.equals(map3));
        System.out.println("map1.equals(\"not a map\"): " + map1.equals("not a map"));
        System.out.println();

        // 2. hashCode()
        System.out.println("--- hashCode() ---");
        System.out.println("map1.hashCode(): " + map1.hashCode());
        System.out.println("map2.hashCode(): " + map2.hashCode());
        System.out.println("map3.hashCode(): " + map3.hashCode());
        System.out.println("Note: Equal maps have same hashCode");
        System.out.println();

        // 3. toString()
        System.out.println("--- toString() ---");
        System.out.println("map1.toString(): " + map1.toString());
        System.out.println();

    }

    public static void demonstrateObjectMethods(){
        System.out.println("=== Methods from Object Class ===\n");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("X", 10);
        map.put("Y", 20);

        // 1. getClass()
        System.out.println("--- getClass() ---");
        System.out.println("Class: " + map.getClass());
        System.out.println("Simple name: " + map.getClass().getSimpleName());
        System.out.println("Canonical name: " + map.getClass().getCanonicalName());
        System.out.println();

        // 2. notify(), notifyAll(), wait()
        System.out.println("--- Threading Methods (notify, notifyAll, wait) ---");
        System.out.println("These methods are used for thread synchronization");
        System.out.println("Example: wait() causes thread to wait until notified");
        System.out.println("Rarely used directly with HashMap (not thread-safe)");
        System.out.println();

        // 3. finalize()
        System.out.println("--- finalize() ---");
        System.out.println("finalize() is deprecated since Java 9");
        System.out.println("Used for cleanup before garbage collection (not recommended)");
        System.out.println();
    }

    public static void demonstratePracticalExamples(){
        System.out.println("=== Practical Examples ===\n");

        // Example 1: Word Frequency Counter
        System.out.println("--- Example 1: Word Frequency Counter ---");
        String text = "the quick brown fox jumps over the lazy dog the fox";
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split(" ")) {
            wordCount.merge(word, 1, Integer::sum);
        }

        System.out.println("Text: " + text);
        System.out.println("Word frequencies:");
        wordCount.forEach((word, count) ->
                System.out.println("  " + word + ": " + count)
        );
        System.out.println();

        // Example 2: Default Values
        System.out.println("--- Example 2: Using getOrDefault ---");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);

        System.out.println("Alice's score: " + scores.getOrDefault("Alice", 0));
        System.out.println("Charlie's score: " + scores.getOrDefault("Charlie", 0));
        System.out.println();

        // Example 3: Caching with computeIfAbsent
        System.out.println("--- Example 3: Caching with computeIfAbsent ---");
        HashMap<Integer, String> cache = new HashMap<>();

        System.out.println("Getting value for key 1:");
        String result1 = cache.computeIfAbsent(1, key -> {
            System.out.println("  Computing expensive operation for key: " + key);
            return "Value-" + key;
        });
        System.out.println("Result: " + result1);

        System.out.println("Getting value for key 1 again (cached):");
        String result2 = cache.computeIfAbsent(1, key -> {
            System.out.println("  This should not print (value cached)");
            return "Value-" + key;
        });
        System.out.println("Result: " + result2);
        System.out.println();

        // Example 4: Grouping Data
        System.out.println("--- Example 4: Grouping Students by Grade ---");
        class Student {
            String name;
            String grade;

            Student(String name, String grade) {
                this.name = name;
                this.grade = grade;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        List<Student> students = Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eve", "B")
        );

        HashMap<String, List<Student>> byGrade = new HashMap<>();
        for (Student student : students) {
            byGrade.computeIfAbsent(student.grade, k -> new ArrayList<>())
                    .add(student);
        }

        System.out.println("Students grouped by grade:");
        byGrade.forEach((grade, studentList) ->
                System.out.println("  Grade " + grade + ": " + studentList)
        );
        System.out.println();

        // Example 5: Merging Maps
        System.out.println("--- Example 5: Merging Two Inventory Maps ---");
        HashMap<String, Integer> warehouse1 = new HashMap<>();
        warehouse1.put("Apples", 50);
        warehouse1.put("Bananas", 30);
        warehouse1.put("Oranges", 40);

        HashMap<String, Integer> warehouse2 = new HashMap<>();
        warehouse2.put("Apples", 20);
        warehouse2.put("Bananas", 25);
        warehouse2.put("Grapes", 35);

        HashMap<String, Integer> combined = new HashMap<>(warehouse1);
        warehouse2.forEach((fruit, quantity) ->
                combined.merge(fruit, quantity, Integer::sum)
        );

        System.out.println("Warehouse 1: " + warehouse1);
        System.out.println("Warehouse 2: " + warehouse2);
        System.out.println("Combined inventory: " + combined);
        System.out.println();

        // Example 6: Updating Values Conditionally
        System.out.println("--- Example 6: Conditional Updates with replace ---");
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Item1", 10);
        inventory.put("Item2", 5);
        inventory.put("Item3", 0);

        System.out.println("Initial inventory: " + inventory);

        // Restock only if item is out of stock
        inventory.forEach((item, quantity) -> {
            if (quantity == 0) {
                inventory.replace(item, 0, 20);
                System.out.println("Restocked " + item);
            }
        });

        System.out.println("After restocking: " + inventory);
        System.out.println();

        // Example 7: Computing Running Totals
        System.out.println("--- Example 7: Running Totals with compute ---");
        HashMap<String, Integer> accountBalance = new HashMap<>();
        accountBalance.put("Account1", 1000);

        System.out.println("Initial balance: " + accountBalance);

        // Add deposits
        accountBalance.compute("Account1", (key, balance) -> balance + 500);
        System.out.println("After $500 deposit: " + accountBalance);

        accountBalance.compute("Account1", (key, balance) -> balance - 200);
        System.out.println("After $200 withdrawal: " + accountBalance);
        System.out.println();

        System.out.println("=== Demo Complete ===");

    }
}
