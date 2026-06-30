package codewithprayutosh.prefixSum;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int [] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(arr, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int num : nums) {

            sum += num;

            int rem = ((sum % k) + k) % k;

            if (map.containsKey(rem)) {
                ans += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}
