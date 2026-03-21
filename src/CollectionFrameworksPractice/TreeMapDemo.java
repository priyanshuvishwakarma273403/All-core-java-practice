package CollectionFrameworksPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"C");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map); //Sorted order

    }
}
