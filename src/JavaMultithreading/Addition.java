package JavaMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Addition implements Runnable {
    int a,b;
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int sum = a+b;
        System.out.println("Sum is: "+sum);
    }
}
class Subtraction implements Runnable {
    int x,y;
    public Subtraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        int sub = x-y;
        System.out.println("Sub is: "+sub);
    }
}

class Multiplication implements Runnable {
    int p;
    public Multiplication(int p) {
        this.p = p;
    }

    @Override
    public void run() {
        int multiply = p*p;
        System.out.println("Multiplication is: "+multiply);
    }

    public static void main(String[] args) {
        ExecutorService excecutor = Executors.newFixedThreadPool(1);
        excecutor.execute(new Addition(25, 100));
        excecutor.execute(new Subtraction(25, 100));
        excecutor.execute(new Multiplication(4));
        excecutor.shutdown();
    }
}
