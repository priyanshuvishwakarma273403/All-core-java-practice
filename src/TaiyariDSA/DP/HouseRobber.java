package TaiyariDSA.DP;

import java.util.Arrays;

public class HouseRobber {

    public static int rob(int[] arr) {
        if(arr.length == 1) return arr[0];
        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i++){
            int curr = Math.max(prev1, arr[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(rob(arr));
    }
}
