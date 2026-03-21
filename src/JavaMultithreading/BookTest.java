package JavaMultithreading;

public class BookTest  implements Runnable{
    @Override
    public void run() {
        System.out.println("Perform some task");
    }
}
class ThreadExample extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(new BookTest(),"bookThread");
        t1.start();
        System.out.println("Thread has been created with name "+ t1.getName());
    }
}
