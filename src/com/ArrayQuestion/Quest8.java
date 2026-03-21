package com.ArrayQuestion;

import java.util.Arrays;

//Remove duplicate elements Eliminate repeated values and print the updated array.
public class Quest8 {
    static void main() {
        int []arr={43,54,32,1,3,35,65,87};
        print(arr);
        Arrays.sort(arr);
        System.out.println();
        print(arr);


    }

    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
