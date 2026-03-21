package DryPractice;

import java.util.Arrays;

public class PositiveNegativeAlternate {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,-1,-2,3,4,-2,4,5,6,3,3};
        int n = arr.length;
        int [] result = new int[n];
        int positive = 0;
        int negative = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] >=0) {
                if (positive < n) {
                    result[positive] = arr[i];
                    positive += 2;
                }
            }
            else{
                if(negative<n) {
                    result[negative] = arr[i];
                    negative += 2;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
