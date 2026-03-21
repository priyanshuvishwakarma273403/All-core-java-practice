package CollectionFrameworksPractice;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        System.out.println("=== SortedSet Method Demonstrations ===\n");

        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6));
        System.out.println("Original SortedSet: " + numbers);
        System.out.println();

        // 1. comparator() - Returns the comparator used to order elements
        demonstrateComparator(numbers);

        // 2. first() - Returns the first (lowest) element
        demonstrateFirst(numbers);

        // 3. last() - Returns the last (highest) element
        demonstrateLast(numbers);

        // 4. headSet() - Returns elements strictly less than toElement
        demonstrateHeadSet(numbers);

        // 5. tailSet() - Returns elements greater than or equal to fromElement
        demonstrateTailSet(numbers);

        // 6. subSet() - Returns elements in range [fromElement, toElement)
        demonstrateSubSet(numbers);

        // 7. spliterator() - Creates a Spliterator over elements
        demonstrateSpliterator(numbers);

        // Inherited methods from Set interface
        demonstrateSetMethods();

        // Inherited methods from Collection interface
        demonstrateCollectionMethods();

        // Inherited methods from Iterable interface
        demonstrateIterableMethods();

        // Custom comparator example
        demonstrateCustomComparator();
    }

    public static void demonstrateComparator(SortedSet<Integer> set){
        System.out.println("--- comparator() ---");
        Comparator<? super Integer> comp = set.comparator();
        if (comp == null) {
            System.out.println("Comparator: null (using natural ordering)");
        } else {
            System.out.println("Comparator: " + comp);
        }
        System.out.println();
    }

    public static void demonstrateFirst(SortedSet<Integer> set){
        System.out.println("--- first() ---");
        Integer first = set.first();
        System.out.println("First element: " + first);
        System.out.println();
    }

    public static void demonstrateLast(SortedSet<Integer> set){
        System.out.println("--- last() ---");
        Integer last = set.last();
        System.out.println("Last element: " + last);
        System.out.println();
    }

    public static void demonstrateHeadSet(SortedSet<Integer> set){
        System.out.println("--- headSet(E toElement) ---");
        SortedSet<Integer> headSet = set.headSet(6);
        System.out.println("Elements < 6: " + headSet);
        System.out.println("Note: This is a view, changes affect original set");
        System.out.println();
    }

    public static void demonstrateTailSet(SortedSet<Integer> set){
        System.out.println("--- tailSet(E fromElement) ---");
        SortedSet<Integer> tailSet = set.tailSet(6);
        System.out.println("Elements >= 6: " + tailSet);
        System.out.println("Note: This is a view, changes affect original set");
        System.out.println();
    }

    public static void demonstrateSubSet(SortedSet<Integer> set){
        System.out.println("--- subSet(E fromElement, E toElement) ---");
        SortedSet<Integer> subSet = set.subSet(3, 7);
        System.out.println("Elements [3, 7): " + subSet);
        System.out.println("Note: fromElement inclusive, toElement exclusive");
        System.out.println();
    }

    public static void  demonstrateSpliterator(SortedSet<Integer> set){
        System.out.println("--- spliterator() ---");
        Spliterator<Integer> spliterator = set.spliterator();
        System.out.print("Elements via Spliterator: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();
        System.out.println("Characteristics: " + spliterator.characteristics());
        System.out.println();
    }

    public static void  demonstrateSetMethods(){
        System.out.println("=== Methods Inherited from Set ===\n");

        SortedSet<String> set = new TreeSet<>();
        // add
        System.out.println("--- add(E e) ---");
        boolean added = set.add("Apple");
        System.out.println("Added 'Apple': " + added);
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set after adds: " + set);
        System.out.println();

        // addAll
        System.out.println("--- addAll(Collection c) ---");
        set.addAll(Arrays.asList("Date", "Elderberry"));
        System.out.println("Set after addAll: " + set);
        System.out.println();

        // contains
        System.out.println("--- contains(Object o) ---");
        System.out.println("Contains 'Banana': " + set.contains("Banana"));
        System.out.println("Contains 'Grape': " + set.contains("Grape"));
        System.out.println();

        // containsAll
        System.out.println("--- containsAll(Collection c) ---");
        System.out.println("Contains all [Apple, Cherry]: " +
                set.containsAll(Arrays.asList("Apple", "Cherry")));
        System.out.println();

        // size
        System.out.println("--- size() ---");
        System.out.println("Size: " + set.size());
        System.out.println();

        // isEmpty
        System.out.println("--- isEmpty() ---");
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println();

        // iterator
        System.out.println("--- iterator() ---");
        System.out.print("Iterating: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");

        // toArray
        System.out.println("--- toArray() ---");
        Object[] array1 = set.toArray();
        System.out.println("Array: " + Arrays.toString(array1));
        System.out.println();

        // toArray(T[])
        System.out.println("--- toArray(T[] a) ---");
        String[] array2 = set.toArray(new String[0]);
        System.out.println("Typed array: " + Arrays.toString(array2));
        System.out.println();

        // remove
        System.out.println("--- remove(Object o) ---");
        boolean removed = set.remove("Banana");
        System.out.println("Removed 'Banana': " + removed);
        System.out.println("Set after remove: " + set);
        System.out.println();

        // removeAll
        System.out.println("--- removeAll(Collection c) ---");
        SortedSet<String> set2 = new TreeSet<>(set);
        set2.removeAll(Arrays.asList("Apple", "Cherry"));
        System.out.println("Set after removeAll: " + set2);
        System.out.println();

        // retainAll
        System.out.println("--- retainAll(Collection c) ---");
        SortedSet<String> set3 = new TreeSet<>(set);
        set3.retainAll(Arrays.asList("Apple", "Date"));
        System.out.println("Set after retainAll: " + set3);
        System.out.println();

        // equals
        System.out.println("--- equals(Object o) ---");
        SortedSet<String> set4 = new TreeSet<>(set);
        System.out.println("Sets equal: " + set.equals(set4));
        System.out.println();

        // hashCode
        System.out.println("--- hashCode() ---");
        System.out.println("HashCode: " + set.hashCode());
        System.out.println();

        // clear
        System.out.println("--- clear() ---");
        SortedSet<String> set5 = new TreeSet<>(set);
        set5.clear();
        System.out.println("Set after clear: " + set5 + ", isEmpty: " + set5.isEmpty());
        System.out.println();
    }

    public static void demonstrateCollectionMethods(){
        System.out.println("=== Methods Inherited from Collection ===\n");

        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("--- stream() ---");
        System.out.print("Stream processing (filter even, multiply by 2): ");
        set.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // parallelStream
        System.out.println("--- parallelStream() ---");
        System.out.print("Parallel stream sum: ");
        int sum = set.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println();

        // removeIf
        System.out.println("--- removeIf(Predicate filter) ---");
        SortedSet<Integer> set2 = new TreeSet<>(set);
        set2.removeIf(n -> n > 5);
        System.out.println("After removing elements > 5: " + set2);
        System.out.println();

    }

    public static void demonstrateIterableMethods(){
        System.out.println("=== Methods Inherited from Iterable ===\n");

        SortedSet<String> set = new TreeSet<>(Arrays.asList("X", "Y", "Z"));

        // forEach
        System.out.println("--- forEach(Consumer action) ---");
        System.out.print("ForEach printing: ");
        set.forEach(s -> System.out.print(s + " "));
        System.out.println("\n");

    }

    public static void demonstrateCustomComparator(){
        System.out.println("=== Custom Comparator Example ===\n");

        // Create SortedSet with reverse order comparator
        SortedSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.addAll(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6));

        System.out.println("Set with reverse comparator: " + reverseSet);
        System.out.println("First (highest): " + reverseSet.first());
        System.out.println("Last (lowest): " + reverseSet.last());
        System.out.println("Comparator: " + reverseSet.comparator());
        System.out.println();

        // Custom comparator for strings (by length)
        SortedSet<String> lengthSet = new TreeSet<>(
                Comparator.comparingInt(String::length).thenComparing(String::compareTo)
        );
        lengthSet.addAll(Arrays.asList("a", "abc", "ab", "abcd", "abcde"));

        System.out.println("Set sorted by length: " + lengthSet);
        System.out.println("First (shortest): " + lengthSet.first());
        System.out.println("Last (longest): " + lengthSet.last());
    }

}
