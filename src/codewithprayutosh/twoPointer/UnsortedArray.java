package codewithprayutosh.twoPointer;

public class UnsortedArray {
    public static void main(String[] args) {

        int [] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static  int findUnsortedSubarray(int[] nums) {

        int n = nums.length;
        int start = -1;
        int end = -1;

        int max = nums[0];

        for(int i = 1;  i < n; i++){
            if(nums[i] < max){
                end = i;
            }else{
                max = nums[i];
            }
        }

        if(end == -1) return 0;

        int min = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            } else {
                min = nums[i];
            }
        }

        return end - start + 1;
    }
}
