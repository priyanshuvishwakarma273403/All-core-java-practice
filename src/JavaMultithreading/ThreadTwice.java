package JavaMultithreading;

public class ThreadTwice implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "is Executing." +t.getState());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTwice());
        t1.start();

    }
}
