package com.ArrayQuestion;
//Not done
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveIndex {
   public  static void main() {
    int [] arr ={43,65,65,34,34,78};
    int n = arr.length-1;
    int start = 0;
    for(int i=start;i<n;i++) {
        if(arr[i]==arr[n-1]) {
            System.out.println(arr[i]);

        }
        n--;
        start++;

    }





    }
}
