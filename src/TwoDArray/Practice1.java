package TwoDArray;

import java.util.Arrays;

public class Practice1 {

    static void show(int [] arr){
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax&&arr[i]!=max){
                smax=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smin&&arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.println(smax);
        System.out.println(min);
        System.out.println(smin);
        System.out.println(max);
    }
    public static void main(String[] args) {
        //Annonymous Array

        show(new int[]{1,2,3,4,5});
//        show(new int[]{32,43,54,64});
//        show(new int[]{32,54,56,34});




    }
}
