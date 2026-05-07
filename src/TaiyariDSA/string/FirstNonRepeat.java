package TaiyariDSA.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "automation";
        Map<Character, Integer> charCount = new HashMap<>();
        for(char ch : str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }


        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

//        this is using loop
//        for(int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int count = 0;
//            for(int j = 0; j < str.length(); j++) {
//                if(str.charAt(j) == ch) {
//                    count++;
//                }
//            }
//            if(count == 1){
//                System.out.println("First non repeating character : "+ ch);
//                break;
//            }
//        }
    }
}
