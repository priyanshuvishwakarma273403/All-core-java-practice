package com.ArrayQuestion;

import java.util.Arrays;
//Print decreasing number
public class DecreasingOrder {
    static void main() {
        int []arr= {43,54,98,54,32,53};
        Arrays.sort(arr);
        int i =0 ,j=arr.length-1;
        while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
