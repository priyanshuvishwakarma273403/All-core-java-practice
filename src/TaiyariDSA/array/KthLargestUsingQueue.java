package TaiyariDSA.array;

import java.util.PriorityQueue;
// time complexity  O(n)
//  space  O(K)

public class KthLargestUsingQueue {
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,6,4};
        int k = 4;
        System.out.println( findLargest(arr, k));
    }

    private static int findLargest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new  PriorityQueue<>((n1,n2) -> n1 - n2);
        for(int n : arr){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return  heap.poll();
    }
}
