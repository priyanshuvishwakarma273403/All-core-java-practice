package Practice;

import java.util.Arrays;

public class cwh_29 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("arr"+ Arrays.toString(arr));
        int n = arr.length;
        for(int a=0;a<n;a++){
            if(arr[a]<n){
                n=arr[a];
            }
       }
        System.out.println(n);
    }
}
