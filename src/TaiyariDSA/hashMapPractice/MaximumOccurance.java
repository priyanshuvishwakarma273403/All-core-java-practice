package TaiyariDSA.hashMapPractice;

import java.util.HashMap;

public class MaximumOccurance {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char maxArray = str.charAt(0);
        int maxCount = 0;
        for(char c : map.keySet()){
            if(map.get(c) > maxCount){
                maxCount = map.get(c);
                maxArray = c;
            }
        }
        System.out.println(maxArray);
    }
}
