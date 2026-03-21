package com.ArrayQuestion;

public class SecondSmallest {
    static void main() {
        int [] arr ={43,5,56,43,76,86};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }


            }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<smin&&arr[i]!=min) {
                smin=arr[i];

            }
        }
        System.out.println("The minimum element is:"+min);
        System.out.println("The Second minimun element is:"+smin);
    }
}
