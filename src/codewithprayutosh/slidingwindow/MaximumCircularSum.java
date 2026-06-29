package codewithprayutosh.slidingwindow;

public class MaximumCircularSum {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarray(nums));
    }

    public static int maxSubarray(int[] nums) {
        int total = 0;
        int maxSum = nums[0] , currMax = 0;
        int minSum = nums[0] , currMin = 0;

        for(int num : nums){
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin +  num, num);
            minSum = Math.min(minSum, currMin);

            total += num;
        }

        if(maxSum < 0){
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}
