package TaiyariDSA.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder{
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder(){

    }

    public void addNum(int num){
        if(maxHeap.size() == 0) maxHeap.add(num);
        else{
            if(num < maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }

        if(maxHeap.size() == minHeap.size() + 2) minHeap.add(maxHeap.remove());
        if(minHeap.size() == maxHeap.size() + 2) maxHeap.add(minHeap.remove());
    }
}

public class FindMedianFromDataStream {
    public static void main(String[] args) {

    }
}
