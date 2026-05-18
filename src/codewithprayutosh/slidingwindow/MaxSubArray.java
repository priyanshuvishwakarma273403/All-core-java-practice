package codewithprayutosh.slidingwindow;

public class MaxSubArray {

    public static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if(n < k) return 0;

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for(int i = k; i < n; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println( maxSubarraySum(arr,k));

    }
}
