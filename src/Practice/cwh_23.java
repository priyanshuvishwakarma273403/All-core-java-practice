package Practice;

import java.util.Arrays;

public class cwh_23 {
    public static void main(String[] args) {
        int [] arr = {23,43,3,54,65,23,76};
        int [] copy=new int[arr.length];
        System.out.println("Array"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println("copy"+Arrays.toString(copy));
    }
}
