package JavaMultithreading;

public class TestCount implements Runnable {
    Thread myThread;
    TestCount(){
        myThread = new Thread(this,"my runnable thread");
        System.out.println("my thread created "+myThread);
        myThread.start();
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                Thread.sleep(3000);
                System.out.println("Printing the count "+i);

            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("mythread end");

    }
}
class RunnableExample {
    public static void main(String[] args) {
        TestCount testCount = new TestCount();
        try{
            while(testCount.myThread.isAlive()){
                Thread.sleep(3000);
                System.out.println("Main thread will be alive till the child thread is live");

            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("main thread end");
    }
}
