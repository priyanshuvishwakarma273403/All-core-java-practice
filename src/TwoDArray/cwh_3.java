package TwoDArray;

import java.util.Arrays;

public class cwh_3 {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6};
        int copyto [] = new int[arr.length];
        System.arraycopy(arr,0,copyto,0,arr.length);
        System.out.println(Arrays.toString(copyto));
        System.out.println();
        System.out.println("Proxy class name:"+arr.getClass().getName());
    }
}
