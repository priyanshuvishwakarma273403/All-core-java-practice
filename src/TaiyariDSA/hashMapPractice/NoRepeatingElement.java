package TaiyariDSA.hashMapPractice;

import java.util.HashSet;

public class NoRepeatingElement {
    public static void main(String[] args) {
        String s =  "geeksforgeeks";
        HashSet<Character> set = new HashSet<>();

        int i = 0, j = 0, maxLen = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);

            if (!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else {
                while (set.contains(ch)) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }

        System.out.println(maxLen);
    }
}
