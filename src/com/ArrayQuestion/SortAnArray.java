package com.ArrayQuestion;

public class SortAnArray {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,2,1};
        sort(arr);
    }
    public static void sort(int[] arr){
        int low =0;
        int mid = 0;
        int high = arr.length-1;
        int temp=0;
        while(mid<=high){
            if(arr[mid]==0)
            {
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
