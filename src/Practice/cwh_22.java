package Practice;

import java.util.Arrays;

public class cwh_22 {
    public static void main(String[] args) {
        int [] arr ={21,323,43,3,4,45,65,32};
        System.out.println("Original Array"+ Arrays.toString(arr));
        int a = 3;
        for(int i=a;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("After remove array:"+Arrays.toString(arr));
    }
}
