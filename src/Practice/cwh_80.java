package Practice;

import java.util.Arrays;

public class cwh_80 {
    static void main() {
        int [] arr = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        System.out.println(Arrays.toString(arr));
//        int[] positive  = arr;
        arr [3] = 23;
//       for(int ele : arr){
//           System.out.print(ele+" ");
//       }
//        System.out.println(Arrays.toString(arr));
        for(int ele2 : arr){
            System.out.print(ele2+" ");
        }
    }
}
