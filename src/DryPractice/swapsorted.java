package DryPractice;

import java.util.Arrays;
//Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
//        Example:
//Input :
//int[] A = { 1, 5, 6, 7, 8, 10 }
//int[] B = { 2, 4, 9 }
//Output:
//Sorted Arrays:
//A: [1, 2, 4, 5, 6, 7]
//B: [8, 9, 10]
public class swapsorted {
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        mergeArrays(A, B);
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
    public static void mergeArrays(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (A[i] <= B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }
        while (i < p) {
            merged[k++] = A[i++];
        }
        while (j < q) {
            merged[k++] = B[j++];
        }

        for (i = 0; i < p; i++) {
            A[i] = merged[i];
        }
        for (j = 0; j < q; j++) {
            B[j] = merged[p + j];
        }
    }
}
//    public static void main(String[] args) {
//        int [] array1 = { 1, 5, 6, 7, 8, 10 };
//        int [] array2 = { 2, 4, 9 };
//        int [] array3 = new int[array1.length+array2.length];
//        mergeArray(array1,array2,array3);
//        sortArray(array3);
//        for(int ele: array3){
//            System.out.print(ele+" ");
//        }
//    }
//    public static void mergeArray(int [] array1,int [] array2,int [] array3){
//        int i = 0;
//        for(int ele: array1){
//            array3[i++] = ele;
//
//        }
//        for(int ele: array2){
//            array3[i++] = ele;
//        }
//    }
//    public static void sortArray(int[] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            int j =i;
//            while(j>0&&arr[j]<arr[j-1]){
//                int temp  = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//                j--;
//            }
//        }
//    }
//}


   // static void getArr2(int[] arr,int[] arr1,int[] arr2){
//        int i=0,j=0,k=0;
//        while(i<arr.length&&j<arr1.length){
////            if(arr[i]>arr1[j]){arr2[k++] = arr1[j++];}
////            else{arr2[k++] = arr[i++];}
//            arr2[k++] = (arr[i]>arr1[j]) ? arr1[j++] : arr[i++];
//        }
//        while(i<arr.length){arr2[k++] = arr[i++];}
//        while(j<arr1.length){arr2[k++] = arr1[j++];}
//
//        for(int ele: arr2){
//            System.out.print(ele+" ");
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {1,3,5,7,7};
//        int[] arr1 = {2,4,5,6,8,10};
//        int[] arr2 = new int[arr.length+arr1.length];
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        for(int ele:arr1){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        getArr2(arr,arr1,arr2);
//    }
//}
//    public static void main(String[] args) {
//        int [] array1 = { 1, 5, 6, 7, 8, 10 };
//        int [] array2 = { 2, 4, 9 };
//        System.out.println("Array1"+ Arrays.toString(array1));
//        System.out.println("Array2"+ Arrays.toString(array2));
//
//
//    }
//    public static void mergeArray(int [] array1,int [] array2){
//        int num1 =array1.length;
//        int num2=array2.length;
//        for(int i=0;i<num1;i++){
//            if(array1[i]>array2[0]){
//                int temp=array1[i];
//                array1[i]=array2[0];
//                array2[0]=temp;
//
//
//                int first=array2[0];
//                int k ;
//                for(k=1;k<num2 && array2[k]<first;k++){
//                    array2[k+1]=array2[k];
//
//                }
//                array2[k-1]=first;
//            }
//        }
//        mergeArray(array1,array2);
//    }//}
