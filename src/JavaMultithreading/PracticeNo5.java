package JavaMultithreading;

import static JavaMultithreading.ThreadState.o1;

class Toxic implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(102);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The stack for e after it invoked join method on thread t2:"+" "+ThreadState.t1.getState());
        try{
            Thread.sleep(202);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
 class ThreadState implements Runnable{
    public static Thread t1;
    public static ThreadState o1;

     public ThreadState(ThreadState o1) {
     }

     public void run()
    {
        Toxic toxic = new Toxic();
        Thread t2 = new Thread(toxic);
        t2.start();
        System.out.println("State of t2 thread ,post-calling of start() method is:"+" "+t2.getState());
        try{
            Thread.sleep(202);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread t2 after invoking to method sleep() is"+" "+t2.getState());
        try{
            t2.join();
            System.out.println("State of thread t2 after join () is "+t2.getState());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread t1 completing the execution is  " +" "+ t2.getState());
    }

 }
public class PracticeNo5 {
    public static void main(String[] args) {
        ThreadState t1 = new ThreadState(o1);
        t1 = new ThreadState(o1);
       t1.run();

    }
}
