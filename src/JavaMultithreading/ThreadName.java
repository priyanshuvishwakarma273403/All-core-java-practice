package JavaMultithreading;

public class ThreadName extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadName threadName = new ThreadName();
      ThreadName threadName1 = new ThreadName();
      threadName.start();
      threadName1.start();
    }
//    ThreadName(String ThreadName) {
//        super(ThreadName);
//    }
//    public void run() {
//        System.out.println("The Thread is executing....");
//    }
//}
//class ThreadNaming{
//    public static void main(String[] args) {
//        ThreadName t1 = new ThreadName("Babu Bhaiya");
//        ThreadName t2 = new ThreadName("Boom Box");
//        System.out.println("t1.getName() = " + t1.getName());
//        System.out.println("t2.getName() = " + t2.getName());
//        t1.start();
//        t2.start();
//    }
}
