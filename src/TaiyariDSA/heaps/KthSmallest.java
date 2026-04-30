package TaiyariDSA.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int [] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 2;
        System.out.println( smallest(arr,k));
    }

    private static int smallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : arr){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
