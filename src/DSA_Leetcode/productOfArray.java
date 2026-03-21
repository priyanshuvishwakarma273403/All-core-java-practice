package DSA_Leetcode;

import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = arr.length;
        int []result = new int[n];
        result[0]=1;
        for(int i = 1;i<n;i++)
        {
            result [i] = result[i-1]*arr[i-1];
        }
        int right = 1;
        for(int i = n-1;i>=0;i--)
        {
            result [i] *= right;
            right*=arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
