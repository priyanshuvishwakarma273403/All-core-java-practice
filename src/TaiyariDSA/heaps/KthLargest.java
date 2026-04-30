package TaiyariDSA.heaps;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int [] arr = {3, 5, 4, 2, 9};
        int k = 2;
        System.out.println(largest(arr, k));
    }

    private static int largest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : arr){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
