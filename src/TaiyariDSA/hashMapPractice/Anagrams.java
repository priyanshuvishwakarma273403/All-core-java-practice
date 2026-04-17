package TaiyariDSA.hashMapPractice;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "bseeg";
        if(s1.length() != s2.length()){
            System.out.println("Sizes are not equal And this are not Anagrams");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)){
                System.out.println("Not Anagram");
                return;
            }
            int freq = map.get(ch);
            if(freq == 0) return ;
            map.put(ch, freq - 1);
        }
        System.out.println("This is Anagram");

    }
}