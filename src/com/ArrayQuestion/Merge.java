package com.ArrayQuestion;

public class Merge {
    public static void main(String[] args) {
        int [] arr = {32,43,54,43};
        int [] arr1 = {32,43,54,43};
        int [] arr2 = {};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.print(arr[i]+" "+arr1[j]);
                }
            }
        }
    }
}
