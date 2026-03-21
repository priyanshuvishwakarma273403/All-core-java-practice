package JavaMultithreading;

public class MyThread5 extends Thread {
    public MyThread5(ThreadGroup g,String name) {
        super(g,name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        ThreadGroup tg2 = new ThreadGroup("Child ThreadGroup");
        MyThread5 t1 = new MyThread5(tg1,"Child Thread 1");
        MyThread5 t2 = new MyThread5(tg2,"Child Thread 2");
        t1.start();
        t2.start();

        System.out.println(tg1.activeCount());
        System.out.println(tg2.activeGroupCount());
        tg1.list();
        Thread.sleep(5000);
        System.out.println(tg1.activeCount());
        tg1.list();

    }
}
