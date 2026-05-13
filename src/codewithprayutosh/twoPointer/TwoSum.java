package codewithprayutosh.twoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

//    two sum
//    public  static int[] twoSum(int[] arr, int target){
//        int i = 0, j = arr.length-1;
//        while(i<j){
//            int sum = arr[i] + arr[j];
//            if(sum == target){
//                return new int[]{i,j};
//            }
//            else if(sum < target){
//                i++;
//            }
//            else if(sum > target){
//                j++;
//            }
//        }
//        return new int[] {-1,-1};
//    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target = 7;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
              map.get(complement);
            }
            map.put(arr[i], i);
        }


//        System.out.println(Arrays.toString(twoSum(arr,target)));
        //        while(i<j){
//            if(arr[i]+arr[j]==target){
//                System.out.println(arr[i] +" " +arr[j]);
//                return;
//            }else  if(arr[i]+arr[j]<target){
//                i++;
//            }
//            else if(arr[i]+arr[j]>target){
//                j++;
//            }
//            else{
//                System.out.println("target not found");
//            }
//        }
    }
}
