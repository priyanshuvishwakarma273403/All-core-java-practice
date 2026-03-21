package CollectionFrameworksPractice;

import java.util.*;

public class HashSetMethodsDemo {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     CUSTOM HASHSET - COMPLETE METHOD DEMONSTRATION        ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        // ========== CONCRETE METHODS ==========
        demonstrateConcreteHashSetMethods();

        // ========== INHERITED FROM ABSTRACTSET ==========
        demonstrateAbstractSetMethods();
//
//        // ========== INHERITED FROM ABSTRACTCOLLECTION ==========
        demonstrateAbstractCollectionMethods();
//
//        // ========== COLLECTION INTERFACE METHODS ==========
//        demonstrateCollectionInterfaceMethods();
//
//        // ========== ITERABLE INTERFACE METHODS ==========
//        demonstrateIterableMethods();
//
//        // ========== ADVANCED USAGE PATTERNS ==========
//        demonstrateAdvancedPatterns();

        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║            ALL DEMONSTRATIONS COMPLETED!                   ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    public static void demonstrateConcreteHashSetMethods() {
        printSection("CONCRETE HASHSET METHODS");
        HashSet<String> set = new HashSet<>();
        System.out.println("   add('Apple'): " + set.add("Apple"));        // true
        System.out.println("   add('Banana'): " + set.add("Banana"));      // true
        System.out.println("   add('Apple'): " + set.add("Apple"));        // false (duplicate)
        System.out.println("   Set: " + set);

        // 2. clear()
        System.out.println("\n2. clear() - Removes all elements");
        System.out.println("   Before clear - size: " + set.size());
        set.clear();
        System.out.println("   After clear - size: " + set.size());
        System.out.println("   isEmpty: " + set.isEmpty());

        // Rebuild set for remaining demos
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");


        // 3. clone()
        System.out.println("\n3. clone() - Creates shallow copy");
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("   Original: " + set);
        System.out.println("   Cloned: " + clonedSet);
        System.out.println("   Are they equal? " + set.equals(clonedSet));
        System.out.println("   Are they same object? " + (set == clonedSet));
        clonedSet.add("Elderberry");
        System.out.println("   After adding to clone:");
        System.out.println("   Original: " + set);
        System.out.println("   Cloned: " + clonedSet);

        // 4. contains(Object o)
        System.out.println("\n4. contains(Object o) - Checks if element exists");
        System.out.println("   contains('Apple'): " + set.contains("Apple"));
        System.out.println("   contains('Grape'): " + set.contains("Grape"));
        System.out.println("   contains(null): " + set.contains(null));

        // 5. isEmpty()
        System.out.println("\n5. isEmpty() - Checks if set is empty");
        System.out.println("   Current set isEmpty: " + set.isEmpty());
        HashSet<String> emptySet = new HashSet<>();
        System.out.println("   Empty set isEmpty: " + emptySet.isEmpty());

        // 6. iterator()
        System.out.println("\n6. iterator() - Returns iterator");
        System.out.print("   Iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7. remove(Object o)
        System.out.println("\n7. remove(Object o) - Removes element if present");
        System.out.println("   Before: " + set);
        System.out.println("   remove('Cherry'): " + set.remove("Cherry"));
        System.out.println("   remove('Grape'): " + set.remove("Grape"));  // not present
        System.out.println("   After: " + set);

        // 8. size()
        System.out.println("\n8. size() - Returns number of elements");
        System.out.println("   Current size: " + set.size());
        set.add("Fig");
        System.out.println("   After adding 'Fig': " + set.size());

        // 9. spliterator()
        System.out.println("\n9. spliterator() - Creates Spliterator");
        System.out.print("   Using spliterator: ");
        set.spliterator().forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

    }

    public static void demonstrateAbstractSetMethods() {
        printSection("METHODS INHERITED FROM ABSTRACTSET");

        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cherry");
        set2.add("Banana");
        set2.add("Apple");

        HashSet<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Banana");

        // 1. equals(Object o)
        System.out.println("1. equals(Object o) - Compares sets for equality");
        System.out.println("   set1: " + set1);
        System.out.println("   set2: " + set2);
        System.out.println("   set3: " + set3);
        System.out.println("   set1.equals(set2): " + set1.equals(set2)); // true (same elements)
        System.out.println("   set1.equals(set3): " + set1.equals(set3)); // false (different size)

        // 2. hashCode()
        System.out.println("\n2. hashCode() - Returns hash code");
        System.out.println("   set1.hashCode(): " + set1.hashCode());
        System.out.println("   set2.hashCode(): " + set2.hashCode());
        System.out.println("   Equal sets have same hashCode: " + (set1.hashCode() == set2.hashCode()));


        // 3. removeAll(Collection<?> c)
        System.out.println("\n3. removeAll(Collection<?> c) - Removes all matching elements");
        HashSet<String> testSet = new HashSet<>();
        testSet.add("Apple");
        testSet.add("Banana");
        testSet.add("Cherry");
        testSet.add("Date");
        System.out.println("   Before: " + testSet);
        List<String> toRemove = Arrays.asList("Banana", "Date", "Elderberry");
        System.out.println("   Removing: " + toRemove);
        System.out.println("   removeAll result: " + testSet.removeAll(toRemove));
        System.out.println("   After: " + testSet);

    }

    public static void demonstrateAbstractCollectionMethods() {
        printSection("METHODS INHERITED FROM ABSTRACTSET");
        HashSet<String> set = new HashSet<>();
        // 1. addAll(Collection<? extends E> c)
        System.out.println("1. addAll(Collection<? extends E> c) - Adds multiple elements");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
        System.out.println("   Adding: " + fruits);
        System.out.println("   addAll result: " + set.addAll(fruits));
        System.out.println("   Set: " + set + " (no duplicate 'Apple')");


    }

    private static void printSection(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("  " + title);
        System.out.println("=".repeat(60));
    }

    // Helper class for custom object demonstration
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

}
