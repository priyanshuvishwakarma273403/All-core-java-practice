package TaiyariDSA.array;

import java.util.Arrays;
//      time complexity O(nlog n)
//     space O(1)

public class KthLargestBruteForce {
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,6,4};
        int k = 3;
        System.out.println(largestK(arr, k));
    }

    private static int largestK(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
