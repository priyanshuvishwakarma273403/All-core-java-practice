package JavaMultithreading;

public class CustomThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread is running " +i);
        }
    }
}
class StartThreadAgain {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
        CustomThread t2 = new CustomThread();
        t1.run();
        t2.run();
    }
}
