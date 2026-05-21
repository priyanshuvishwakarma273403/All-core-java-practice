package codewithprayutosh.kadaneAlgorithem;

public class ProductSubarray {

    public static int maxSubArray(int[] arr) {

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int ans = arr[0];
        for(int i = 1; i< arr.length; i++){

           int curr = arr[i];

           if(curr<0){
               int temp = maxProduct;
               maxProduct = minProduct;
               minProduct = temp;
           }

           maxProduct = Math.max(curr, maxProduct* curr);
           minProduct = Math.min(curr, minProduct*curr);
           ans = Math.max(ans,maxProduct);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        maxSubArray(arr);
    }

}
