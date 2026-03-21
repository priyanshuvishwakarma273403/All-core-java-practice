package DryPractice;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class Reverse {
    public static void main(String[] args) {
        int []arr = {32,45,67,54,34,67};
        int d=2;
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
//        for(int i=0;i<3;i++){
//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//            for(int j=3;j< arr.length;j++){
//                int temp2=arr[j];
//                arr[j]=arr[j-1];
//                arr[j-1]=temp2;
//            }
//
//
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        int i =0;
//        int j =arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//           i++;
//           j--;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//

//        while(i<j)
//        {
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        int n=3;
//        int m =arr.length-1;
//        while(n<m){
//            int temp=arr[n];
//            arr[n]=arr[i];
//            arr[i]=temp;
//            n++;
//            m--;
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//
    }
    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
