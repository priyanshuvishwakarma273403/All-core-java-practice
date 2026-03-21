package DSA_Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println("Enter k Number for rotate");
        int n = arr.length;
        int d = sc.nextInt();
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
      reverse(arr,0,n-1);
}

    private static void reverse(int[] arr, int left, int right) {
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
       for(int ele : arr){
           System.out.print(ele+" ");
       }
        System.out.println();
    }
}
