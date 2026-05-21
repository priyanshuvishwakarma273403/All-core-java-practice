package codewithprayutosh.kadaneAlgorithem;

public class MaximumSubarray {

    public static  int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = sum + nums[i];
            int v2 = nums[i];

           sum = Math.max(v1,v2);
           ans = Math.max(ans,sum);

        }
            return  ans;
    }

    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
