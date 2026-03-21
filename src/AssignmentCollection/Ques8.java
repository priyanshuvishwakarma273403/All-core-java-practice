package AssignmentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Yellow");
        list.add("Blue");
        list.add("Red");
        System.out.print(list);
        System.out.println();

        for(String ele : list){
            System.out.print(ele+" ");
        }
        System.out.println();

        list.add(0,"Red");
        list.add(3,"Chocolate");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.set(0,"purple"));
        list.set(3,"SkyBlue");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        System.out.println(list.contains("Pink") ? "Yes" : "NO");

        List<String> list2 = new ArrayList<>();
        list2.add("Pink");
        list2.add("Yellow");
        list2.add("Blue");
        list2.add("Red");
        list2.add("Purple");
        Collections.copy(list,list2);
        System.out.println(list2);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list+" ");

        List<String> list4 = list.subList(0,2);
        System.out.println(list4+" ");
    }
}
