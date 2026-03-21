package CollectionFrameworksPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(3,"C");
        map.put(1,"Java");
        map.put(2,"Python");

        System.out.println(map); //insertion Order
    }
}
