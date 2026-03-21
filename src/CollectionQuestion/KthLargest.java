package CollectionQuestion;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr) {
            pq.add(n);
            if (pq.size() > k) pq.poll();
        }

        System.out.println(pq.peek());
    }
}
