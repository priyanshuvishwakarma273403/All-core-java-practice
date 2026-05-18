package codewithprayutosh.slidingwindow;

// Example 1:
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.

public class MinSubArrayLength {

    public static int minSubArrayLen(int[] arr, int target) {
        int n = arr.length;
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - left + 1);
                sum -= arr[left++];
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(arr, target));
    }
}
