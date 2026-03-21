package JavaMultithreading;

public class YieldPractice  extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + "Thread is Running ");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldPractice yieldPractice = new YieldPractice();
        YieldPractice yieldPractice1 = new YieldPractice();
        yieldPractice.start();
        yieldPractice1.start();
    }
}
