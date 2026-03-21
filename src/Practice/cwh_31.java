package Practice;

import java.util.Arrays;

public class cwh_31 {
    public static void main(String[] args) {
        int [] arr ={43,54,23,54,24,54,32,54,23};
        System.out.println("Old :"+Arrays.toString(arr));
        int n = arr.length;
        for(int j=0;j<n/2;j++){
            int temp = arr[j];
            arr[j] = arr[n-1-j];
            arr[n-1-j] = temp;
        }
        System.out.println("Reverse:"+Arrays.toString(arr));
    }
}
