package TaiyariDSA.basicSorting;

import java.util.Arrays;

public class twoSumPair {
    public static void main(String[] args) {
        int [] arr = {0, -1, 2, -3, 1};
        int target = -2;
        Arrays.sort(arr);
        System.out.println(twoSum(arr,target));
    }

     static boolean  twoSum(int[] arr, int target) {
        int i= 0, j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target) return true;
            else if (arr[i] + arr[j] > target) j--;
            else if (arr[i] + arr[j] < target) i++;
        }
        return false;
    }
}
