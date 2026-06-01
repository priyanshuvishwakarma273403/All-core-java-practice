package codewithprayutosh.hashMap;

import java.util.HashMap;

public class RamsomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<ransomNote.length(); i++) {
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for(int i = 0; i<magazine.length(); i++) {
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(char ch : map1.keySet()) {
            if(!map2.containsKey(ch) || map2.get(ch) < map1.get(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
