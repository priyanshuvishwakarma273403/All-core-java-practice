package JavaMultithreading;

public class World implements Runnable {
    @Override
    public void run() {
        for(;;){
            System.out.println("WORLD!!!");
        }

    }

}

//public class World extends Thread {
//    @Override
//    public void run(){
//        for(;;){
//            System.out.println("World");
//        }
//    }
//
//}
