package CollectionQuestion;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedList Methods Demonstration ===\n");
        LinkedList<String> list = new LinkedList<>();
        System.out.println("1. add(E e)");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);
        System.out.println();

        System.out.println("2. add(int index, E element)");
        list.add(1, "Avocado");
        System.out.println("After add at index 1: " + list);
        System.out.println();

        System.out.println("3. addAll(Collection<? extends E> c)");
        List<String> newFruits = Arrays.asList("Date", "Elderberry");
        list.addAll(newFruits);
        System.out.println("After addAll: " + list);
        System.out.println();

        // 4. addAll(int index, Collection<? extends E> c) - Inserts collection at position
        System.out.println("4. addAll(int index, Collection<? extends E> c)");
        List<String> moreFruits = Arrays.asList("Fig", "Grape");
        list.addAll(2, moreFruits);
        System.out.println("After addAll at index 2: " + list);
        System.out.println();

        // 5. addFirst(E e) - Inserts at beginning
        System.out.println("5. addFirst(E e)");
        list.addFirst("Apricot");
        System.out.println("After addFirst: " + list);
        System.out.println();

        // 6. addLast(E e) - Appends to the end
        System.out.println("6. addLast(E e)");
        list.addLast("Honeydew");
        System.out.println("After addLast: " + list);
        System.out.println();

        // 7. size() - Returns number of elements
        System.out.println("7. size()");
        System.out.println("List size: " + list.size());
        System.out.println();

        // 8. get(int index) - Returns element at position
        System.out.println("8. get(int index)");
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println();

        // 9. getFirst() - Returns first element
        System.out.println("9. getFirst()");
        System.out.println("First element: " + list.getFirst());
        System.out.println();

        // 10. getLast() - Returns last element
        System.out.println("10. getLast()");
        System.out.println("Last element: " + list.getLast());
        System.out.println();

        // 11. contains(Object o) - Checks if element exists
        System.out.println("11. contains(Object o)");
        System.out.println("Contains 'Banana': " + list.contains("Banana"));
        System.out.println("Contains 'Mango': " + list.contains("Mango"));
        System.out.println();

        // 12. indexOf(Object o) - Returns first occurrence index
        System.out.println("12. indexOf(Object o)");
        list.add("Apple"); // Add duplicate
        System.out.println("List: " + list);
        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Index of 'Mango': " + list.indexOf("Mango"));
        System.out.println();

