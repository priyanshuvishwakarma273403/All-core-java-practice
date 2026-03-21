package DryPractice;

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int [] array = {9,9,9};
     ArrayList <Integer> arr = new ArrayList<>();
     int n = array.length;
     int carry = 1;
     for(int i =n-1;i>=0;i--){
         if(array[i]+carry<=9)
         {
             arr.add(array[i]+carry);
             carry = 0;
         }
         else{
             arr.add(0);
             carry = 1;
         }
     }
     if(carry==1){
         arr.add(1);
         Collections.reverse(arr);
     }
        System.out.println(arr);
    }
}
