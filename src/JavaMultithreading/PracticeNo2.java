package JavaMultithreading;
class Cooking extends Thread{
   private String task;
   Cooking(String task)
   {
       this.task=task;
   }
   public void run()
   {
       System.out.println(task + " Is being prepared by " +
               Thread.currentThread().getName());
   }
}
public class PracticeNo2 {
    public static void main(String[] args) {
        Thread t1 = new Cooking("Pasta");
        Thread t2 = new Cooking("Salad");
        Thread t3 = new Cooking("Desert");
        Thread t4 = new Cooking("Rice");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
