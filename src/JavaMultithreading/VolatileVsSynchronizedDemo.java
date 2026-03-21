package JavaMultithreading;

class Counter6{
    private int normalCounter =0;
    private volatile int volatileCounter =0;
    private int synchronizedCounter =0;

    public void incrementNormal(){
        normalCounter++;
    }

    public void incrementVolatile(){
        volatileCounter++;
    }

    public synchronized void incrementSynchronized(){
        synchronizedCounter++;
    }

    public void displayAll(){
        System.out.println("Normal Counter: " + normalCounter);
        System.out.println("Volatile Counter: " + volatileCounter);
        System.out.println("Synchronized Counter: " + synchronizedCounter);

    }

}

class CounterThread2 extends Thread{
    private Counter6 counter;
    private int iteration;

    public  CounterThread2(Counter6 counter, int iteration){
        this.counter = counter;
        this.iteration = iteration;
    }

    public void run(){
        for(int i = 0; i < iteration; i++){
            counter.incrementNormal();
            counter.incrementVolatile();
            counter.incrementSynchronized();
        }
    }

}

public class VolatileVsSynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
    Counter6  counter = new Counter6();
        System.out.println("=== Volatile vs Synchronized ===");
        System.out.println("Expected count: 20000 (2 threads x 10000 iterations)\n");
    CounterThread2 t1 = new CounterThread2(counter,10000);
    CounterThread2 t2 = new CounterThread2(counter,10000);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

       counter.displayAll();

        System.out.println("\nNote: Only synchronized counter is guaranteed correct!");


    }
}
