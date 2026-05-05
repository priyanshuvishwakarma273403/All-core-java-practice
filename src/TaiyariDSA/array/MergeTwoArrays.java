package TaiyariDSA.array;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5};
        int [] arr2 = {2,4,6};
        int [] merged = new  int[arr1.length+arr2.length];
        int index = 0;

        for(int i = 0; i < arr1.length; i++){
            merged[index] = arr1[i];
            index++;
        }
        for(int i = 0; i < arr2.length; i++){
            merged[index] = arr2[i];
            index++;
        }

        for(int ele : merged){
            System.out.print(ele+" ");
        }

//        this is using methods''
//        System.arraycopy(arr1,0,merged,0,arr1.length);
//        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
//        System.out.println(Arrays.toString(merged));
    }
}
