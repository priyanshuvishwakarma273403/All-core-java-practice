package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;

public class MapByValue {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"banana");
        map.put(2,"apple");
        map.put(3,"Mango");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
