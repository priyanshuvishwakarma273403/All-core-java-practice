package JavaMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentrantTest {
    private final Lock lock = new ReentrantLock();
    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("outerMethod");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("innerMethod");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        RentrantTest rt = new RentrantTest();
        rt.outerMethod();
    }
}
