package JavaMultithreading;

public class TestJoinMethod extends Thread {
    public void run(){
        for(int j=0;j<5;j++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod t1 = new TestJoinMethod();
        TestJoinMethod t2 = new TestJoinMethod();
        TestJoinMethod t3 = new TestJoinMethod();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
