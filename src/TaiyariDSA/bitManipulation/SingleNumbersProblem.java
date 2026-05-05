package TaiyariDSA.bitManipulation;

import java.util.Arrays;

public class SingleNumbersProblem {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(single(arr)));
    }

    private static int[] single(int[] arr) {
        int xor = 0;
        for(int ele: arr){
            xor ^= ele;
        }
        int mask = (xor&(xor-1))^xor;
        int b1 = 0, b2 =0;
        for(int ele : arr){
            if((ele&mask)!=0) b1 ^= ele;
            else b2 ^= ele;
        }
        int[] ans = {b1,b2};
        Arrays.sort(ans);
        return ans;
    }
}
