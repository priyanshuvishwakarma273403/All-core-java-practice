package com.ArrayQuestion;

import java.util.Arrays;

public class Reverse {
    static void main() {
        int [] arr = {54,75,42,12,65,76,43};
        int i=0,j=arr.length-1;

       while(i<j)
       {
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
           i++;
           j--;
       }
        for(int element:arr)
            {
            System.out.print(element+" ");
            }
    }

}
