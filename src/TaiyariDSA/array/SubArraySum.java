package TaiyariDSA.array;

import java.util.HashMap;

// output :   [1,1] (index 0-1)
//          [1,1] (index 1-2)

public class SubArraySum {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }

    private static int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int ele : arr){
            sum += ele;

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
