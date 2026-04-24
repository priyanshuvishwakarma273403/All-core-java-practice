package TaiyariDSA.hashMapPractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int [] arr = {2,11,7,5};
        int target = 12;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int [] arr = {0,0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]= map.get(target-nums[i]);
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
