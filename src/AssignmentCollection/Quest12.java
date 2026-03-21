package AssignmentCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Quest12 {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Blue");
//        for(String s : list){
//            System.out.println(s+" ");
//        }
//        System.out.println();
//
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            System.out.println((String)it.next());
//        }
//        System.out.println();
//
//        Iterator iterator = list.descendingIterator();
//        while(iterator.hasNext()){
//            System.out.println((String)iterator.next());
//        }
//        System.out.println();
//
//        list.add(1,"Yellow");
//        System.out.println(list+" ");
//
//        list.offerFirst("Purple");
//        System.out.println(list+" ");
//        list.offerLast("SkyBlue");
//        System.out.println(list+" ");
//
//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add("Black");
//        list2.add("Green");
//        list2.add("White");
//
//        list.addAll(1,list2);
//        System.out.println(list);
//
//        System.out.println(list.getFirst() + " ; " + list.getLast());
//
//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println("Index " + i + list.get(i));
//        }
//        System.out.println();
//
//        String remove = list.remove(2);
//        System.out.println(remove);
//        System.out.println(list);
//
//        list.removeFirst();
//        list.removeLast();
//        System.out.print(list+" ");
//        System.out.println();
//
//        Collections.swap(list,0,2);
//        System.out.println(list);
//        System.out.println();
//
//        Collections.shuffle(list);
//        System.out.println(list);

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Black");
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("White");
        list1.add("Purple");
        list1.add("SkyBlue");

        list.addAll(list1);
        System.out.print(list+" ");
        System.out.println();

        LinkedList<String>  list2;
        list2 = (LinkedList<String>) list.clone();
        System.out.println(list2);

        System.out.println();
        System.out.println( list.pop());
        System.out.println(list);

    }
}
