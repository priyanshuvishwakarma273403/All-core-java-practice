package CollectionFrameworksPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    String name;
    int priority;
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString(){
        return name + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(50);
        minHeap.offer(20);
        minHeap.offer(40);
        System.out.println("Priority Queue: " + minHeap);

        System.out.println("Peek (min element): " + minHeap.peek());
        System.out.println("\nPolling elements (ascending):");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                Comparator.reverseOrder()
        );

        maxHeap.addAll(java.util.Arrays.asList(30, 10, 50, 20, 40));
        System.out.println("\n\nMax Heap - Polling (descending):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                Comparator.comparingInt(t -> t.priority)
        );

        taskQueue.offer(new Task("Low priority", 3));
        taskQueue.offer(new Task("High priority", 1));
        taskQueue.offer(new Task("Medium priority", 2));
        System.out.println("\n\nProcessing tasks by priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }



    }
}
