package codewithprayutosh.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class SortedtSubarray {
    public static void main(String[] args) {
        int [] num = {1};
        int k = 1;
        System.out.println(shortestSubarray(num, k));
    }

    public static int shortestSubarray(int[] num, int k) {
        int n = num.length;
        long[] prefix = new long[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + num[i];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int ans = n + 1;

        for(int i = 0; i <= n; i++){
            while (!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
                ans = Math.min(ans, i - deque.pollFirst());
            }

            while (!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);
        }

        return ans == n + 1 ? -1 : ans;

    }
}
