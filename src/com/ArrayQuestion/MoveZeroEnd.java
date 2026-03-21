package com.ArrayQuestion;

import java.util.Arrays;

public class MoveZeroEnd {
    static void main() {
        int [] arr = {32,54,0,56,0,43,0,43,54,0};
        int i =0;
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                j++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        while(i<arr.length){
            arr[i++]=0;

            }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
