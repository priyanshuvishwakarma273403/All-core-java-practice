package Practice;

import java.util.Arrays;

public class cwh_63 {
    static void main(String[] args) {
        int a =5;
        int [] arr ={34,44,53,54,33};
        int [] arr1 = new int[arr.length];
        for (int i =0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr));
        int [] x =arr;
        x[4]=100;
        int [] y =Arrays.copyOf(arr,arr.length);
        y[3]=100;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));


    }
}
