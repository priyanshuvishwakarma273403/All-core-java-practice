package DSA_Leetcode;
//the question is
//Given an integer array nums, find the subarray
// with the largest sum, and return its sum.
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class MaximumSubArray {
    public static void main(String[] args) { //kadane Algo
        int [] arr = {5,4,-1,7,8};
        int n = arr.length;
        int max = arr[0],current = arr[0];
        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i],current+arr[i]);
            max = Math.max(max,current);
        }
        System.out.println(max);
    }
}
