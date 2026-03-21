package Practice;

import java.util.Arrays;

public class cwh_36 {
    public static void main(String[] args) {
        int [] arr ={32,34,56,754,321,345,23,2,32,45,65};
        Arrays.sort(arr);
        int index=arr.length-1;
        while(arr[index]==arr[arr.length-1]){
            index--;

        }
        System.out.println(arr[index]);
    }
}
