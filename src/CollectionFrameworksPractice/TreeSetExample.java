package CollectionFrameworksPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

//        automatic sorted the element
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);

        System.out.println("TreeSet (sorted): " + numbers);

        System.out.println("\nFirst element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());
        System.out.println("Lower than 40: " + numbers.lower(40));
        System.out.println("Higher than 40: " + numbers.higher(40));
        System.out.println("Floor of 45: " + numbers.floor(45));
        System.out.println("Ceiling of 45: " + numbers.ceiling(45));

        System.out.println("\nHeadSet (<40) : "+numbers.headSet(40));
        System.out.println("TailSet (>=40): " + numbers.tailSet(40));
        System.out.println("SubSet [20, 80): " + numbers.subSet(20, 80));

        System.out.println("\nDescending: " + numbers.descendingSet());

        System.out.println("\nPoll first: " + numbers.pollFirst());
        System.out.println("Poll last: " + numbers.pollLast());
        System.out.println("After polls: " + numbers);

        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("\nNames (reverse order): " + names);
    }
}
