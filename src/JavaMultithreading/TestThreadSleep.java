package JavaMultithreading;

public class TestThreadSleep extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Current Thread : "+Thread.currentThread().getName()+" Start "+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Current Thread : "+ Thread.currentThread().getName()+" End "+i);
        }
    }

    public static void main(String[] args) {
        TestThreadSleep t1 = new TestThreadSleep();
        TestThreadSleep t2 = new TestThreadSleep();
        t1.start();
        t1.setName("Priyanshu");
        t1.setPriority(MAX_PRIORITY);
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

        System.out.println("Priority of Thread "+t1.getPriority());
        System.out.println("Priority of Thread "+t2.getPriority());
    }
}
