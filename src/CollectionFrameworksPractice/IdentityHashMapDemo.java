package CollectionFrameworksPractice;

import java.util.HashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Vaibhav");
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
