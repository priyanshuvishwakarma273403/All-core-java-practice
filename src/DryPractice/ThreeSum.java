package DryPractice;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int target  = 6;
        Arrays.sort(arr);
        threesum(arr,target);
    }

    private static void threesum(int[] arr, int target) {
        for(int i=0;i<arr.length-2;i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
                else if (sum > target) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
    }
}
