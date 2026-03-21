package Practice;

import java.util.Arrays;

public class cwh_28 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("Old"+ Arrays.toString(arr));
        int a = 2;
        int dex =5;
        for(int j= arr.length-1;j>a;j--){
        arr[j] = arr[j-1];
        }
        arr[a] = dex;
        System.out.println("New"+ Arrays.toString(arr));
    }
}
