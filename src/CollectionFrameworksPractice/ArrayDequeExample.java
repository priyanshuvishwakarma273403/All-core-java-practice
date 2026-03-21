package CollectionFrameworksPractice;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("Z");
        deque.offerLast("C");

        System.out.println("Deque: " + deque);

        System.out.println("\nPeek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        System.out.println("\nRemove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("After removals: " + deque);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("\nStack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("\nQueue: " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

    }
}
