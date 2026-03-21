package CollectionFrameworksPractice;

import java.util.*;

public class StackDemoPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(2);
        stack.push(3);

        System.out.println("After push(): " + stack);

        System.out.println("peek(): " + stack.peek()); // top element

        System.out.println("pop(): " + stack.pop());   // removes top
        System.out.println("After pop(): " + stack);

        System.out.println("empty(): " + stack.empty());

        System.out.println("search(10): " + stack.search(10)); // 1-based from top
        System.out.println("search(100): " + stack.search(100));

        stack.add(40);          // NOT recommended (but allowed)
        stack.addElement(50);   // legacy

        System.out.println("After Vector add methods: " + stack);
        System.out.println("get(1): " + stack.get(1));

        stack.set(1, 99);
        System.out.println("After set(): " + stack);

        stack.remove(1);
        System.out.println("After remove(index): " + stack);

        stack.removeElement(50);
        System.out.println("After removeElement(): " + stack);

        System.out.print("For-each: ");
        for (int x : stack) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        System.out.print("Enumeration (legacy): ");
        Enumeration<Integer> e = stack.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();


        System.out.println("capacity(): " + stack.capacity());
        System.out.println("size(): " + stack.size());

        stack.ensureCapacity(20);
        System.out.println("capacity after ensureCapacity(): " + stack.capacity());

        stack.trimToSize();
        System.out.println("capacity after trimToSize(): " + stack.capacity());

        Collections.sort(stack);
        System.out.println("After sort(): " + stack);

        Stack<Integer> clone = (Stack<Integer>) stack.clone();
        System.out.println("Cloned Stack: " + clone);

        Object[] arr = stack.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(stack);
        System.out.println("ArrayList: " + list);

        stack.clear();
        stack.pop();

        System.out.println("Final Stack: " + stack);
    }
}
