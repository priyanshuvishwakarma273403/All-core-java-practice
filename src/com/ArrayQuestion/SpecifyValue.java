package com.ArrayQuestion;

import java.util.Scanner;

public class SpecifyValue {
    static void main() {
        int [] arr ={43,54,65,76,87,98,12,32};
        int target =4;
        boolean flag = false; //false means target array me nhi hai
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                flag = true;
                break;
            }
        }
        if(flag==true) System.out.println("Element exist in the Array");
        else System.out.println("Element does not exist in the Array");



        // user se input element check
//        Scanner sc = new Scanner(System.in);
//        int [] arr ={43,54,65,76,87,98,12,32};
//        int target =sc.nextInt();
//        boolean flag = false; //false means target array me nhi hai
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i]==target) {
//                flag = true;
//                break;
//            }
//
//        }
//        if(flag==true) System.out.println("Element exist in the Array");
//        else System.out.println("Element does not exist in the Array");


    }
}
