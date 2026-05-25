package codewithprayutosh.prefixSum;

public class PivotElement {

    public static int pivotIndex(int[] nums){
        int totalSum = 0;

        for(int ele : nums){
            totalSum+=ele;
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum+=nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }
}
