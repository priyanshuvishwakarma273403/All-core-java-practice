package TaiyariDSA.heaps;

import java.util.PriorityQueue;

public class PriorityQueueSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //min heap ascending order me krta hai kaam
        pq.add(10); pq.add(20); pq.add(-30);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.add(5); pq.add(8); pq.add(2); pq.add(0);
        pq.add(3); pq.add(1); pq.add(7); pq.add(6);
        for(int ele : pq){
            System.out.print(ele + " ");  // ye random dega output kyuki guaranted nhi hota kyuki iterator heap array traverse krta hai
        }

        System.out.println();

        while(!pq.isEmpty()){
            System.out.print(pq.remove() + " "); // ye sorted dega
        }
    }
}

// min heap mtlb parent hamesa apne children se chhota hota hai
