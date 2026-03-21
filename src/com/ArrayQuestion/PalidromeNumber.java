package com.ArrayQuestion;

public class PalidromeNumber {
   public  static void main(String[]args) {
        int  [] arr ={1,2,1};
        if(isPalidrome(arr))
        {
            System.out.println("The number is palidrome");
        }
        else if (!isPalidrome(arr)){
            System.out.println("The number is not palidrome");
        }
    }
   public static boolean isPalidrome(int[] arr) {
        int num=0;
        int n = arr.length-1;
        while(num>n){
            if(arr[num]!=arr[n]){
                return false;
            }
            num++;
            n--;
        }
        return true;
    }
}
