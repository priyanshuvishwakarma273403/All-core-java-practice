package JavaMultithreading;
class ThreadImp extends Thread{
    public void run()
    {
      String str = "Thread class Impleamentation Thread " +" is Running successFully";
        System.out.println(str);
    }
}
class RunnableThreads implements Runnable{
    public void run()
    {
        String str = "Running Interface IMpleamentation thread "+" is Running successFully";
        System.out.println(str);
    }
}
public class PracticeNo4 {
    public static void main(String[] args) {
        ThreadImp t1 = new ThreadImp();
        t1.start();

        RunnableThreads r1 = new RunnableThreads();
        Thread t2 = new Thread(r1);
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
