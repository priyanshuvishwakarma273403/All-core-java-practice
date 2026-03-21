package Practice;

import java.util.Arrays;

public class cwh_24 {
    public static void main(String[] args) {
        int [] arr ={21,43,54,65,76,87,87,54};
        int inx = 2;
            int n = 5;
        System.out.println("Original Array"+ Arrays.toString(arr));
        for(int i = arr.length-1;i>=inx;i--){
            arr[i]=arr[i-1];
        }
        arr[inx]=n;
        System.out.println("new Array"+ Arrays.toString(arr));
    }
}
