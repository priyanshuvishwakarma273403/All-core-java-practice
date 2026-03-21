package CollectionFrameworksPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list2 = Arrays.asList("Monday","Tuesday");
//        System.out.println(list2.get(1));
//        System.out.println(list2.getClass().getName());
//        list2.set(1,"Wednesday");
//        System.out.println(list2.get(1));

//        String [] arr = {"Apple","Banana","Orange","Watermelon"};
//        List<String> list =Arrays.asList(arr); // --> asList --> inner class of arrayList
//        System.out.println(list.getClass());
//
//        List<String> list2 =new ArrayList<>(list);
//        list2.set(4,"Peaches");
//        System.out.println(list2);

//        List<Integer> list3 =List.of(1,2,3,4); //list.of --> immutable
//        list3.set(1,33);  // throw an error unsupportedOperation
//        System.out.println(list3);

//        List<Integer> list2 =new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        list2.add(3);
//        list2.remove(2); //remove index
//        System.out.println(list2);
//        list2.remove(Integer.valueOf(3)); //currecnt number ko remove krega
//        System.out.println(list2);
//
//        Object [] array = list2.toArray();
//        Integer[] integers = list2.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(integers));

//        List<String> words = Arrays.asList("banana","apple","date");
//        words.sort((a,b) -> b.length()-a.length());
//        System.out.println(words);

        List<Integer> list  = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.sort((a , b) -> a - b);
        System.out.println(list);






    }
}
