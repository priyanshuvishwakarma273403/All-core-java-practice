package Practice;

import java.util.stream.IntStream;

public class cwh_12 {
    public static void main(String[] args) {
        int [] arr1 = IntStream.range(0,10).toArray();
        for(int j=0;j<arr1.length;j++) {
            System.out.print(arr1[j]+" ");

        }
        System.out.println();
        int [] arr2 = IntStream.rangeClosed(1,9).toArray();
        for(int j=0;j<arr2.length;j++) {
            System.out.print(arr2[j]+" ");

        }
        System.out.println();

        int [] arr3 = IntStream.of(1,2,3,4,5).toArray();
        for(int j=0;j<arr3.length;j++) {
            System.out.print(arr3[j]+" ");
        }
    }
}
