package JavaMultithreading;

public class TestMultiNaming  extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        TestMultiNaming test = new TestMultiNaming();
        TestMultiNaming test2 = new TestMultiNaming();
        System.out.println("Name of test "+test.getName());
        System.out.println("Name of test2 "+test2.getName());
        test.start();
        test2.start();
        test.setName("Priyanshu");
        System.out.println("After changing the name of test "+test.getName());
    }
}
