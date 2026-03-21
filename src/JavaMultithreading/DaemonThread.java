package JavaMultithreading;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello World!!!");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        DaemonThread daemonThread1 = new DaemonThread();
        daemonThread1.start();
        daemonThread.start();
        System.out.println("Main Done");
    }
}
