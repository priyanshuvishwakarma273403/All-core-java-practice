package CollectionFrameworksPractice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAdvance {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue operations:");
        System.out.println("Poll :" + queue.poll());
        System.out.println("Peak :" + queue.peek());
        System.out.println("Queue : "+queue);

        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        deque.offerLast(40);

        System.out.println("\nDeque: " + deque);

        System.out.println("Poll First : "+deque.pollFirst());
        System.out.println("Poll Last : "+deque.pollLast());
        System.out.println("Deque after polls: " + deque);

        LinkedList<String> stack = new LinkedList<>();  //Last In First Out
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");

        System.out.println("\nStack operations:");
        System.out.println("Pop: " + stack.pop()); // Removes Top
        System.out.println("Peek: " + stack.peek()); // Views Middle
        System.out.println("Stack: " + stack);
    }
}
