package codewithprayutosh.prefixSum;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public static int subarraySum(int[] arr,int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count  = 0;

        for(int ele : arr){
            prefixSum += ele;

            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);

        }
        return count;

//        int n  = arr.length;
//        int i ;
//        int sum = 0;
//        for(i=0 ; i<n ; i++){
//            sum+=arr[i];
//        }
//        int left = 0;
//        for(i=0 ; i<n ; i++){
//            int right = sum-left-arr[i];
//            if(left == right){
//                return i;
//            }
//            left=left+arr[i];
//        }
//        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr,k));

    }
}
