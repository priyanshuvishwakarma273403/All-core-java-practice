package AssignmentCollection;

import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(9);
        System.out.println("Original Queue" +pq);

        Integer val = null ;
        while( (val = pq.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Apple");
        pq2.add("Banana");
        pq2.add("Orange");
        pq2.add("Watermelon");
        pq2.add("Pineapple");
        pq2.add("Pineapple");
        String str;
        str = pq2.toString();
        System.out.println(str + " ");

        System.out.println(str.getClass().getName());

        List<String> list = new ArrayList<>(pq2);
        System.out.println(list);
        System.out.println(list.getClass());


        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.peek());

        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.add("Apple");
        p1.add("Banana");
        p1.add("Orange");
        p1.add("Watermelon");

        PriorityQueue<String> p2 = new PriorityQueue<>();
        p2.add("Apple");
       p2.add("Guava");
       p2.add("Orange");

       for(String s: p1){
           System.out.println(p2.contains(s) ? "Yes" : "No");
       }

        System.out.println(p2.size());
       p2.clear();
        System.out.println(p2);
        System.out.println(p2.isEmpty());
        p1.offer("Aoole");
        System.out.println(p1);

        PriorityQueue<String> p3 = new PriorityQueue<>();
        p3.add("Apple");
        p3.add("Banana");
        p3.add("Orange");
        PriorityQueue<String> p4 = new PriorityQueue<>();
        p4.add("Apple");
        p4.add("Banana");
        p4.add("Orange");
        p3.addAll(p4);
        System.out.println(p3);


    }
}

