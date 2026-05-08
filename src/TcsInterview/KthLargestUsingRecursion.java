package TcsInterview;

import java.util.Arrays;

public class KthLargestUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 2;
        Arrays.sort(arr);
        System.out.println( sorting(arr,k));
    }

    private static int sorting(int[] arr, int k) {
        int n = arr.length;
        return arr[n - k];
    }
}
