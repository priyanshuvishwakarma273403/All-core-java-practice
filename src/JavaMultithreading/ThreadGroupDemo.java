package JavaMultithreading;

public class ThreadGroupDemo implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo t1 = new ThreadGroupDemo();
        ThreadGroup t2 = new ThreadGroup("Parent ThreadGroup");
        Thread th1 = new Thread(t2,t1,"one");
        th1.start();
        Thread th2 = new Thread(t2,t1,"two");
        th2.start();
        Thread th3 = new Thread(t2,t1,"three");
        th3.start();
        System.out.println("Thread GroupName : "+t2.getName());
        t2.list();
    }

}
