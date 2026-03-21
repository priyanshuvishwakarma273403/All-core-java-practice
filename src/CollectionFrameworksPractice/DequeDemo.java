package CollectionFrameworksPractice;

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        System.out.println("=== Deque (Double-Ended Queue) Method Demonstrations ===\n");

        // Deque-specific methods
        demonstrateDequeSpecificMethods();

        // Queue behavior (FIFO)
        demonstrateQueueBehavior();

        // Stack behavior (LIFO)
        demonstrateStackBehavior();

        // Methods inherited from Collection
        demonstrateCollectionMethods();

        // Methods inherited from Iterable
        demonstrateIterableMethods();

        // Comparison tables
        demonstrateComparisonTables();

        // Practical examples
        demonstratePracticalExamples();
    }

    public static void demonstrateDequeSpecificMethods() {
        System.out.println("=== Deque-Specific Methods ===\n");

        Deque<String> deque = new ArrayDeque<>();
        // 1. addFirst(E e) - Insert at front (throws exception if no space)
        System.out.println("--- addFirst(E e) ---");
        deque.addFirst("B");
        deque.addFirst("A");
        System.out.println("After addFirst('B') then addFirst('A'): " + deque);
        System.out.println();

        // 2. addLast(E e) - Insert at end (throws exception if no space)
        System.out.println("--- addLast(E e) ---");
        deque.addLast("C");
        deque.addLast("D");
        System.out.println("After addLast('C') then addLast('D'): " + deque);
        System.out.println();

        // 3. offerFirst(E e) - Insert at front (returns false if no space)
        System.out.println("--- offerFirst(E e) ---");
        boolean offered1 = deque.offerFirst("Z");
        System.out.println("offerFirst('Z'): " + offered1);
        System.out.println("Deque: " + deque);
        System.out.println();

        // 4. offerLast(E e) - Insert at end (returns false if no space)
        System.out.println("--- offerLast(E e) ---");
        boolean offered2 = deque.offerLast("E");
        System.out.println("offerLast('E'): " + offered2);
        System.out.println("Deque: " + deque);
        System.out.println();

        // 5. getFirst() - Retrieve first (throws exception if empty)
        System.out.println("--- getFirst() ---");
        String first = deque.getFirst();
        System.out.println("First element: " + first);
        System.out.println("Deque unchanged: " + deque);
        System.out.println();

        // 6. getLast() - Retrieve last (throws exception if empty)
        System.out.println("--- getLast() ---");
        String last = deque.getLast();
        System.out.println("Last element: " + last);
        System.out.println("Deque unchanged: " + deque);
        System.out.println();

        // 7. peekFirst() - Retrieve first (returns null if empty)
        System.out.println("--- peekFirst() ---");
        String peekFirst = deque.peekFirst();
        System.out.println("Peek first: " + peekFirst);
        System.out.println("Deque unchanged: " + deque);
        System.out.println();

        // 8. peekLast() - Retrieve last (returns null if empty)
        System.out.println("--- peekLast() ---");
        String peekLast = deque.peekLast();
        System.out.println("Peek last: " + peekLast);
        System.out.println("Deque unchanged: " + deque);
        System.out.println();

        // 9. removeFirst() - Remove first (throws exception if empty)
        System.out.println("--- removeFirst() ---");
        String removed1 = deque.removeFirst();
        System.out.println("Removed first: " + removed1);
        System.out.println("Deque after removeFirst: " + deque);
        System.out.println();

        // 10. removeLast() - Remove last (throws exception if empty)
        System.out.println("--- removeLast() ---");
        String removed2 = deque.removeLast();
        System.out.println("Removed last: " + removed2);
        System.out.println("Deque after removeLast: " + deque);
        System.out.println();

        // 11. pollFirst() - Remove first (returns null if empty)
        System.out.println("--- pollFirst() ---");
        String polled1 = deque.pollFirst();
        System.out.println("Polled first: " + polled1);
        System.out.println("Deque after pollFirst: " + deque);
        System.out.println();

        // 12. pollLast() - Remove last (returns null if empty)
        System.out.println("--- pollLast() ---");
        String polled2 = deque.pollLast();
        System.out.println("Polled last: " + polled2);
        System.out.println("Deque after pollLast: " + deque);
        System.out.println();

        // Repopulate for remaining tests
        deque.clear();
        deque.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Banana"));
        System.out.println("Repopulated deque: " + deque);
        System.out.println();

        // 13. removeFirstOccurrence(Object o)
        System.out.println("--- removeFirstOccurrence(Object o) ---");
        boolean removedFirst = deque.removeFirstOccurrence("Banana");
        System.out.println("Removed first occurrence of 'Banana': " + removedFirst);
        System.out.println("Deque: " + deque);
        System.out.println();

        // 14. removeLastOccurrence(Object o)
        System.out.println("--- removeLastOccurrence(Object o) ---");
        deque.add("Banana"); // Add another Banana
        System.out.println("Added another 'Banana': " + deque);
        boolean removedLast = deque.removeLastOccurrence("Banana");
        System.out.println("Removed last occurrence of 'Banana': " + removedLast);
        System.out.println("Deque: " + deque);
        System.out.println();

        // 15. iterator() - Forward iterator
        System.out.println("--- iterator() ---");
        System.out.print("Forward iteration: ");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        // 16. descendingIterator() - Reverse iterator
        System.out.println("--- descendingIterator() ---");
        System.out.print("Reverse iteration: ");
        Iterator<String> descIterator = deque.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        // 17. size()
        System.out.println("--- size() ---");
        System.out.println("Deque size: " + deque.size());
        System.out.println();

        // 18. contains(Object o)
        System.out.println("--- contains(Object o) ---");
        System.out.println("Contains 'Cherry': " + deque.contains("Cherry"));
        System.out.println("Contains 'Grape': " + deque.contains("Grape"));
        System.out.println();

    }

    public static void demonstrateQueueBehavior(){
        System.out.println("=== Deque as Queue (FIFO) ===\n");

        Deque<Integer> queue = new ArrayDeque<>();

        System.out.println("Queue methods and their Deque equivalents:");
        System.out.println("add(e) ≡ addLast(e)");
        System.out.println("offer(e) ≡ offerLast(e)");
        System.out.println("remove() ≡ removeFirst()");
        System.out.println("poll() ≡ pollFirst()");
        System.out.println("element() ≡ getFirst()");
        System.out.println("peek() ≡ peekFirst()");
        System.out.println();

        // 1. add(E e) - equivalent to addLast(e)
        System.out.println("--- add(E e) [addLast] ---");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("After add(10, 20, 30): " + queue);
        System.out.println();

        // 2. offer(E e) - equivalent to offerLast(e)
        System.out.println("--- offer(E e) [offerLast] ---");
        boolean offered = queue.offer(40);
        System.out.println("Offered 40: " + offered);
        System.out.println("Queue: " + queue);
        System.out.println();

        // 3. element() - equivalent to getFirst()
        System.out.println("--- element() [getFirst] ---");
        Integer head = queue.element();
        System.out.println("Head element: " + head);
        System.out.println("Queue unchanged: " + queue);
        System.out.println();

        // 4. peek() - equivalent to peekFirst()
        System.out.println("--- peek() [peekFirst] ---");
        Integer peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue unchanged: " + queue);
        System.out.println();

        // 5. remove() - equivalent to removeFirst()
        System.out.println("--- remove() [removeFirst] ---");
        Integer removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after remove: " + queue);
        System.out.println();

        // 6. poll() - equivalent to pollFirst()
        System.out.println("--- poll() [pollFirst] ---");
        Integer polled = queue.poll();
        System.out.println("Polled element: " + polled);
        System.out.println("Queue after poll: " + queue);
        System.out.println();

        // 7. remove(Object o) - removes first occurrence
        System.out.println("--- remove(Object o) ---");
        queue.add(30); // Add duplicate
        System.out.println("After adding 30 again: " + queue);
        boolean removedObj = queue.remove(30);
        System.out.println("Removed first occurrence of 30: " + removedObj);
        System.out.println("Queue: " + queue);
        System.out.println();

        // Exception handling
        System.out.println("--- Exception Handling ---");
        Deque<Integer> emptyQueue = new ArrayDeque<>();

        System.out.println("Testing on empty queue:");
        System.out.println("peek() on empty: " + emptyQueue.peek());
        System.out.println("poll() on empty: " + emptyQueue.poll());

        try {
            emptyQueue.element();
        } catch (NoSuchElementException e) {
            System.out.println("element() on empty: NoSuchElementException");
        }

        try {
            emptyQueue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("remove() on empty: NoSuchElementException");
        }
        System.out.println();

    }

    public static void demonstrateStackBehavior(){
        System.out.println("=== Deque as Stack (LIFO) ===\n");

        Deque<String> stack = new ArrayDeque<>();

        System.out.println("Stack methods and their Deque equivalents:");
        System.out.println("push(e) ≡ addFirst(e)");
        System.out.println("pop() ≡ removeFirst()");
        System.out.println("peek() ≡ peekFirst()");
        System.out.println();

        // 1. push(E e) - equivalent to addFirst(e)
        System.out.println("--- push(E e) [addFirst] ---");
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("After push('First', 'Second', 'Third'): " + stack);
        System.out.println("Note: Most recent push ('Third') is now at front");
        System.out.println();


        // 2. peek() - equivalent to peekFirst() (works for both Queue and Stack)
        System.out.println("--- peek() [peekFirst] ---");
        String top = stack.peek();
        System.out.println("Top of stack: " + top);
        System.out.println("Stack unchanged: " + stack);
        System.out.println();

        // 3. pop() - equivalent to removeFirst()
        System.out.println("--- pop() [removeFirst] ---");
        String popped1 = stack.pop();
        System.out.println("Popped: " + popped1);
        System.out.println("Stack after pop: " + stack);

        String popped2 = stack.pop();
        System.out.println("Popped: " + popped2);
        System.out.println("Stack after pop: " + stack);
        System.out.println();

        // Exception handling
        System.out.println("--- Exception Handling ---");
        Deque<String> emptyStack = new ArrayDeque<>();

        try {
            emptyStack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("pop() on empty stack: NoSuchElementException");
        }
        System.out.println();

        // Demonstrating LIFO behavior
        System.out.println("--- LIFO Demonstration ---");
        Deque<Integer> lifoStack = new ArrayDeque<>();
        System.out.println("Pushing: 1, 2, 3, 4, 5");
        for (int i = 1; i <= 5; i++) {
            lifoStack.push(i);
        }

        System.out.print("Popping order (LIFO): ");
        while (!lifoStack.isEmpty()) {
            System.out.print(lifoStack.pop() + " ");
        }
        System.out.println();
        System.out.println();

    }

    public static void demonstrateCollectionMethods(){
        System.out.println("=== Methods Inherited from Collection ===\n");

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));

        // 1. addAll(Collection c)
        System.out.println("--- addAll(Collection c) ---");
        System.out.println("Original deque: " + deque);
        boolean addedAll = deque.addAll(Arrays.asList(6, 7, 8));
        System.out.println("Added all [6, 7, 8]: " + addedAll);
        System.out.println("Deque: " + deque);
        System.out.println();

        // 2. clear()
        System.out.println("--- clear() ---");
        Deque<Integer> tempDeque = new ArrayDeque<>(deque);
        System.out.println("Before clear - size: " + tempDeque.size());
        tempDeque.clear();
        System.out.println("After clear - size: " + tempDeque.size());
        System.out.println("Is empty: " + tempDeque.isEmpty());
        System.out.println();

        // 3. containsAll(Collection c)
        System.out.println("--- containsAll(Collection c) ---");
        System.out.println("Contains all [2, 4, 6]: " + deque.containsAll(Arrays.asList(2, 4, 6)));
        System.out.println("Contains all [2, 100]: " + deque.containsAll(Arrays.asList(2, 100)));
        System.out.println();

        // 4. isEmpty()
        System.out.println("--- isEmpty() ---");
        System.out.println("Deque is empty: " + deque.isEmpty());
        System.out.println("Empty deque is empty: " + new ArrayDeque<>().isEmpty());
        System.out.println();

        // 5. removeAll(Collection c)
        System.out.println("--- removeAll(Collection c) ---");
        Deque<Integer> deque2 = new ArrayDeque<>(deque);
        boolean removedAll = deque2.removeAll(Arrays.asList(2, 4, 6, 8));
        System.out.println("Removed all [2, 4, 6, 8]: " + removedAll);
        System.out.println("Deque after removeAll: " + deque2);
        System.out.println();

        // 6. retainAll(Collection c)
        System.out.println("--- retainAll(Collection c) ---");
        Deque<Integer> deque3 = new ArrayDeque<>(deque);
        boolean retained = deque3.retainAll(Arrays.asList(1, 3, 5, 7));
        System.out.println("Retained only [1, 3, 5, 7]: " + retained);
        System.out.println("Deque after retainAll: " + deque3);
        System.out.println();

        // 7. removeIf(Predicate filter)
        System.out.println("--- removeIf(Predicate<? super E> filter) ---");
        Deque<Integer> deque4 = new ArrayDeque<>(deque);
        boolean removedIf = deque4.removeIf(n -> n % 2 == 0);
        System.out.println("Removed even numbers: " + removedIf);
        System.out.println("Deque after removeIf: " + deque4);
        System.out.println();

        // 8. toArray()
        System.out.println("--- toArray() ---");
        Object[] array1 = deque.toArray();
        System.out.println("Array: " + Arrays.toString(array1));
        System.out.println();

        // 9. toArray(T[] a)
        System.out.println("--- toArray(T[] a) ---");
        Integer[] array2 = deque.toArray(new Integer[0]);
        System.out.println("Typed array: " + Arrays.toString(array2));
        System.out.println();

        // 10. stream()
        System.out.println("--- stream() ---");
        System.out.print("Stream - filter and map: ");
        deque.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();


        // 11. parallelStream()
        System.out.println("--- parallelStream() ---");
        int sum = deque.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel stream sum: " + sum);
        System.out.println();

        // 12. spliterator()
        System.out.println("--- spliterator() ---");
        Spliterator<Integer> spliterator = deque.spliterator();
        System.out.print("Spliterator elements: ");
        spliterator.forEachRemaining(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // 13. equals() and hashCode()
        System.out.println("--- equals() and hashCode() ---");
        Deque<Integer> deque5 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> deque6 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        System.out.println("deque5: " + deque5);
        System.out.println("deque6: " + deque6);
        System.out.println("deque5.equals(deque6): " + deque5.equals(deque6));
        System.out.println("Note: Deque uses identity-based equals from Object");
        System.out.println("deque5.hashCode(): " + deque5.hashCode());
        System.out.println("deque6.hashCode(): " + deque6.hashCode());
        System.out.println();

    }

    public static void demonstrateIterableMethods(){
        System.out.println("=== Methods Inherited from Iterable ===\n");

        Deque<String> deque = new ArrayDeque<>(Arrays.asList("A", "B", "C", "D", "E"));

        // forEach(Consumer action)
        System.out.println("--- forEach(Consumer<? super E> action) ---");
        System.out.print("ForEach printing: ");
        deque.forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("ForEach with uppercase: ");
        deque.forEach(e -> System.out.print(e.toLowerCase() + " "));
        System.out.println();
        System.out.println();

    }

    public static void  demonstrateComparisonTables(){
        System.out.println("=== Comparison Tables ===\n");

        // Table 1: Deque Methods Summary
        System.out.println("--- Summary of Deque Methods ---");
        System.out.println();
        System.out.println("                  First Element (Head)              Last Element (Tail)");
        System.out.println("                  Throws exception | Special value   Throws exception | Special value");
        System.out.println("Insert            addFirst(e)      | offerFirst(e)   addLast(e)       | offerLast(e)");
        System.out.println("Remove            removeFirst()    | pollFirst()     removeLast()     | pollLast()");
        System.out.println("Examine           getFirst()       | peekFirst()     getLast()        | peekLast()");
        System.out.println();

        // Table 2: Queue vs Deque
        System.out.println("--- Queue Method ≡ Deque Method ---");
        System.out.println("add(e)      ≡ addLast(e)");
        System.out.println("offer(e)    ≡ offerLast(e)");
        System.out.println("remove()    ≡ removeFirst()");
        System.out.println("poll()      ≡ pollFirst()");
        System.out.println("element()   ≡ getFirst()");
        System.out.println("peek()      ≡ peekFirst()");
        System.out.println();

        // Table 3: Stack vs Deque
        System.out.println("--- Stack Method ≡ Deque Method ---");
        System.out.println("push(e)     ≡ addFirst(e)");
        System.out.println("pop()       ≡ removeFirst()");
        System.out.println("peek()      ≡ peekFirst()");
        System.out.println();
    }

    public static void demonstratePracticalExamples(){
        System.out.println("=== Practical Examples ===\n");

        // Example 1: Palindrome Checker
        System.out.println("--- Example 1: Palindrome Checker ---");
        System.out.println(isPalindrome("radar") ? "radar is a palindrome" : "radar is not a palindrome");
        System.out.println(isPalindrome("hello") ? "hello is a palindrome" : "hello is not a palindrome");
        System.out.println();

        // Example 2: Browser History (Back/Forward)
        System.out.println("--- Example 2: Browser History ---");
        demonstrateBrowserHistory();
        System.out.println();

        // Example 3: Sliding Window Maximum
        System.out.println("--- Example 3: Sliding Window Maximum ---");
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Window size: " + k);
        System.out.println("Sliding window maximums: " + Arrays.toString(slidingWindowMaximum(nums, k)));
        System.out.println();

        // Example 4: Recent Call Counter
        System.out.println("--- Example 4: Recent Call Counter ---");
        demonstrateRecentCallCounter();
        System.out.println();

        // Example 5: Undo/Redo Operations
        System.out.println("--- Example 5: Undo/Redo Operations ---");
        demonstrateUndoRedo();

        System.out.println("\n=== Demo Complete ===");
    }

    // Helper method for palindrome checker
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // Helper method for browser history
    public static void demonstrateBrowserHistory() {
        Deque<String> history = new ArrayDeque<>();

        System.out.println("Visit: google.com");
        history.addLast("google.com");

        System.out.println("Visit: facebook.com");
        history.addLast("facebook.com");

        System.out.println("Visit: twitter.com");
        history.addLast("twitter.com");

        System.out.println("Current history: " + history);

        System.out.println("Back button: " + history.removeLast());
        System.out.println("Current page: " + history.peekLast());

        System.out.println("Back button: " + history.removeLast());
        System.out.println("Current page: " + history.peekLast());
    }

    // Helper method for sliding window maximum
    public static int[] slidingWindowMaximum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements (they won't be max)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Add to result if window is complete
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    // Helper method for recent call counter
    public static void demonstrateRecentCallCounter() {
        class RecentCounter {
            Deque<Integer> calls;

            RecentCounter() {
                calls = new ArrayDeque<>();
            }

            int ping(int t) {
                calls.addLast(t);
                // Remove calls older than 3000ms
                while (!calls.isEmpty() && calls.peekFirst() < t - 3000) {
                    calls.pollFirst();
                }
                return calls.size();
            }
        }

        RecentCounter counter = new RecentCounter();
        System.out.println("ping(1): " + counter.ping(1) + " requests in last 3000ms");
        System.out.println("ping(100): " + counter.ping(100) + " requests in last 3000ms");
        System.out.println("ping(3001): " + counter.ping(3001) + " requests in last 3000ms");
        System.out.println("ping(3002): " + counter.ping(3002) + " requests in last 3000ms");
    }

    // Helper method for undo/redo
    public static void demonstrateUndoRedo() {
        class TextEditor {
            Deque<String> undoStack;
            Deque<String> redoStack;
            String current;

            TextEditor() {
                undoStack = new ArrayDeque<>();
                redoStack = new ArrayDeque<>();
                current = "";
            }

            void type(String text) {
                undoStack.push(current);
                current = current + text;
                redoStack.clear(); // Clear redo history
                System.out.println("Typed '" + text + "': " + current);
            }

            void undo() {
                if (!undoStack.isEmpty()) {
                    redoStack.push(current);
                    current = undoStack.pop();
                    System.out.println("Undo: " + current);
                }
            }

            void redo() {
                if (!redoStack.isEmpty()) {
                    undoStack.push(current);
                    current = redoStack.pop();
                    System.out.println("Redo: " + current);
                }
            }
        }

        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type(" World");
        editor.type("!");
        editor.undo();
        editor.undo();
        editor.redo();
    }
}
