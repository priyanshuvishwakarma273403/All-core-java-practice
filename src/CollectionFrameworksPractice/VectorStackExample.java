package CollectionFrameworksPractice;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorStackExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.addElement("C");  //Legacy Method

        System.out.println("Vector: " + vector);
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Size: " + vector.size());

        // Using Enumeration (legacy iterator)
        Enumeration<String> enumeration = vector.elements();
        System.out.println("\\nUsing Enumeration:");
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }

        Stack<Integer> stack = new Stack<>();  //LIFO (Last In First Out)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("\nStack : "+stack);

        System.out.println("Peek : "+stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Is empty? " + stack.empty());
    }
}
