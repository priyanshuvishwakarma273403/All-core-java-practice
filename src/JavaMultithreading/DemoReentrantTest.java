package JavaMultithreading;

import java.util.concurrent.locks.ReentrantLock;

class Task{
    private final ReentrantLock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("outerMethod");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("innerMethod");
        }finally {
            lock.unlock();
        }
    }
}
public class DemoReentrantTest {
    public static void main(String[] args) {
        Task t1 = new Task();
        t1.outerMethod();

    }
}
