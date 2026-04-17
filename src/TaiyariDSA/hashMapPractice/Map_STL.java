package TaiyariDSA.hashMapPractice;

import java.util.HashMap;

public class Map_STL {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghavan", 24); map.put("Ash",19);
        map.put("Faiz", 24); map.put("Ankit",19);
        for(String key : map.keySet()){
            System.out.println(key + " " +map.get(key));
            System.out.println(map.size());
        }
    }
}
