package Practice;

import java.util.Arrays;

public class cwh_26 {
    public static void main(String[] args) {
        int [] arr = {93,43,54,65,4,23,57,4};
        int n = arr.length;
       for(int i=0;i<n/2;i++){
           int temp=arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=temp;
       }
        System.out.println("Original Array"+ Arrays.toString(arr));
    }
}
