package CollectionFrameworksPractice;

import java.util.*;

public class SetMethodsDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println("=== Demonstrating Set Methods ===\n");
        System.out.println("1. add() method:");
        boolean added1 = set.add("Apple");
        boolean added2 = set.add("Banana");
        boolean added3 = set.add("Apple"); // Duplicate
        System.out.println("Added 'Apple': " + added1);
        System.out.println("Added 'Banana': " + added2);
        System.out.println("Added 'Apple' again: " + added3);
        System.out.println("Current set: " + set);
        System.out.println();

        // 2. addAll(Collection<? extends E> c) - Adds all elements from collection
        System.out.println("2. addAll() method:");
        Collection<String> fruits = Arrays.asList("Cherry", "Date", "Apple");
        boolean addedAll = set.addAll(fruits);
        System.out.println("Added all from collection: " + addedAll);
        System.out.println("Current set: " + set);
        System.out.println();

        // 3. size() - Returns number of elements
        System.out.println("3. size() method:");
        System.out.println("Set size: " + set.size());
        System.out.println();

        // 4. isEmpty() - Checks if set is empty
        System.out.println("4. isEmpty() method:");
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println();

        // 5. contains(Object o) - Checks if element exists
        System.out.println("5. contains() method:");
        System.out.println("Contains 'Apple'? " + set.contains("Apple"));
        System.out.println("Contains 'Grape'? " + set.contains("Grape"));
        System.out.println();

        // 6. containsAll(Collection<?> c) - Checks if all elements exist
        System.out.println("6. containsAll() method:");
        Collection<String> check1 = Arrays.asList("Apple", "Banana");
        Collection<String> check2 = Arrays.asList("Apple", "Grape");
        System.out.println("Contains all [Apple, Banana]? " + set.containsAll(check1));
        System.out.println("Contains all [Apple, Grape]? " + set.containsAll(check2));
        System.out.println();


        // iterator() method
        System.out.println("\n6. Testing iterator() method:");
        System.out.print("   Iterating: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // spliterator() method
        System.out.println("\n7. Testing spliterator() method:");
        System.out.print("   Using spliterator: ");
        set.spliterator().forEachRemaining(item -> System.out.print(item + " "));
        System.out.println();

        // toArray() methods
        System.out.println("\n8. Testing toArray() methods:");
        Object[] array1 = set.toArray();
        System.out.println("   toArray(): " + Arrays.toString(array1));

        String[] array2 = new String[set.size()];
        String[] result = set.toArray(array2);
        System.out.println("   toArray(T[] a): " + Arrays.toString(result));

        // remove() method
        System.out.println("\n9. Testing remove() method:");
        System.out.println("   Set before remove: " + set);
        System.out.println("   remove('Cherry'): " + set.remove("Cherry"));
        System.out.println("   remove('Grape'): " + set.remove("Grape")); // Not in set
        System.out.println("   Set after remove: " + set);

        // removeAll() method
        System.out.println("\n10. Testing removeAll() method:");
        List<String> toRemove = Arrays.asList("Apple", "Date");
        System.out.println("    Removing: " + toRemove);
        System.out.println("    removeAll() result: " + set.removeAll(toRemove));
        System.out.println("    Set after removeAll: " + set);

        // Rebuild set for retainAll test
        set.addAll(Arrays.asList("Fig", "Grape", "Honeydew"));
        System.out.println("\n11. Testing retainAll() method:");
        System.out.println("    Set before retainAll: " + set);
        List<String> toRetain = Arrays.asList("Banana", "Fig", "Kiwi");
        System.out.println("    Retaining only: " + toRetain);
        System.out.println("    retainAll() result: " + set.retainAll(toRetain));
        System.out.println("    Set after retainAll: " + set);

//        / equals() and hashCode() methods
//        System.out.println("\n12. Testing equals() and hashCode() methods:");
//        CustomSet<String> set2 = new CustomSet<>(Arrays.asList("Banana", "Fig"));
//        CustomSet<String> set3 = new CustomSet<>(Arrays.asList("Fig", "Banana"));
//        CustomSet<String> set4 = new CustomSet<>(Arrays.asList("Banana"));
//
//        System.out.println("    set: " + set);
//        System.out.println("    set2: " + set2);
//        System.out.println("    set3: " + set3);
//        System.out.println("    set4: " + set4);
//        System.out.println("    set.equals(set2): " + set.equals(set2));
//        System.out.println("    set.equals(set3): " + set.equals(set3));
//        System.out.println("    set2.equals(set3): " + set2.equals(set3));
//        System.out.println("    set.equals(set4): " + set.equals(set4));
//        System.out.println("    set.hashCode(): " + set.hashCode());
//        System.out.println("    set2.hashCode(): " + set2.hashCode());
//        System.out.println("    set3.hashCode(): " + set3.hashCode());

//        / clear() method
        System.out.println("\n13. Testing clear() method:");
        System.out.println("    Set before clear: " + set);
        System.out.println("    size before clear: " + set.size());
        set.clear();
        System.out.println("    Set after clear: " + set);
        System.out.println("    size after clear: " + set.size());
        System.out.println("    isEmpty after clear: " + set.isEmpty());

        // Additional test with integers
//        System.out.println("\n14. Testing with Integer type:");
//        CustomSet<Integer> numberSet = new CustomSet<>();
//        set.addAll(Arrays.asList(1, 2, 3, 4, 5));
//        System.out.println("    Integer set: " + numberSet);
//        System.out.println("    contains(3): " + numberSet.contains(3));
//        System.out.println("    size(): " + numberSet.size());

//         Test with null values
//        System.out.println("\n15. Testing with null values:");
//        CustomSet<String> nullSet = new CustomSet<>();
//        nullSet.add(null);
//        nullSet.add("NotNull");
//        System.out.println("    Set with null: " + nullSet);
//        System.out.println("    contains(null): " + nullSet.contains(null));
//        System.out.println("    size(): " + nullSet.size());
//
//        System.out.println("\n=== All method demonstrations complete! ===");

        }
    }