//        / 13. lastIndexOf(Object o) - Returns last occurrence index
        System.out.println("13. lastIndexOf(Object o)");
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));
        System.out.println();

        // 14. set(int index, E element) - Replaces element at position
        System.out.println("14. set(int index, E element)");
        String old = list.set(3, "Blueberry");
        System.out.println("Replaced '" + old + "' with 'Blueberry': " + list);
        System.out.println();

        // 15. element() - Retrieves but doesn't remove head
        System.out.println("15. element()");
        System.out.println("Head element: " + list.element());
        System.out.println("List unchanged: " + list);
        System.out.println();

        // 16. peek() - Retrieves but doesn't remove head
        System.out.println("16. peek()");
        System.out.println("Peek: " + list.peek());
        System.out.println();

        // 17. peekFirst() - Retrieves first element or null
        System.out.println("17. peekFirst()");
        System.out.println("Peek first: " + list.peekFirst());
        System.out.println();

        // 18. peekLast() - Retrieves last element or null
        System.out.println("18. peekLast()");
        System.out.println("Peek last: " + list.peekLast());
        System.out.println();

        // 19. offer(E e) - Adds element as tail
        System.out.println("19. offer(E e)");
        boolean offered = list.offer("Kiwi");
        System.out.println("Offer 'Kiwi' successful: " + offered);
        System.out.println("List: " + list);
        System.out.println();

        // 20. offerFirst(E e) - Inserts at front
        System.out.println("20. offerFirst(E e)");
        list.offerFirst("Lemon");
        System.out.println("After offerFirst: " + list);
        System.out.println();

        // 21. offerLast(E e) - Inserts at end
        System.out.println("21. offerLast(E e)");
        list.offerLast("Lime");
        System.out.println("After offerLast: " + list);
        System.out.println();

        // 22. poll() - Retrieves and removes head
        System.out.println("22. poll()");
        String polled = list.poll();
        System.out.println("Polled: " + polled);
        System.out.println("List: " + list);
        System.out.println();

        // 23. pollFirst() - Retrieves and removes first
        System.out.println("23. pollFirst()");
        String pollFirst = list.pollFirst();
        System.out.println("Poll first: " + pollFirst);
        System.out.println("List: " + list);
        System.out.println();

        // 24. pollLast() - Retrieves and removes last
        System.out.println("24. pollLast()");
        String pollLast = list.pollLast();
        System.out.println("Poll last: " + pollLast);
        System.out.println("List: " + list);
        System.out.println();

        // 25. push(E e) - Pushes element onto stack
        System.out.println("25. push(E e)");
        list.push("Mango");
        System.out.println("After push: " + list);
        System.out.println();

        // 26. pop() - Pops element from stack
        System.out.println("26. pop()");
        String popped = list.pop();
        System.out.println("Popped: " + popped);
        System.out.println("List: " + list);
        System.out.println();


        // 27. remove() - Retrieves and removes head
        System.out.println("27. remove()");
        String removed = list.remove();
        System.out.println("Removed head: " + removed);
        System.out.println("List: " + list);
        System.out.println();

        // 28. remove(int index) - Removes element at position
        System.out.println("28. remove(int index)");
        String removedAt = list.remove(2);
        System.out.println("Removed at index 2: " + removedAt);
        System.out.println("List: " + list);
        System.out.println();

        // 29. remove(Object o) - Removes first occurrence
        System.out.println("29. remove(Object o)");
        boolean removedObj = list.remove("Apple");
        System.out.println("Removed 'Apple': " + removedObj);
        System.out.println("List: " + list);
        System.out.println();

        // 30. removeFirst() - Removes and returns first
        System.out.println("30. removeFirst()");
        String removeFirst = list.removeFirst();
        System.out.println("Removed first: " + removeFirst);
        System.out.println("List: " + list);
        System.out.println();

        // 31. removeLast() - Removes and returns last
        System.out.println("31. removeLast()");
        String removeLast = list.removeLast();
        System.out.println("Removed last: " + removeLast);
        System.out.println("List: " + list);
        System.out.println();

        // Add duplicates for removeFirstOccurrence and removeLastOccurrence
        list.add("Banana");
        list.add(0, "Banana");
        System.out.println("List with duplicates: " + list);

        // 32. removeFirstOccurrence(Object o)
        System.out.println("32. removeFirstOccurrence(Object o)");
        boolean removedFirstOcc = list.removeFirstOccurrence("Banana");
        System.out.println("Removed first occurrence of 'Banana': " + removedFirstOcc);
        System.out.println("List: " + list);
        System.out.println();

        // 33. removeLastOccurrence(Object o)
        System.out.println("33. removeLastOccurrence(Object o)");
        boolean removedLastOcc = list.removeLastOccurrence("Banana");
        System.out.println("Removed last occurrence of 'Banana': " + removedLastOcc);
        System.out.println("List: " + list);
        System.out.println();

        // 34. listIterator(int index) - Returns list iterator
        System.out.println("34. listIterator(int index)");
        ListIterator<String> listIter = list.listIterator(1);
        System.out.println("Iterating from index 1:");
        while (listIter.hasNext()) {
            System.out.print(listIter.next() + " ");
        }
        System.out.println("\n");

        // 35. descendingIterator() - Returns reverse iterator
        System.out.println("35. descendingIterator()");
        Iterator<String> descIter = list.descendingIterator();
        System.out.println("Descending order:");
        while (descIter.hasNext()) {
            System.out.print(descIter.next() + " ");
        }
        System.out.println("\n");

        // 36. toArray() - Returns array
        System.out.println("36. toArray()");
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println();

        // 37. toArray(T[] a) - Returns typed array
        System.out.println("37. toArray(T[] a)");
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("String array: " + Arrays.toString(stringArray));
        System.out.println();

        // 38. clone() - Returns shallow copy
        System.out.println("38. clone()");
        @SuppressWarnings("unchecked")
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Original: " + list);
        System.out.println("Cloned: " + clonedList);
        clonedList.add("Orange");
        System.out.println("After modifying clone:");
        System.out.println("Original: " + list);
        System.out.println("Cloned: " + clonedList);
        System.out.println();

        // 39. spliterator() - Creates spliterator
        System.out.println("39. spliterator()");
        Spliterator<String> spliterator = list.spliterator();
        System.out.println("Using spliterator:");
        spliterator.forEachRemaining(item -> System.out.print(item + " "));
        System.out.println("\n");

        // 40. clear() - Removes all elements
        System.out.println("40. clear()");
        list.clear();
        System.out.println("After clear, size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println();

        // Test peek methods on empty list
        System.out.println("Testing peek methods on empty list:");
        System.out.println("peekFirst on empty: " + list.peekFirst());
        System.out.println("peekLast on empty: " + list.peekLast());
        System.out.println("peek on empty: " + list.peek());

        System.out.println("\n=== All LinkedList methods demonstrated! ===");


    }
}
