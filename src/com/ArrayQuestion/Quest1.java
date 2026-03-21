package com.ArrayQuestion;

public class Quest1 {
    static void main() {
        int [] arr = {10,20,30,40};
        int n = arr.length;
        int a =0,b =n-1;
        while (a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
            }
        for(int n1:arr){
            System.out.print(n1+" ");
        }
    }
}



