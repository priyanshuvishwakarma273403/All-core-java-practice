package Practice;

import java.util.Arrays;

public class cwh_72 {
    static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        float sum = arr[0];
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        if (arr[i] > max) {
            max = arr[i];


        }
        else if (arr[i] < min) {
            min = arr[i];
        }
        float sum2 = ((sum-max-min)/(arr.length-2));
        System.out.println(sum2);


    }
}
