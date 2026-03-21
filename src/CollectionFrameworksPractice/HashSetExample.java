package CollectionFrameworksPractice;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); //Duplicate won't be allowed

        System.out.println("HashSet: " + set);
        System.out.println("Size : "+set.size());

        System.out.println("Contains Python? " + set.contains("Python"));
        set.remove("C++");
        System.out.println("Remove: " + set);

        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2, 1));
        System.out.println("\nNumbers (duplicates removed): " + numbers);  //Duplicate removed Auto
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));


        //giving both hashset unique value if union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        //giving matching element bot hashset if intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }
}
