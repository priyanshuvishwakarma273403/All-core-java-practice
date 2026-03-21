package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter2{
     private int count =0;
     private Lock lock = new ReentrantLock();

     public void increment(){
         lock.lock();
         try{
             count++;
         }finally {
             lock.unlock();
         }
     }
     public int getCount(){
         return count;
     }
 }
public class CheckLockInterface {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    counter.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count :"+counter.getCount());
        System.out.println("Race Condition occur " + (counter.getCount()<2000));
    }
}
