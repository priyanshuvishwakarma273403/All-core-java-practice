package JavaMultithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicPractice3 {
    static int syncCount = 0;
    static AtomicInteger atomicCount =  new AtomicInteger(0);
    static synchronized void incsync(){
        syncCount++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++)
                incsync();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++)
                atomicCount.incrementAndGet();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Synchronized: " + syncCount);
        System.out.println("Atomic: " + atomicCount.get());


    }
}
