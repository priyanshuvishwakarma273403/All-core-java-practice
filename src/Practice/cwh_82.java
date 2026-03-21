package Practice;

import java.util.Arrays;

public class cwh_82 {
    static void main() {
        int [] arr ={32,53,24,76,54,86};
        int [] arr1 = Arrays.copyOfRange(arr,0,arr.length);
        System.out.println(Arrays.toString(arr1));

        int [] arr2 =Arrays.copyOfRange(arr,2,6);
        System.out.println(Arrays.toString(arr2));
    }
}
