package JavaMultithreading;

public class TestJoinMathod2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoinMathod2 test=new TestJoinMathod2();
        TestJoinMathod2 test2=new TestJoinMathod2();
        TestJoinMathod2 test3=new TestJoinMathod2();
        test.start();
        try{
            test.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        test2.start();
        test3.start();
    }

}
