package JavaMultithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadA implements Runnable {
    private char charToPrint;
    public ThreadA(char c) {
        charToPrint = c;
    }

    @Override
    public void run() {
        for (int i = 1; i <=3; i++) {
            System.out.println(charToPrint);
        }
    }
}
class ThreadB implements Runnable {
    private int n;
    public ThreadB(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ExecutorService excecutor = Executors.newFixedThreadPool(3);
        ThreadA t1 = new ThreadA('a');
        ThreadA t2 = new ThreadA('b');
        ThreadB t3 = new ThreadB(5);

        excecutor.execute(t1);
        excecutor.execute(t2);
        excecutor.execute(t3);

        excecutor.shutdown();

    }
}
