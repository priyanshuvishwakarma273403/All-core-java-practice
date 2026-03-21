package CollectionQuestion;

import java.util.*;

public class VectorMethodsDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Vector Methods Demonstration ===\n");
        Vector<String> vector = new Vector<>();
        // 1. add(E e) - Appends element to end
        System.out.println("1. add(E e):");
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("After add: " + vector);

        // 2. add(int index, E element) - Inserts at specified position
        System.out.println("\n2. add(int index, E element):");
        vector.add(1, "Avocado");
        System.out.println("After adding 'Avocado' at index 1: " + vector);

        // 3. addAll(Collection c) - Appends all elements from collection
        System.out.println("\n3. addAll(Collection c):");
        Vector<String> moreItems = new Vector<>(Arrays.asList("Date", "Elderberry"));
        vector.addAll(moreItems);
        System.out.println("After addAll: " + vector);

        // 4. addAll(int index, Collection c) - Inserts collection at position
        System.out.println("\n4. addAll(int index, Collection c):");
        Vector<String> insertItems = new Vector<>(Arrays.asList("Fig", "Grape"));
        vector.addAll(3, insertItems);
        System.out.println("After addAll at index 3: " + vector);

        // 5. addElement(E obj) - Adds element to end (legacy method)
        System.out.println("\n5. addElement(E obj):");
        vector.addElement("Honeydew");
        System.out.println("After addElement: " + vector);

        // 6. capacity() - Returns current capacity
        System.out.println("\n6. capacity():");
        System.out.println("Current capacity: " + vector.capacity());

        // 7. clone() - Returns a clone of vector
        System.out.println("\n7. clone():");
        @SuppressWarnings("unchecked")
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned vector: " + clonedVector);

        // 8. contains(Object o) - Checks if element exists
        System.out.println("\n8. contains(Object o):");
        System.out.println("Contains 'Banana': " + vector.contains("Banana"));
        System.out.println("Contains 'Mango': " + vector.contains("Mango"));

        // 9. containsAll(Collection c) - Checks if all elements exist
        System.out.println("\n9. containsAll(Collection c):");
        List<String> checkItems = Arrays.asList("Apple", "Banana");
        System.out.println("Contains all [Apple, Banana]: " + vector.containsAll(checkItems));

        // 10. copyInto(Object[] anArray) - Copies to array
        System.out.println("\n10. copyInto(Object[] anArray):");
        String[] copyArray = new String[vector.size()];
        vector.copyInto(copyArray);
        System.out.println("Copied to array: " + Arrays.toString(copyArray));

        // 11. elementAt(int index) - Returns element at index
        System.out.println("\n11. elementAt(int index):");
        System.out.println("Element at index 2: " + vector.elementAt(2));

        // 12. elements() - Returns enumeration
        System.out.println("\n12. elements():");
        System.out.print("Elements via Enumeration: ");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();


        // 13. ensureCapacity(int minCapacity) - Ensures minimum capacity
        System.out.println("\n13. ensureCapacity(int minCapacity):");
        System.out.println("Capacity before: " + vector.capacity());
        vector.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + vector.capacity());

        // 14. equals(Object o) - Compares for equality
        System.out.println("\n14. equals(Object o):");
        Vector<String> equalVector = new Vector<>(vector);
        System.out.println("Equals cloned vector: " + vector.equals(equalVector));

        // 15. firstElement() - Returns first element
        System.out.println("\n15. firstElement():");
        System.out.println("First element: " + vector.firstElement());

        // 16. forEach(Consumer action) - Performs action on each element
        System.out.println("\n16. forEach(Consumer action):");
        System.out.print("ForEach output: ");
        vector.forEach(item -> System.out.print(item + " "));
        System.out.println();

        // 17. get(int index) - Returns element at position
        System.out.println("\n17. get(int index):");
        System.out.println("Element at index 4: " + vector.get(4));

        // 18. hashCode() - Returns hash code
        System.out.println("\n18. hashCode():");
        System.out.println("Hash code: " + vector.hashCode());

        // 19. indexOf(Object o) - Returns first index of element
        System.out.println("\n19. indexOf(Object o):");
        System.out.println("Index of 'Cherry': " + vector.indexOf("Cherry"));
        System.out.println("Index of 'Mango': " + vector.indexOf("Mango"));

        // 20. indexOf(Object o, int index) - Returns index from starting position
        System.out.println("\n20. indexOf(Object o, int index):");
        vector.add("Apple"); // Add duplicate
        System.out.println("Index of 'Apple' from index 1: " + vector.indexOf("Apple", 1));

        // 21. insertElementAt(E obj, int index) - Inserts at index
        System.out.println("\n21. insertElementAt(E obj, int index):");
        vector.insertElementAt("Kiwi", 2);
        System.out.println("After insertElementAt: " + vector);

        // 22. isEmpty() - Tests if empty
        System.out.println("\n22. isEmpty():");
        System.out.println("Is empty: " + vector.isEmpty());
        Vector<String> emptyVector = new Vector<>();
        System.out.println("Empty vector is empty: " + emptyVector.isEmpty());

        // 23. iterator() - Returns iterator
        System.out.println("\n23. iterator():");
        System.out.print("Iterator output: ");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 24. lastElement() - Returns last element
        System.out.println("\n24. lastElement():");
        System.out.println("Last element: " + vector.lastElement());

        // 25. lastIndexOf(Object o) - Returns last index of element
        System.out.println("\n25. lastIndexOf(Object o):");
        System.out.println("Last index of 'Apple': " + vector.lastIndexOf("Apple"));

        // 26. lastIndexOf(Object o, int index) - Returns last index before position
        System.out.println("\n26. lastIndexOf(Object o, int index):");
        System.out.println("Last index of 'Apple' before index 5: " + vector.lastIndexOf("Apple", 5));

        // 27. listIterator() - Returns list iterator
        System.out.println("\n27. listIterator():");
        System.out.print("ListIterator output: ");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // 28. listIterator(int index) - Returns list iterator from position
        System.out.println("\n28. listIterator(int index):");
        System.out.print("ListIterator from index 3: ");
        ListIterator<String> listIterator2 = vector.listIterator(3);
        while (listIterator2.hasNext()) {
            System.out.print(listIterator2.next() + " ");
        }
        System.out.println();

        // Create a working copy for removal operations
        Vector<String> workingVector = new Vector<>(vector);

        // 29. remove(int index) - Removes element at position
        System.out.println("\n29. remove(int index):");
        String removed = workingVector.remove(2);
        System.out.println("Removed element at index 2: " + removed);
        System.out.println("After remove: " + workingVector);

        // 30. remove(Object o) - Removes first occurrence
        System.out.println("\n30. remove(Object o):");
        boolean isRemoved = workingVector.remove("Banana");
        System.out.println("Removed 'Banana': " + isRemoved);
        System.out.println("After remove: " + workingVector);

        // 31. removeAll(Collection c) - Removes all elements in collection
        System.out.println("\n31. removeAll(Collection c):");
        List<String> removeItems = Arrays.asList("Fig", "Grape");
        workingVector.removeAll(removeItems);
        System.out.println("After removeAll [Fig, Grape]: " + workingVector);

        // 32. removeElement(Object obj) - Removes first occurrence (legacy)
        System.out.println("\n32. removeElement(Object obj):");
        workingVector.removeElement("Cherry");
        System.out.println("After removeElement('Cherry'): " + workingVector);

        // 33. removeElementAt(int index) - Removes at index (legacy)
        System.out.println("\n33. removeElementAt(int index):");
        if (workingVector.size() > 2) {
            workingVector.removeElementAt(2);
            System.out.println("After removeElementAt(2): " + workingVector);
        }

        // 34. removeIf(Predicate filter) - Removes matching elements
        System.out.println("\n34. removeIf(Predicate filter):");
        Vector<String> filterVector = new Vector<>(Arrays.asList("Apple", "Avocado", "Banana", "Apricot"));
        filterVector.removeIf(s -> s.startsWith("A"));
        System.out.println("After removing items starting with 'A': " + filterVector);

        // 35. replaceAll(UnaryOperator operator) - Replaces all elements
        System.out.println("\n35. replaceAll(UnaryOperator operator):");
        Vector<String> replaceVector = new Vector<>(Arrays.asList("apple", "banana", "cherry"));
        replaceVector.replaceAll(String::toUpperCase);
        System.out.println("After replaceAll to uppercase: " + replaceVector);

        // 36. retainAll(Collection c) - Retains only specified elements
        System.out.println("\n36. retainAll(Collection c):");
        Vector<String> retainVector = new Vector<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        List<String> retainItems = Arrays.asList("Apple", "Cherry", "Elderberry");
        retainVector.retainAll(retainItems);
        System.out.println("After retainAll [Apple, Cherry, Elderberry]: " + retainVector);

        // 37. set(int index, E element) - Replaces element at position
        System.out.println("\n37. set(int index, E element):");
        Vector<String> setVector = new Vector<>(Arrays.asList("A", "B", "C"));
        String oldValue = setVector.set(1, "Z");
        System.out.println("Replaced '" + oldValue + "' with 'Z': " + setVector);

        // 38. setElementAt(E obj, int index) - Sets element at index (legacy)
        System.out.println("\n38. setElementAt(E obj, int index):");
        setVector.setElementAt("Y", 0);
        System.out.println("After setElementAt: " + setVector);


        // 39. setSize(int newSize) - Sets the size
        System.out.println("\n39. setSize(int newSize):");
        Vector<String> sizeVector = new Vector<>(Arrays.asList("A", "B", "C"));
        System.out.println("Original size: " + sizeVector.size() + ", " + sizeVector);
        sizeVector.setSize(5);
        System.out.println("After setSize(5): size=" + sizeVector.size() + ", " + sizeVector);
        sizeVector.setSize(2);
        System.out.println("After setSize(2): size=" + sizeVector.size() + ", " + sizeVector);


        // 40. size() - Returns number of elements
        System.out.println("\n40. size():");
        System.out.println("Size of vector: " + vector.size());

        // 41. sort(Comparator c) - Sorts the list
        System.out.println("\n41. sort(Comparator c):");
        Vector<String> sortVector = new Vector<>(Arrays.asList("Banana", "Apple", "Cherry", "Date"));
        sortVector.sort(String::compareTo);
        System.out.println("After natural sort: " + sortVector);
        sortVector.sort(Comparator.reverseOrder());
        System.out.println("After reverse sort: " + sortVector);

        // 42. spliterator() - Creates spliterator
        System.out.println("\n42. spliterator():");
        Spliterator<String> spliterator = vector.spliterator();
        System.out.print("Spliterator output: ");
        spliterator.forEachRemaining(item -> System.out.print(item + ", "));
        System.out.println();

        // 43. subList(int fromIndex, int toIndex) - Returns view of portion
        System.out.println("\n43. subList(int fromIndex, int toIndex):");
        List<String> subList = vector.subList(2, 5);
        System.out.println("SubList from index 2 to 5: " + subList);

        // 44. toArray() - Returns array of elements
        System.out.println("\n44. toArray():");
        Object[] array = vector.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 45. toArray(T[] a) - Returns typed array
        System.out.println("\n45. toArray(T[] a):");
        String[] stringArray = vector.toArray(new String[0]);
        System.out.println("String array: " + Arrays.toString(stringArray));


        // 46. toString() - Returns string representation
        System.out.println("\n46. toString():");
        System.out.println("toString: " + vector.toString());

        // 47. trimToSize() - Trims capacity to size
        System.out.println("\n47. trimToSize():");
        Vector<String> trimVector = new Vector<>(100);
        trimVector.add("A");
        trimVector.add("B");
        System.out.println("Capacity before trim: " + trimVector.capacity());
        trimVector.trimToSize();
        System.out.println("Capacity after trim: " + trimVector.capacity());

        // 48. clear() - Removes all elements
        System.out.println("\n48. clear():");
        Vector<String> clearVector = new Vector<>(Arrays.asList("A", "B", "C"));
        System.out.println("Before clear: " + clearVector);
        clearVector.clear();
        System.out.println("After clear: " + clearVector + ", size: " + clearVector.size());

        // 49. removeAllElements() - Removes all elements (legacy)
        System.out.println("\n49. removeAllElements():");
        Vector<String> removeAllVector = new Vector<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("Before removeAllElements: " + removeAllVector);
        removeAllVector.removeAllElements();
        System.out.println("After removeAllElements: " + removeAllVector + ", size: " + removeAllVector.size());

        System.out.println("\n=== Demonstration Complete ===");

    }
}
