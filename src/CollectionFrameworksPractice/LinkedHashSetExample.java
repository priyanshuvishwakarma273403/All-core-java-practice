package CollectionFrameworksPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("First");
        orderedSet.add("Second");
        orderedSet.add("Third");
        orderedSet.add("First");//Duplicate won't be allowed

        System.out.println("LinkedHashSet (insertion order): "+orderedSet);

        System.out.println("\nIterating:");
        for(String item : orderedSet){
            System.out.print(item+" ");
        }

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        int[] array = {5, 2, 8, 2, 5, 9, 1, 8};
        for(int i : array){
            numbers.add(i);
        }

        System.out.println("\nOriginal array: " + java.util.Arrays.toString(array));
        System.out.println("Duplicates removed (order preserved): "+numbers);
    }
}
