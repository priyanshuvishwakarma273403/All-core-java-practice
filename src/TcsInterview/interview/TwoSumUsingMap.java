package TcsInterview.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumUsingMap {
    public static void main(String[] args) {
        int [] arr = {2,0,4,5,6};
        int target  = 7;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    // agar value return krna hoto hashset se kr skte hain
    private static int[] twoSum(int[] arr, int target) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : arr){
//           int rem = target - ele;
//           if(set.contains(rem)) return new int[]{ele,rem};
//           set.add(ele);
//        }
//        return new int[]{-1,-1}; //agar target naa mila tab


        //agar indices return krna hoto hashMAp
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};  // agar target naa mile tab
    }
}
