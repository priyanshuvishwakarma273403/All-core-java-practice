package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    private static Lock lock1 = new ReentrantLock();
    private static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            lock1.lock();
            System.out.println("Thread 1: Lock1 acquired");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
            lock2.lock();  //wait for lock2
            System.out.println("Thread 1: Lock2 acquired");
        });

        Thread t2 = new Thread(()->{
            lock2.lock();
            System.out.println("Thread 2: Lock2 acquired");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
            lock1.lock();//wait for lock1
            System.out.println("Thread 2: Lock1 acquired");
        });
        t1.start();
        t2.start();
    }

}
