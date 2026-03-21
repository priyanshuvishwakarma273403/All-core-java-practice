package com.ArrayQuestion;

public class SecondLargest {
    static void main() {

        int [] arr ={43,65,65,43,76,100,98};
        int max = Integer.MIN_VALUE;

        int smax = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++) {
           if(arr[i]>max){
               max=arr[i];
           }
       }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>smax&&arr[i]!=max) {   //Skip the Largest Eliment
                smax=arr[i];
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The Second largest number is "+smax);


    }
}
