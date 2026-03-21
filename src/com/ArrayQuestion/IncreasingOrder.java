package com.ArrayQuestion;

import java.util.Arrays;



public class IncreasingOrder {
    static void main() {
        int [] arr ={43,64,23,54,76,87};
        print(arr);
        Arrays.sort(arr);
        System.out.println();
        print(arr);

    }
    public static void print(int [] arr)
    {
        for(int i=0;i<arr.length;i++){ System.out.print(arr[i]+" ");}
    }
}
