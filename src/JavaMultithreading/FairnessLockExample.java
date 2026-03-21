package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private final Lock lock = new ReentrantLock();
    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquired lock");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" released lock");
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        FairnessLockExample f = new FairnessLockExample();
        Runnable r = ()->{
            f.accessResource();
        };

        Thread t1 = new Thread(r,"Thread-1");
        Thread t2 = new Thread(r,"Thread-2");
        Thread t3 = new Thread(r,"Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
