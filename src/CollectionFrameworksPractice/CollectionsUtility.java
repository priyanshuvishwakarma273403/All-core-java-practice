package CollectionFrameworksPractice;

import java.util.*;

public class CollectionsUtility {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Collections.sort(list);
        int index = Collections.binarySearch(list, 6);
        System.out.println("\nIndex of 5: " + index);

        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));

        list.add(5);
        list.add(5);
        System.out.println("\nFrequency of 5: " + Collections.frequency(list, 5));

        Collections.fill(list, 9);
        System.out.println("After fill: " + list);

        List<String> immutable = List.of("A", "B", "C");
        System.out.println("\nImmutable list: " + immutable);

        List<String> syncList = Collections.synchronizedList(
                new ArrayList<>()
        );
        synchronized(syncList) {
            syncList.add("Thread-safe");
            System.out.println("Synchronized list: " + syncList);
        }

        Set<String> singletonSet = Collections.singleton("Only");
        System.out.println("\nSingleton set: " + singletonSet);

        List<String> emptyList = Collections.emptyList();
        Set<String> emptySet = Collections.emptySet();
        Map<String, String> emptyMap = Collections.emptyMap();

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(nums, 3);
        System.out.println("\nRotated: " + nums);

        Collections.swap(nums, 0, 3);
        System.out.println("After swap: " + nums);

        Collections.replaceAll(nums, 3, 30);
        System.out.println("After replaceAll: " + nums);

    }
}
