package LambdaExpressionPractice;

public class ThreadingWithLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Old way");

            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("New way");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
            }
        });
        t1.start();
        t2.start();
    }
}
