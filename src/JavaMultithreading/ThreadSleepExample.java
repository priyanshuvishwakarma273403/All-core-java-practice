package JavaMultithreading;

public class ThreadSleepExample  {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));

    }

//    @Override
//    public void run() {
//        System.out.println("Thread is running");
//    }
//    public static void main(String[] args) {
//        ThreadSleepExample t1 = new ThreadSleepExample();
//        Thread t2 = new Thread(t1);
//        t2.start();
//        long startTime = System.currentTimeMillis();
//        try{
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        long endTime = System.currentTimeMillis();
//        long timeDifference = (endTime -startTime);
//        System.out.println("The differnce between before and after sleep call "+timeDifference);
//    }

}
