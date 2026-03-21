package CollectionFrameworksPractice;

import java.util.*;

public class VectorDemoClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());
        v.add(10);
        v.add(20);
        v.add(30);

        v.add(1,15);
        v.addElement(40);
        System.out.println("after add methods: "+v);

        System.out.println("get : "+v.get(2));
        System.out.println("element : "+ v.elementAt(1));
        System.out.println("First element : "+v.firstElement());
        System.out.println("Last element : "+v.lastElement());

        v.set(2,200);
        v.setElementAt(200,3);
        System.out.println("After set methods: "+v);

        System.out.println("contains(20): " + v.contains(200));
        System.out.println("indexOf(20): " + v.indexOf(200));
        System.out.println("lastIndexOf(20): " + v.lastIndexOf(200));

        v.remove(1);
        v.removeElement(30);
        v.removeElementAt(0);

        System.out.println("After remove methods: " + v);

        v.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity: " + v.capacity());

        v.trimToSize();
        System.out.println("Capacity after trimToSize: " + v.capacity());

        System.out.print("For-each: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        System.out.print("ListIterator: ");
        ListIterator<Integer> li = v.listIterator();
        while (li.hasNext()) System.out.print(li.next() + " ");
        while (li.hasPrevious()) System.out.print(li.previous() + " ");
        System.out.println();

        System.out.print("Enumeration (Vector special): ");
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements())
            System.out.print(e.nextElement() + " ");
        System.out.println();

        Collections.sort(v);
        System.out.println("Sorted Asc: " + v);

        v.sort((a, b) -> b - a);
        System.out.println("Sorted Desc: " + v);

        Vector<Integer> clone = (Vector<Integer>) v.clone();
        System.out.println("Cloned Vector: " + clone);

        Object[] arr = v.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(v);
        System.out.println("ArrayList: " + list);

        System.out.println("isEmpty(): " + v.isEmpty());
        System.out.println("size(): " + v.size());

        v.removeAllElements();
        System.out.println("After clear: " + v);
        
    }
}
