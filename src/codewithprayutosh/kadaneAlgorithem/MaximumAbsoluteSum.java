package codewithprayutosh.kadaneAlgorithem;

public class MaximumAbsoluteSum {

    public static int maxAbsoluteSum(int[] arr) {
        int maxEnd = 0, maxSum = Integer.MIN_VALUE;
        int minEnd = 0, minSum = Integer.MIN_VALUE;

        for(int ele : arr){
            maxEnd = Math.max(ele , maxEnd + ele);
            maxSum = Math.max(maxSum, maxEnd);

            minEnd = Math.min(ele , minEnd + ele);
            minSum = Math.min(minSum, ele);

        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));

    }

    public static void main(String[] args) {
        int [] arr = {1,-3,2,3,-4};
        int reult = maxAbsoluteSum(arr);
        System.out.println(reult);
    }
}
