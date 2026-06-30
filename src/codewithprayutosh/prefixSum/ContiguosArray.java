package codewithprayutosh.prefixSum;

import java.util.HashMap;

public class ContiguosArray {
    public static void main(String[] args) {
        int [] arr = {0,1};
        System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                sum --;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                ans = Math.max(ans, map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return ans;
    }
}
