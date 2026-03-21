package com.ArrayQuestion;

import java.util.Arrays;
//print two array  common element
//print Three array  common element
public class CommonValue {
    static void main() {
        int [] arr = {43,65,6,87,87};
        int [] arr1 = {43,65,5,9,5};
        int [] arr2 = {43,65,3,5,0};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    if(arr[i]==arr1[j]&&arr[i]==arr1[k]) {
                        System.out.println("Common element is "+(arr[i]));
                    }
                }


            }
        }
    }
}
