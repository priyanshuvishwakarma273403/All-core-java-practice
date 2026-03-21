package BubbleSort;

import java.util.Arrays;

public class PushAllZeroeToEnd {
    public static void main(String[] args) {
        int [] arr = {0,4,0,3,0,5,7,2};
       int n = arr.length;
       int zero = 0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=0)
           {
               if(i!=zero)
               {
                   int temp = arr[i];
                   arr[i] = arr[zero];
                   arr[zero] = temp;
               }
               zero++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
