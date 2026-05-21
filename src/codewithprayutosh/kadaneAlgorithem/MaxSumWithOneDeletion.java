package codewithprayutosh.kadaneAlgorithem;

public class MaxSumWithOneDeletion {

    public static int maximumSum(int[] nums) {
        int n = nums.length;

        int noDelete = nums[0];
        int oneDelete = nums[0];

        int res = nums[0];

        for (int i = 1; i < n; i++) {
            oneDelete = Math.max(noDelete, oneDelete + nums[i]);
            noDelete = Math.max(nums[i], noDelete + nums[i]);
            res = Math.max(res, Math.max(noDelete, oneDelete));
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, -2, 0, 3};

        System.out.println(maximumSum(nums));
    }
}