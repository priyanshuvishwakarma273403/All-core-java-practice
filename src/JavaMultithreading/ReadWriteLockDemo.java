package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource{
    private int value =0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void write(int newValue){
        writeLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " writing: " + newValue);
            value=newValue;
            Thread.sleep(500);
        }catch(InterruptedException e){}
        finally {
            writeLock.unlock();
        }
    }

    public void read(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " reading: " + value);
            Thread.sleep(200);
        }catch(InterruptedException e){}
        finally {
            readLock.unlock();
        }
    }
}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread writter1 = new Thread(()->{
            for(int i=1;i<=5;i++){
                resource.write(i);
            }
        },"Writer1");

        Thread writter2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=30;i++){
                    resource.write(i);
                }
            }
        },"Writer2");

        Thread reader1 = new Thread(()->{
            for(int i=1;i<=10;i++){
                resource.read();
            }
        },"reader1");

        Thread reader2 = new Thread(()->{
            for(int i=1;i<=10;i++){
                resource.read();
            }
        },"reader2");

        Thread reader3 = new Thread(()->{
            for(int i=1;i<=10;i++){
                resource.read();
            }
        },"reader3");

        writter1.start();
        writter2.start();
        reader1.start();
        reader2.start();
        reader3.start();

    }
}
