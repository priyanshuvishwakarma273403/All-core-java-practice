package codewithprayutosh.twoPointer;

public class TwoSumPair {

    public static void printUniquePairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);

                int leftValue = arr[left];
                int rightValue = arr[right];

                // skip duplicates
                while (left < right && arr[left] == leftValue) {
                    left++;
                }
                while (left < right && arr[right] == rightValue) {
                    right--;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 11};
        int target = 9;
        printUniquePairs(arr, target);
    }
}
