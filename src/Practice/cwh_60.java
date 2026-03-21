package Practice;

import java.util.Arrays;

public class cwh_60 {
    static void main() {
        int [] arr ={32,43,54,75,73};
        int n = arr.length;
        int a =0,b =n-1;
        while (a<b){
            int temp  = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
      for(int ele :arr) System.out.println(ele +" ");
    }
}
