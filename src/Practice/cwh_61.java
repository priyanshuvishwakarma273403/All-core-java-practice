package Practice;

import static java.util.Collections.reverse;

public class cwh_61 {
    static void main() {
        int [] arr ={32,43,54,75,73};
    }
   public static void rotate(int[] nums, int k) {

       int n=nums.length;
       k%=n;
       reverse(nums,0,k-1);
       reverse(nums,k,n-1);
       reverse(nums,0,n-1);

    }

    private static void reverse(int[] nums, int i, int j) {
       while (i < j) {
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp;
           i++;
           j--;
       }
       for(int element:nums){
           System.out.print(element+" ");
       }

    }
}
