package Practice;

import java.util.Collections;
import java.util.Vector;

public class cwh_48 {
   Vector<Integer> addOne (int[] arr) {
       Vector<Integer> vec = new Vector<>();
       int n = arr.length;
       int carry = 1;
       for(int i =n-1;i>=0;i--){
           if(arr[i]+carry<=0){
               vec.add(arr[i]+carry);
               carry = 0;
           }
           else{
               vec.add(0);
               carry = 1;

           }
       }
       if(carry==1) vec.add(1);
       Collections.reverse(vec);
       return vec;


   }
}
