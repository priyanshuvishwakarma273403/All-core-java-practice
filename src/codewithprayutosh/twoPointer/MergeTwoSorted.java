package codewithprayutosh.twoPointer;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};

        int m = 3;  //actual jo element hai
        int n = arr2.length;

        int i = m - 1;
        int j = n - 1 ;
        int k = m + n -1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            }else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            arr1[k] = arr1[j];
            k--;
            j--;
        }
        for(int ele : arr1){
            System.out.print(ele+" ");
        }



//        int m = arr1.length;
//        int n = arr2.length;
//        int[] merged = new int[m+n];
//        for(int i = 0; i < merged.length; i++){
//            if(arr1[i] > arr2[i]){
//                merged[i] = arr1[i];
//            }else {
//                merged[i] = arr2[i];
//            }
//        }
//        for(int ele : merged){
//            System.out.print(ele+" ");
//        }
    }
}
