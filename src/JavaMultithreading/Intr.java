package JavaMultithreading;

public class Intr implements Runnable{
    public void run(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted" +e);
        }
    }

    public static void main(String[] args) {
        Intr intr = new Intr();
        Thread t1 = new Thread(intr,"Thread2");
        t1.start();
       t1.interrupt();
    }

}
