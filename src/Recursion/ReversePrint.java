package Recursion;

public class ReversePrint {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2};
        print(arr,0);
//        int n = arr.length;
//        print(arr,n-1);
    }
    public static void print(int[] arr,int indx){
        int n = arr.length;
        if(indx==n) return;
//        if(indx<0) return;
        print(arr,indx+1);
        System.out.print(arr[indx]+" ");


    }
}
