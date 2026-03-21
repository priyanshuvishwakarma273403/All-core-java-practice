package Practice;

import java.util.Arrays;

public class cwh_66 {
    static void main() {
        int [] arr = {32,5,55,65,34,56,54};
        for(int i=1;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
