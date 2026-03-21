package CollectionFrameworksPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);

        Map<String,Integer> map2 = Collections.unmodifiableMap(map);
        System.out.println(map2);
//        map2.put("C",3); //throw unsupported exception
//        System.out.println(map2);

        Map<String,Integer> map3 = Map.of("Shubham",98,"Vivek",43);
        map3.put("Ankshit",28);
//        System.out.println(map3);

        Map<String,Integer> map4 = Map.ofEntries(Map.entry("Ankshit",28),Map.entry("Vivek",43));
        System.out.println(map4);


    }
}
