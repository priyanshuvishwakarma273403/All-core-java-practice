package CollectionFrameworksPractice;

import java.util.concurrent.*;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent("C", 3);
        map.computeIfAbsent("D", key -> 4);
        System.out.println("ConcurrentHashMap: " + map);

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        System.out.println("\nCopyOnWriteArrayList: " + list);

        BlockingDeque<Integer> queue = new LinkedBlockingDeque<>(5);
        Thread producer = new Thread(() -> {
            try{
                for(int i = 1; i <= 5; i++){
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try{
                for(int i = 1; i <= 5; i++){
                    Integer item = queue.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(200);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("\nProducer-Consumer:");
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        ConcurrentSkipListSet<Integer> sortedSet = new ConcurrentSkipListSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        System.out.println("\nConcurrentSkipListSet: " + sortedSet);


    }
}
