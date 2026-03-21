package JavaMultithreading;

public class MyRunnable  implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+ "Start");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+ "End");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class ThreadExampleMain{
    public static void main(String[] args) {
        System.out.println("Main Thread execution first");
        MyRunnable mr = new MyRunnable();

        Thread t1  = new Thread(mr,"Thread 1");
        Thread t2  = new Thread(mr,"Thread 2");
        Thread t3  = new Thread(mr,"Thread 3");

        t1.start();
       try{
           t1.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       t2.start();
       try{
           t2.join(1000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       t3.start();
       try{
           t2.join();
           t3.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }

        System.out.println("Main Thread execution end");
    }
}