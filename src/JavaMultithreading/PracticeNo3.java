package JavaMultithreading;
class CookingTask implements Runnable{
    private String task;
    public CookingTask(String task)
    {
        this.task = task;
    }
    public void run()
    {
        System.out.println(task + " is being prapared by" +Thread.currentThread().getName());
    }
}

public class PracticeNo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingTask("Soup"));
        Thread t2 = new Thread(new CookingTask("Burger"));
        Thread t3 = new Thread(new CookingTask("Meggie"));
        t1.start();
        t2.start();
        t3.start();

    }
}
