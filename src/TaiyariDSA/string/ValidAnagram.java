package TaiyariDSA.string;

import java.util.Arrays;
//  time complexity O(nlog n)
// space O(1)

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "cars";
        String t = "rcas";
        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
