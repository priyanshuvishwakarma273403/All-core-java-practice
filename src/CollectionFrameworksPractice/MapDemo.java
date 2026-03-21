package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Banana");
        map.put(2,"Daniel");
        map.put(3,"Rafael");

        System.out.println(map.get(2));
        map.remove(3);
        System.out.println(map.get(2));
    }
}
