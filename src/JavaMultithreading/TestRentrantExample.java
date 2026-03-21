package JavaMultithreading;

import java.util.concurrent.locks.ReentrantLock;

public class TestRentrantExample {
    private static final ReentrantLock lock = new ReentrantLock(false);

    public static void main(String[] args) {
        if(lock.tryLock()){
            try{
                System.out.println("Lock Acquired");
            } finally{
                lock.unlock();
            }
        }
        else{
            System.out.println("lock not acquired");
        }

    }
//    public void print(){
//        lock.lock();
//        try{
//            System.out.println(Thread.currentThread().getName()+" Got the Lock");
//            Thread.sleep(2000);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        finally {
//            lock.unlock(); //release the lock
//        }
//    }
//
//    public static void main(String[] args) {
//        TestRentrantExample t1 = new TestRentrantExample();
//        Runnable task =() -> t1.print();
//        new Thread(task,"Thread A").start();
//        new Thread(task,"Thread B").start();
//
//
//    }
}
