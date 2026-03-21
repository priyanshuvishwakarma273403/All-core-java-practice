package JavaMultithreading;

import java.util.concurrent.locks.ReentrantLock;

public class FairnessLock {
    private static ReentrantLock lock = new ReentrantLock(true);
    public static void main(String[] args) {
        Runnable r = () ->{
            for(int i=0;i<3;i++){
                try{
                    lock.lock();
                    System.out.println(Thread.currentThread().getName()+" aquired lock");
                }finally {
                    lock.unlock();
                }
            }
        };

        for(int i=1;i<=5;i++){
            new Thread(r,"Thread - "+i).start();
        }
    }
}
