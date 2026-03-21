package JavaMultithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class HDFC{
    private int balance =100;
    private final Lock lock = new ReentrantLock();

    public void withdrawl(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(5000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -=amount;
                        System.out.println(Thread.currentThread().getName() + " Completed withdrawal. remaining balance " + balance);

                    }catch (InterruptedException e){
                       Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

public class CheckingAccountLock {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                hdfc.withdrawl(50);
            }
        });
        Thread team1 = new Thread(t1,"Team 1");
        Thread team2 = new Thread(t1,"Team 2");
        team1.start();
        team2.start();
    }
}
