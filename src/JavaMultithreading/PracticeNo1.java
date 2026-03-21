package JavaMultithreading;

class MYthread1 extends Thread
{
    public void run()
    {
        System.out.println("MYthread1 is running...");
    }
}
class MYthread2 extends Thread
{
    public void run()
    {
        System.out.println("MYthread2 is running...");
    }
}
public class PracticeNo1 {
    public static void main(String[] args) {
        MYthread1 obj = new MYthread1();
        obj.start();
        MYthread2 obj2 = new MYthread2();
        obj2.start();

    }
}
