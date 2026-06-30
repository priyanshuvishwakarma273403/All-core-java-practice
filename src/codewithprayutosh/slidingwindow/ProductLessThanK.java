package codewithprayutosh.slidingwindow;

public class ProductLessThanK {
    public static void main(String[] args) {
        int [] nums = {10,5,2,6};
        int k = 100;

        System.out.println( numSubarrayProductLessThanK(nums,k));
    }

    private static int numSubarrayProductLessThanK(int[] nums, int k) {

        if( k <= 1 ) return 0;

        int left = 0;
        int ans = 0;
        int product = 1;

        for(int right = 0; right < nums.length; right++){
            product *= nums[right];

            while(product >= k){
                product /= nums[left];
                left++;
            }

            ans += right - left + 1;

        }
        return ans;
    }
}
