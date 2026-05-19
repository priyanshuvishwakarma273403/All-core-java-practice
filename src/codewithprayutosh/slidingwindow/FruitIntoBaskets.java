package codewithprayutosh.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static int totalFruits(int[] fruits) {
        int n = fruits.length;
        int left = 0, maxLen = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int right = 0; right < n; right++){
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            while(freq.size() > 2){
                int leftFruit = fruits[left];
                freq.put(leftFruit, freq.get(leftFruit) - 1);
                if(freq.get(leftFruit) == 0){
                    freq.remove(leftFruit);
                    left++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruits(fruits));
    }
}
