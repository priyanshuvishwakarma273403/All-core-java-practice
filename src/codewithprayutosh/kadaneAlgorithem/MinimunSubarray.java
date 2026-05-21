package codewithprayutosh.kadaneAlgorithem;

public class MinimunSubarray {

    public static  int minSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = sum + nums[i];
            int v2 = nums[i];

           sum = Math.min(v1,v2);
           ans = Math.min(ans,sum);

        }
            return  ans;
    }

    public static void main(String[] args) {
        int[] nums ={3,-4, 2,-3,-1, 7,-5};
        int result = minSubArray(nums);
        System.out.println(result);
    }
}
