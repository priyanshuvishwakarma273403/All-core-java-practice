package Recursion;

public class RecursivePrint {
    public static void main(String[] args) {
        int [] arr = {3,5,6,4,3,6,7,5};
        print(arr , 0);
    }
    public static void print(int [] arr , int indx){
        int n = arr.length;
        if(indx==n) return;
        System.out.print(arr[indx]+" ");
        print(arr, indx+1);
    }
}
