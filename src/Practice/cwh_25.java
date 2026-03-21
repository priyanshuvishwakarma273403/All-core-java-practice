package Practice;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class cwh_25 {
    public static void main(String[] args) {
        int [] arr = {23,3,43,54,67,34,87,1,9};
        int n = arr.length;
       // int max = Math.max(arr.length, arr[0]);
       for(int i=1;i<arr.length;i++){
           if(arr[i]>n){
               n=arr[i];
           }
       }
        System.out.println("max"+n);
    }
}
