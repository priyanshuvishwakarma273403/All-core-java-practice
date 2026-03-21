package JavaMultithreading;

public class AtomicPractice1 {
//    static boolean running = true;  //not volatile
//    FIX using volatile (visibility solved)
    static volatile boolean running = true;
    public static void main(String[] args)  throws InterruptedException {
        Thread worker = new Thread(()->{
            while(running){
//            infine loop
            }
            System.out.println("stopped");
        });
        worker.start();
        Thread.sleep(1000);
        running = false;


    }
}
