package Practice;

import java.util.Arrays;

public class cwh_49 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
        arr[3]=123;
        System.out.println(Arrays.toString(new int[]{arr[3]}));

//        int [] arr = new int [10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;
//        arr[6] = 7;
//        arr[7] = 8;
//        arr[8] = 9;
//        arr[9] = 10;
      //  arr[10] = 11; // Array index out of bounf error
       // System.out.println(Arrays.toString(arr));
    }
}
