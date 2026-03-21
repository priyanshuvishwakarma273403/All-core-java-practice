package CollectionQuestion;

import java.util.*;

public class AnaGram {
    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();

        for(String s: str){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);

        }
        System.out.println(map.values());
    }
}
