package JavaMultithreading;

public class DemoTest extends Thread{
    DemoTest(){
        super("my extending thread");
        System.out.println("My thread create "+ this);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Printing the count "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("My thread end");
    }
}
class ExtendingExample{
    public static void main(String[] args) {
        DemoTest t = new DemoTest();
        try{
            while(t.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Main thread end");
    }
}
