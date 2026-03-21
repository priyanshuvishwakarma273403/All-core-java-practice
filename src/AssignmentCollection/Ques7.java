package AssignmentCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ques7 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.print(set+" ");

        System.out.println();

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        set.addAll(treeSet);
        System.out.println(set+ " ");
        System.out.println();

        Iterator<String> it2 = set.descendingIterator();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }

        System.out.println();
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        TreeSet<String> treeSet2;
        treeSet2 = (TreeSet<String>) treeSet.clone();
        System.out.print(treeSet2+" ");

        System.out.println();

        int size = treeSet2.size();
        System.out.println(size);

        TreeSet<String> treeSet3 = new TreeSet<>();
        treeSet3.add("Apple");
        treeSet3.add("Banana");
        treeSet3.add("Orange");

        TreeSet<String> treeSet4 = new TreeSet<>();
        treeSet4.add("Apple");
        treeSet4.add("Banana");
        treeSet4.add("Mango");

       for(String s: treeSet4){
           System.out.println(treeSet3.contains(s) ? "Yes" : "No");
       }

        System.out.println();

       TreeSet<Integer> list = new TreeSet<>();
       TreeSet<Integer> list2 = new TreeSet<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       list.add(7);
       list.add(8);
       list.add(9);
//       list2 = (TreeSet<Integer>) list.headSet(7);
//       Iterator it3 = list2.iterator();
//       while(it3.hasNext()){
//           System.out.print(it3.next()+" ");
//       }
        System.out.println();
        System.out.println(list.ceiling(4));
        System.out.println(list.floor(4));

        System.out.println(list.higher(4));
        System.out.println(list.lower(4));

        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        System.out.println(list.remove(4));
        System.out.println(list);

    }
}
