package CollectionFrameworksPractice;

import java.util.*;
import java.util.stream.Collectors;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("=== PriorityQueue Method Demonstrations ===\n");

        // PriorityQueue-specific methods
        demonstratePriorityQueueMethods();

        // Methods from AbstractQueue
        demonstrateAbstractQueueMethods();

        // Methods from AbstractCollection
        demonstrateAbstractCollectionMethods();

        // Methods from Object class
        demonstrateObjectMethods();

        // Methods from Collection interface
        demonstrateCollectionInterfaceMethods();

        // Custom comparator examples
        demonstrateCustomComparator();

        // Practical examples
        demonstratePracticalExamples();
    }

    public static void demonstratePriorityQueueMethods()
    {
        System.out.println("=== PriorityQueue Instance Methods ===\n");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("--- add(E e) ---");
        boolean added1 = pq.add(5);
        boolean added2 = pq.add(2);
        boolean added3 = pq.add(8);
        pq.add(1);
        pq.add(9);
        System.out.println("Added elements: 5, 2, 8, 1, 9");
        System.out.println("Add operations successful: " + added1 + ", " + added2 + ", " + added3);
        System.out.println("Current queue: " + pq);
        System.out.println();

        // 2. offer(E e)
        System.out.println("--- offer(E e) ---");
        boolean offered = pq.offer(3);
        System.out.println("Offered element 3: " + offered);
        System.out.println("Queue after offer: " + pq);
        System.out.println();

        // 3. peek()
        System.out.println("--- peek() ---");
        Integer head = pq.peek();
        System.out.println("Head element (without removing): " + head);
        System.out.println("Queue size after peek: " + pq.size());
        System.out.println();

        // 4. poll()
        System.out.println("--- poll() ---");
        Integer polled1 = pq.poll();
        Integer polled2 = pq.poll();
        System.out.println("First poll: " + polled1);
        System.out.println("Second poll: " + polled2);
        System.out.println("Queue after polling: " + pq);
        System.out.println();

        // Re-populate for other demonstrations
        pq.addAll(Arrays.asList(10, 4, 7, 6));

        // 5. contains(Object o)
        System.out.println("--- contains(Object o) ---");
        System.out.println("Contains 5: " + pq.contains(5));
        System.out.println("Contains 100: " + pq.contains(100));
        System.out.println();

        // 6. size()
        System.out.println("--- size() ---");
        System.out.println("Queue size: " + pq.size());
        System.out.println();

        // 7. toArray()
        System.out.println("--- toArray() ---");
        Object[] array1 = pq.toArray();
        System.out.println("Array representation: " + Arrays.toString(array1));
        System.out.println();

        // 8. toArray(T[] a)
        System.out.println("--- toArray(T[] a) ---");
        Integer[] array2 = pq.toArray(new Integer[0]);
        System.out.println("Typed array: " + Arrays.toString(array2));
        Integer[] array3 = pq.toArray(new Integer[pq.size()]);
        System.out.println("Pre-sized array: " + Arrays.toString(array3));
        System.out.println();

        // 9. iterator()
        System.out.println("--- iterator() ---");
        System.out.print("Iterating through queue: ");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Note: Iterator order is NOT guaranteed to be in priority order!");
        System.out.println();

        // 10. forEach(Consumer action)
        System.out.println("--- forEach(Consumer<? super E> action) ---");
        System.out.print("ForEach printing: ");
        pq.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println();

        // 11. spliterator()
        System.out.println("--- spliterator() ---");
        Spliterator<Integer> spliterator = pq.spliterator();
        System.out.print("Spliterator elements: ");
        spliterator.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Spliterator characteristics: " + spliterator.characteristics());
        System.out.println();

        // 12. comparator()
        System.out.println("--- comparator() ---");
        Comparator<? super Integer> comp = pq.comparator();
        if (comp == null) {
            System.out.println("Comparator: null (using natural ordering)");
        } else {
            System.out.println("Comparator: " + comp);
        }
        System.out.println();

        // 13. remove(Object o)
        System.out.println("--- remove(Object o) ---");
        System.out.println("Before remove: " + pq);
        boolean removed = pq.remove(5);
        System.out.println("Removed element 5: " + removed);
        System.out.println("After remove: " + pq);
        boolean removed2 = pq.remove(999);
        System.out.println("Tried to remove 999 (not present): " + removed2);
        System.out.println();

        // 14. removeAll(Collection<?> c)
        System.out.println("--- removeAll(Collection<?> c) ---");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(pq);
        boolean removedAll = pq2.removeAll(Arrays.asList(3, 8, 9));
        System.out.println("Removed all [3, 8, 9]: " + removedAll);
        System.out.println("Queue after removeAll: " + pq2);
        System.out.println();

        // 15. retainAll(Collection<?> c)
        System.out.println("--- retainAll(Collection<?> c) ---");
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(pq);
        boolean retained = pq3.retainAll(Arrays.asList(4, 6, 7, 10));
        System.out.println("Retained only [4, 6, 7, 10]: " + retained);
        System.out.println("Queue after retainAll: " + pq3);
        System.out.println();

        // 16. removeIf(Predicate filter)
        System.out.println("--- removeIf(Predicate<? super E> filter) ---");
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(pq);
        boolean removedIf = pq4.removeIf(e -> e > 5);
        System.out.println("Removed elements > 5: " + removedIf);
        System.out.println("Queue after removeIf: " + pq4);
        System.out.println();

        // 17. clear()
        System.out.println("--- clear() ---");
        PriorityQueue<Integer> pq5 = new PriorityQueue<>(pq);
        System.out.println("Before clear - size: " + pq5.size());
        pq5.clear();
        System.out.println("After clear - size: " + pq5.size());
        System.out.println("Is empty: " + pq5.isEmpty());
        System.out.println();

    }

    public static void demonstrateAbstractQueueMethods(){
        System.out.println("=== Methods from AbstractQueue ===\n");

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList("Banana", "Apple", "Cherry", "Date"));

        // 1. addAll(Collection c)
        System.out.println("--- addAll(Collection c) ---");
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        boolean addedAll = queue2.addAll(Arrays.asList("Grape", "Fig", "Elderberry"));
        System.out.println("Added all elements: " + addedAll);
        System.out.println("Queue after addAll: " + queue2);
        System.out.println();

        // 2. element()
        System.out.println("--- element() ---");
        String head = queue.element();
        System.out.println("Head element (throws exception if empty): " + head);
        System.out.println("Queue after element(): " + queue);
        System.out.println();

        // 3. remove()
        System.out.println("--- remove() ---");
        String removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after remove(): " + queue);
        System.out.println("Note: remove() throws exception if queue is empty");
        System.out.println();

        // Demonstrating exception handling
        System.out.println("--- Exception Handling ---");
        PriorityQueue<String> emptyQueue = new PriorityQueue<>();  //agar element hai to catch me
        // nhi jayega element remove kr dega
        try {
            emptyQueue.element();
        } catch (NoSuchElementException e) {
            System.out.println("element() on empty queue: NoSuchElementException caught");
        }

        try {
            emptyQueue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("remove() on empty queue: NoSuchElementException caught");
        }
        System.out.println();

    }

    public static void demonstrateAbstractCollectionMethods()
    {
        System.out.println("=== Methods from AbstractCollection ===\n");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5, 2, 8, 1, 9, 3));

        // 1. containsAll(Collection<?> c)
        System.out.println("--- containsAll(Collection<?> c) ---");
        boolean containsAll1 = pq.containsAll(Arrays.asList(2, 5, 8));
        boolean containsAll2 = pq.containsAll(Arrays.asList(2, 100));
        System.out.println("Contains all [2, 5, 8]: " + containsAll1);
        System.out.println("Contains all [2, 100]: " + containsAll2);
        System.out.println();

        // 2. isEmpty()
        System.out.println("--- isEmpty() ---");
        System.out.println("Queue is empty: " + pq.isEmpty());
        PriorityQueue<Integer> emptyPq = new PriorityQueue<>();
        System.out.println("Empty queue is empty: " + emptyPq.isEmpty());
        System.out.println();

        // 3. toString()
        System.out.println("--- toString() ---");
        System.out.println("Queue toString(): " + pq.toString());
        System.out.println();
    }

    public static void  demonstrateObjectMethods()
    {
        System.out.println("=== Methods from Object Class ===\n");

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Arrays.asList(1, 2, 3));
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Arrays.asList(1, 2, 3));
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Arrays.asList(4, 5, 6));

        // 1. equals(Object obj)
        System.out.println("--- equals(Object obj) ---");
        System.out.println("pq1 equals pq2: " + pq1.equals(pq2));
        System.out.println("pq1 equals pq3: " + pq1.equals(pq3));
        System.out.println("Note: PriorityQueue doesn't override equals, uses Object.equals (reference equality)");
        System.out.println();

        // 2. hashCode()
        System.out.println("--- hashCode() ---");
        System.out.println("pq1 hashCode: " + pq1.hashCode());
        System.out.println("pq2 hashCode: " + pq2.hashCode());
        System.out.println("Note: PriorityQueue doesn't override hashCode, uses Object.hashCode");
        System.out.println();

        // 3. getClass()
        System.out.println("--- getClass() ---");
        System.out.println("Class: " + pq1.getClass());
        System.out.println("Simple name: " + pq1.getClass().getSimpleName());
        System.out.println();

        // 4. clone() - Note: PriorityQueue doesn't override clone
        System.out.println("--- clone() ---");
        System.out.println("PriorityQueue doesn't override clone() method");
        System.out.println("Use constructor with collection parameter for copying");
        PriorityQueue<Integer> copy = new PriorityQueue<>(pq1);
        System.out.println("Original: " + pq1);
        System.out.println("Copy: " + copy);
        System.out.println();

        // 5. notify(), notifyAll(), wait() - Threading methods
        System.out.println("--- Threading Methods ---");
        System.out.println("notify(), notifyAll(), wait() are used for thread synchronization");
        System.out.println("These are rarely used directly with PriorityQueue");
        System.out.println();

        // 6. finalize() - Deprecated
        System.out.println("--- finalize() ---");
        System.out.println("finalize() is deprecated since Java 9");
        System.out.println();


    }

    public static void demonstrateCollectionInterfaceMethods(){
        System.out.println("=== Methods from Collection Interface ===\n");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(10, 5, 20, 15, 30, 25));
        // 1. stream()
        System.out.println("--- stream() ---");
        System.out.print("Stream - filter even numbers: ");
        pq.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Stream - map and collect: ");
        List<Integer> doubled = pq.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(doubled);
        System.out.println();

        // 2. parallelStream()
        System.out.println("--- parallelStream() ---");
        int sum = pq.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel stream sum: " + sum);

        long count = pq.parallelStream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Count of elements > 10: " + count);
        System.out.println();

        // 3. toArray(IntFunction<T[]> generator) - Java 11+
        System.out.println("--- toArray(IntFunction<T[]> generator) ---");
        Integer[] generatedArray = pq.toArray(Integer[]::new);
        System.out.println("Array via generator: " + Arrays.toString(generatedArray));
        System.out.println();
    }

    public static void demonstrateCustomComparator(){
        System.out.println("=== Custom Comparator Examples ===\n");

        // 1. Reverse order (max heap)
        System.out.println("--- Reverse Order (Max Heap) ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(Arrays.asList(5, 2, 8, 1, 9, 3));
        System.out.println("Max heap queue: " + maxHeap);
        System.out.println("Polling from max heap: " + maxHeap.poll() + " (highest)");
        System.out.println("Next poll: " + maxHeap.poll());
        System.out.println("Comparator: " + maxHeap.comparator());
        System.out.println();

        // 2. Custom object with comparator
        System.out.println("--- Custom Object with Comparator ---");

        class Task{
            String name;
            int priority;

            Task(String name, int priority){
                this.name = name;
                this.priority = priority;
            }
            @Override
            public String toString() {
                return name + "(priority:" + priority + ")";
            }
        }
        // Sort by priority (lower number = higher priority)
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                Comparator.comparingInt(t -> t.priority)
        );
        taskQueue.add(new Task("Email", 3));
        taskQueue.add(new Task("Meeting", 1));
        taskQueue.add(new Task("Report", 2));
        taskQueue.add(new Task("Coffee", 5));

        System.out.println("Task queue: " + taskQueue);
        System.out.println("Processing tasks in priority order:");
        System.out.println("Task queue: " + taskQueue);
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println("  Processing: " + taskQueue.poll());
        }
        System.out.println();

        // 3. String comparator by length
        System.out.println("--- String by Length ---");
        PriorityQueue<String> lengthQueue = new PriorityQueue<>(
                Comparator.comparingInt(String::length)
                        .thenComparing(String::compareTo)
        );
        lengthQueue.addAll(Arrays.asList("a", "abc", "ab", "abcde", "abcd"));

        System.out.println("Queue sorted by length: " + lengthQueue);
        System.out.print("Polling by length: ");
        while (!lengthQueue.isEmpty()) {
            System.out.print(lengthQueue.poll() + " ");
        }
        System.out.println("\n");
    }

    public static void demonstratePracticalExamples(){
        System.out.println("=== Practical Examples ===\n");

        // Example 1: Top K elements
        System.out.println("--- Finding Top 3 Elements ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] numbers = {4, 7, 2, 9, 1, 5, 8, 3, 6};
        int k = 3;
        for(int num :  numbers){
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        System.out.println("Top " + k + " elements from " + Arrays.toString(numbers));
        System.out.println("Result: " + minHeap);
        System.out.println();

        // Example 2: Merge sorted lists
        System.out.println("--- Merging Sorted Lists ---");
        List<Integer> list1 = Arrays.asList(1, 4, 7);
        List<Integer> list2 = Arrays.asList(2, 5, 8);
        List<Integer> list3 = Arrays.asList(3, 6, 9);

        PriorityQueue<Integer> mergeQueue = new PriorityQueue<>();
        mergeQueue.addAll(list1);
        mergeQueue.addAll(list2);
        mergeQueue.addAll(list3);

        List<Integer> merged = new ArrayList<>();
        while (!mergeQueue.isEmpty()) {
            merged.add(mergeQueue.poll());
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("Merged: " + merged);
        System.out.println();

        // Example 3: Event scheduling
        System.out.println("--- Event Scheduling ---");
        class Event{
            String name;
            int time;

            Event(String name, int time) {
                this.name = name;
                this.time = time;
            }

            @Override
            public String toString() {
                return name + "@" + time + "min";
            }
        }

        PriorityQueue<Event> eventQueue = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.time)
        );

        eventQueue.offer(new Event("Lunch", 60));
        eventQueue.offer(new Event("Meeting", 30));
        eventQueue.offer(new Event("Standup", 15));
        eventQueue.offer(new Event("Break", 45));

        System.out.println("Events scheduled:");
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("  " + event.name + " at " + event.time + " minutes");
        }
        System.out.println();

        // Example 4: Median finder
        System.out.println("--- Finding Median with Two Heaps ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeapForMedian = new PriorityQueue<>();

        int[] stream = {5, 15, 1, 3, 8};

        for (int num : stream) {
            // Add to max heap (left side)
            maxHeap.offer(num);
            // Balance heaps
            minHeapForMedian.offer(maxHeap.poll());

            if (minHeapForMedian.size() > maxHeap.size()) {
                maxHeap.offer(minHeapForMedian.poll());
            }
            // Calculate median
            double median;
            if (maxHeap.size() == minHeapForMedian.size()) {
                median = (maxHeap.peek() + minHeapForMedian.peek()) / 2.0;
            } else {
                median = maxHeap.peek();
            }
            System.out.println("After adding " + num + ", median = " + median);
        }

        System.out.println("\n=== Demo Complete ===");
    }
}
