package CollectionFrameworksPractice;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>(17,0.5f);
        map.put(1,"Aashu");
        map.put(2,"Shubham");
        map.put(3,"Ankit");
        map.put(4,"Faiz");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);
        String s = map.get(41);  //null throw record me nhi hai
        System.out.println(s);

        System.out.println(map.containsKey(10));  //throw true or false
        System.out.println(map.containsValue("Arpit")); //throw true or false

        for(int i : map.keySet()){
            System.out.print(map.get(i)+" ");
        }

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer , String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map); // like object output with uppercase

//        map.remove(2);
//        System.out.println(map);

        boolean res = map.remove(2,"Saurabh");
        System.out.println("Removed  ? "+ res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(1,2,3,4,6,7);
        boolean contains = list.contains(7);
        System.out.println("Contains ? "+ contains);


    }
}
