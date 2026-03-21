package JavaMultithreading;

class Counter1{
    int count =0;
    public synchronized void increment(){  //synchroized htane pe unpredictable output aata h
        count++;
    }
}

public class TestSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter1 c = new Counter1();
        Thread t1 = new Thread(()->{
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count " + c.count);
    }
}
