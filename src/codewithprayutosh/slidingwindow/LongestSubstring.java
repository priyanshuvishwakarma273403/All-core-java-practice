package codewithprayutosh.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int longestSubstring(String str , int k){
            int n = str.length();
            int low = 0, res = -1;

            Map<Character, Integer> freq = new HashMap<>();

            for (int high = 0; high < n; high++) {
                char c = str.charAt(high);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                while (freq.size() > k) {
                    char leftChar = str.charAt(low);
                    freq.put(leftChar, freq.get(leftChar) - 1);

                    if (freq.get(leftChar) == 0) {
                        freq.remove(leftChar);
                    }
                    low++; // ye hamesha chalega
                }

                if (freq.size() == k) {
                    res = Math.max(res, high - low + 1);
                }
            }
            return res;
    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        System.out.println(longestSubstring(str, k));
    }
}
