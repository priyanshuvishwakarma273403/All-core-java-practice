package com.ArrayQuestion;

import static java.util.Collections.reverse;

public class SplitArray {
    static void main() {
        int [] arr ={32,53,65,24,76,6,54,65,3,21};
    int n = arr.length;
    int ele =n/2;  //when don,t know how many elements are in the array
    for(int i=0;i<ele;i++) {
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    for(int i=ele;i<n;i++) {
        System.out.print(arr[i]+" ");
    }
//        int n = arr.length;
//      for(int i=0;i<5;i++){ //know how many element are in the array
//          System.out.print(arr[i]+" ");
//
//      }
//        System.out.println();
//      for(int j =5;j<n;j++){
//          System.out.print(arr[j]+" ");
//      }

    }
}
