package JavaMultithreading;

public class SimpleThread implements Runnable {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+" is Daemon Thread");
        }
        else{
            System.out.println(Thread.currentThread().getName()+" is user Thread ");
        }
    }
}
class DaemonThreadMain {
    public static void main(String[] args) {
        SimpleThread s1 = new SimpleThread();
        Thread t1 = new Thread(s1,"Thread 1");
        Thread t2 = new Thread(s1,"Thread 2");
        Thread t3 = new Thread(s1,"Thread 3");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }

}
