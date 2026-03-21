package CollectionFrameworksPractice;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(10);
        list.addLast(20);
        System.out.println("After add methods : "+list );

        list.set(2,30);
        System.out.println("After set methods : "+list );

        list.remove(2);
        list.removeFirst();

        System.out.println("After remove methods : "+list );

        list.offer(50);
        list.offer(60);

        System.out.println("Peek " +list.peek());
        System.out.println("pool "+list.poll());
        System.out.println("After queue ops "+list);

        list.push(999);
        System.out.println("After push ops "+list);

        System.out.println(list.pop());
        System.out.println(list);

        System.out.println(list.contains(50));
        System.out.println("indexOf(50): " + list.indexOf(50));
        System.out.println("lastIndexOf(50): " + list.lastIndexOf(50));

        System.out.print("For-each: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        System.out.print("ListIterator forward/backward: ");
        ListIterator<Integer> it =  list.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        while(it.hasPrevious()) {
            System.out.print(it.previous()+" ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("Sorted list after sorting: "+list);

        list.sort((a,b) -> b-a);
        System.out.println("Sorted list after sorting: "+list);

        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());
        list.clear();
        System.out.println("After clear(): " + list);


    }
}
