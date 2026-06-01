package codewithprayutosh.hashMap;

import java.util.HashMap;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int res = 0;
        boolean odd = false;
        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.get(ch) == null ? 1 : freq.get(ch) + 1);
        }

        for(int val : freq.values()) {
            if(val % 2 == 0) {
                res += val;
            }else{
                res += val - 1;
                odd = true;
            }
        }

        if(odd){
            res++;
        }
        if(res == 0){
            return 1;
        }else{
            return res;
        }

    }

    public static void main(String[] args) {
        String s = "dccaccd";
        System.out.println(longestPalindrome(s));
    }
}
