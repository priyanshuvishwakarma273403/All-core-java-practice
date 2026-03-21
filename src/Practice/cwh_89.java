package Practice;

import java.util.Arrays;

public class cwh_89 {
    public static void main(String[] args) {
        int [] arr ={43,45,67,89,32};
//        int [] num1 = new int[5];
//        int [] num2 = new int[arr.length];

        int [] source =Arrays.copyOfRange(arr,0,arr.length);
        System.out.println("Source"+Arrays.toString(source));

        int [] source2 = Arrays.copyOfRange(arr,0,3);
        System.out.println("Source2"+Arrays.toString(source2));
    }
}
