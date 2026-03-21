package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteConter {
    private int count =0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readlock =  lock.readLock();
    private final Lock writelock = lock.writeLock();

    public void increment(){
        writelock.lock();
        try{
            count++;
            Thread.sleep(50);
        }catch (InterruptedException e){}
        finally {
            writelock.unlock();
        }
    }
    public int getCount(){
        readlock.lock();
        try{
            return count;
        }finally {
            readlock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteConter counter = new ReadWriteConter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" read "+counter.getCount());
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+" Increment ");
                }
            }
        };
        Thread writeThread = new Thread(task);
        Thread readThread1 = new Thread(task2);
        Thread readThread2 = new Thread(task2);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count :" +counter.getCount());


    }
}
