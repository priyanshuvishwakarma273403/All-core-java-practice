package JavaMultithreading;

public class MyThread extends Thread {
    public void run(){
        while(true){
            System.out.println("Hello!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        System.out.println("RUNNING"); //Running
//        try{
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e){
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(5000);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());



    }

}
