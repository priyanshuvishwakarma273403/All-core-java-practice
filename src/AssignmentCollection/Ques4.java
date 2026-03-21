package AssignmentCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ques4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        String val = map.get(6);
        System.out.println("Value of key 6 is : " + val);

        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        Set<Map.Entry<Integer, String>> set =  map.entrySet();
        System.out.println(set);

        System.out.println("Original"+map);
        if(map.containsValue("two")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        if(!map.containsValue("three")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        HashMap<Integer, String> map2 ;
        map2 = (HashMap<Integer, String>) map.clone();
        System.out.println(map2);

        boolean empty = map2.isEmpty();
        System.out.println(empty);

        map2.clear();
        System.out.println(map2.isEmpty());

        map.clear();
        System.out.println(map);

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "one");
        map3.put(2, "two");
        map3.put(3, "three");
        map3.put(4, "four");
        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(5, "one");
        map4.put(6, "two");
        map4.put(7, "three");
        map4.put(8, "four");
        map3.putAll(map4);
        System.out.println(map3);

        for(Map.Entry<Integer, String> entry : map3.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }

    }
}
