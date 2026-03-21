package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;

public class MapCheck {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(1));


        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
