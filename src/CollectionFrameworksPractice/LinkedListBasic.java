package CollectionFrameworksPractice;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> animals =  new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.addFirst("Lion");
        animals.addLast("Tiger");

        System.out.println("LinkedList: " + animals);

        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());

        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removing first and last: " + animals);

        System.out.println("Peek first: " + animals.peekFirst());
        System.out.println("PeekLast: " + animals.peekLast());

        System.out.println("Poll first: " + animals.pollFirst());
        System.out.println("After poll: " + animals);

        System.out.println("PollLast: " + animals.pollLast());
        System.out.println("After poll: " + animals);
    }
}
