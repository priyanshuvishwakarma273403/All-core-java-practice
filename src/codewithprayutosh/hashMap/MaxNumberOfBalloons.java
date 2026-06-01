package codewithprayutosh.hashMap;

import java.util.HashMap;

public class MaxNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {

        String balloon = "balloon";
        HashMap<Character, Integer> bfreq = new HashMap<>();
        HashMap<Character, Integer> tfreq = new HashMap<>();

        int res = Integer.MAX_VALUE;

        for(char ch : balloon.toCharArray()){
            bfreq.put(ch, bfreq.get(ch) == null ? 1 : bfreq.get(ch) + 1);
        }

        for(char ch : text.toCharArray()){
            tfreq.put(ch, tfreq.get(ch) == null ? 1 : tfreq.get(ch) + 1);
        }

        for(int i = 0; i < balloon.length(); i++){

            int count = tfreq.get(balloon.charAt(i)) == null ? 0 : tfreq.get(balloon.charAt(i))/bfreq.get(balloon.charAt(i));
            res = Math.min(res, count);
        }
        return res;
    }

    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));

    }
}
