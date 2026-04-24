package TaiyariDSA.array;

import java.util.HashMap;

public class SubArraySumApproach1 {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
        subarraySum(arr,k);
    }

    private static int subarraySum(int[] arr, int k) {
        int ans = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // imp
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(map.containsKey(prefixSum - k)){
                ans = ans + map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
         return ans;
    }
}
