package AssignmentCollection;

import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Green");
        hs.add("Purple");

        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Red");
        hs2.add("Blue");
        hs2.add("Green");
        hs2.add("Blue");

        System.out.println(hs.retainAll(hs2));
        System.out.println(hs);


        HashSet<String> hs3 = new HashSet<>();
        for(String s: hs){
            System.out.println(hs2.contains(s) ? "Yes" : "No");
        }

        HashSet<String> hs4 = new HashSet<>();
        hs4.add("Red");
        hs4.add("Blue");
        hs4.add("Green");
        hs4.add("Purple");

        List<String> list = new ArrayList<>(hs4);
        System.out.println(list);

        Set<String> hs5 = new TreeSet<>(hs4);
        for(String s: hs5){
            System.out.print(s+' ');
        }
        System.out.println();

        String[] arr = new  String[hs4.size()];
        hs4.toArray(arr);

        for(String s: arr){
            System.out.print(s + " ")  ;
        }
        System.out.println();

        HashSet<String> hs6;
        hs6 = (HashSet<String>) hs4.clone();
        System.out.println(hs6);

        hs6.clear();
        System.out.println(hs6);
        System.out.println(hs6.isEmpty());
        System.out.println(hs5.size());

        Iterator<String> it = hs5.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


    }
}
