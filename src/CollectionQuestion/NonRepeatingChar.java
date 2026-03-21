package CollectionQuestion;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbcdde";
        Map<Character, Integer> map = new HashMap<>();
        for(char c :str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for( var e : map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
