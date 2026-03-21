package Practice;

import java.util.Arrays;

public class cwh_81 {
    static void main() {
//        int[] arr = {2, 4, 5, 65, 76};
//        int [] arr1 = new int [arr.length];
//       for(int i=0;i<arr.length;i++){
//           arr1[i]=arr[i];
//       }
//        System.out.println(Arrays.toString(arr1));
            //Copying array
        int []arr ={32,53,24,76,54,86};
        int [] arr1 =new int [5];
        int [] arr2 =new int [arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.arraycopy("arr2"+Arrays.toString(arr2),0,arr2,0,arr2.length);
        System.arraycopy(arr,2,arr1,1,2);
        System.out.println(Arrays.toString(arr1));
    }
}
