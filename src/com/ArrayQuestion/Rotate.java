package com.ArrayQuestion;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class Rotate {
    static void main() {
        int [] arr ={32,43,32,65,43,56,54};
        int d = 3;
        d%=arr.length;
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
