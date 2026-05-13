package codewithprayutosh.twoPointer;

import java.util.Arrays;

public class TwoSum {

    public  static int[] twoSum(int[] arr, int target){
        int i = 0, j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i,j};
            }
            else if(sum < target){
                i++;
            }
            else if(sum > target){
                j++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target = 7;


        System.out.println(Arrays.toString(twoSum(arr,target)));
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
