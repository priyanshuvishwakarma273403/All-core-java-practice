package Practice;
import java.util.*;
public class cwh_34 {
    public static void main(String[] args) {
        int [] arr = {32,76,54,657,7,67,54};
        int [] arr1 = {23,76,54,67,76,64,67};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr[i] == arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println("Common element");
    }
}



