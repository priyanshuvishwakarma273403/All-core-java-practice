package JavaMultithreading;

import java.util.concurrent.locks.ReentrantLock;

class Demo{
    private final ReentrantLock lock = new ReentrantLock();

    public void task(){
        lock.lock();
        try{
            System.out.println("Work done by " + Thread.currentThread().getName());
        }finally {
            lock.unlock();
        }
    }
}

public class DemoReentrant {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.task();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.task();
            }
        });

        t1.start();
        t2.start();
    }
}
