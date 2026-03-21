package JavaMultithreading;

public class TestPriority extends Thread{
    public TestPriority(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread is running");
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - Priority: "+Thread.currentThread().getPriority() +" - Count: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TestPriority t = new TestPriority("Low Priority Thread");
        TestPriority t2 = new TestPriority("Normal Priority Thread");
        TestPriority t3 = new TestPriority("High Priority Thread");
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t2.start();
        t3.start();


    }

}
