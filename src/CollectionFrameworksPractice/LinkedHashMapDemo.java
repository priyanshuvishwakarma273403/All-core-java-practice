package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>(11,0.4f,true);
        map.put("Ankshit",28);
        map.put("Vivek",43);
       map.get("Gaurav");
       map.get("Chaodhary");
       map.get("Karan");
       map.get("Pandey");

       for(Map.Entry<String , Integer> entry : map.entrySet()){
           System.out.println(entry.getKey()+ " : " + entry.getValue());
       }

        HashMap<String,Integer> hashMap = new HashMap<>();
      LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);

      hashMap.put("Shubham",90);
      hashMap.put("Vaibhav",40);
      hashMap.put("Shashank",60);

        Integer res = hashMap.getOrDefault("Shubham", 0);
        hashMap.put("Shubham", 92);
        System.out.println(hashMap);
        System.out.println(res);
    }
}
