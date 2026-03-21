package JavaMultithreading;

import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private Queue<Integer> buffer;
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Producer waiting...Buffer is full");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced " + item + " |Buffer size: " + buffer.size());

        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Consumer waiting...Buffer is empty");
            wait();
        }
        int item =buffer.poll();
        System.out.println("Consumed " + item + " |Buffer size: " + buffer.size());
        notifyAll();
        return item;
    }
}

class Producer extends Thread {
    private BoundedBuffer buffer;
    private int itemsToProduce;

    public Producer(BoundedBuffer buffer, int itemsToProduce) {
        this.buffer = buffer;
        this.itemsToProduce = itemsToProduce;
    }

    public void run() {
        for(int i=1; i<=itemsToProduce; i++) {
            try{
                buffer.produce(i);
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private BoundedBuffer buffer;
    private int itemsToConsume;

    public Consumer(BoundedBuffer buffer, int itemsToConsume) {
        this.buffer = buffer;
        this.itemsToConsume = itemsToConsume;
    }

    public void run() {
        for(int i=0; i<itemsToConsume; i++) {
            try{
                buffer.consume();
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        BoundedBuffer buffer = new BoundedBuffer(3);
        System.out.println("=== Producer-Consumer with Bounded Buffer ===");
        System.out.println("Buffer Capacity: 3\n");

        Producer producer = new Producer(buffer, 10);
        Consumer consumer = new Consumer(buffer, 10);
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("\n=== Processing Complete ===");

    }
}
