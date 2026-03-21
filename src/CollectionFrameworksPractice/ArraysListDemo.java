package CollectionFrameworksPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraysListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(55);
        list.add(60);
        list.add(70);
        System.out.println(list + " ");

        list.add(3, 80);
        System.out.println(list + " ");

//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(40);
//        list2.add(50);
//        list2.add(60);
//        list2.add(70);
//
//        list.addAll(2,list2);

//        list.clear();
//        System.out.println(list+" ");

        list.clone();
        System.out.println(list + " ");

        System.out.println(list.contains(40) + " ");

        System.out.println(list.get(3));

        System.out.println(list.indexOf(99));
        System.out.println(list.isEmpty());
        System.out.println(list.iterator().hasNext());

        System.out.println(list + " ");

//        System.out.println(list.lastIndexOf(8));
//        ListIterator<Integer> listIterator = list.listIterator();
//        for(Integer integer : list){
//            System.out.println(integer);
//        }


        list.removeIf(n -> n % 2 == 1);
        System.out.println(list + " ");


    }

}
