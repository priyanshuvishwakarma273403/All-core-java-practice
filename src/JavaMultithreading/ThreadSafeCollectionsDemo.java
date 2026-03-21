package JavaMultithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

class ThreadSafeListDemo{
    private List<String> synchronizedList = Collections.synchronizedList(new ArrayList<String>());
    private Vector<String> vector = new Vector<>();
    private CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

    public void addToSynchronizedList(String item){
        synchronized (synchronizedList){
            synchronizedList.add(item);
        }
    }

    public void addToVector(String item){
        vector.add(item);
    }

    public void addToCopyOnWriteArrayList(String item){
        copyOnWriteArrayList.add(item);
    }

    public void displayAll(){
        System.out.println("Synchronized List: " + synchronizedList);
        System.out.println("Vector: " + vector);
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);

    }
}

class ListWriterThread extends Thread{
    private ThreadSafeListDemo demo;
    private String threadName;
    public ListWriterThread(ThreadSafeListDemo demo, String threadName){
        this.demo = demo;
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for(int i=1; i<=3;i++){
            String item = threadName+" item"+ i;
            demo.addToSynchronizedList(item);
            demo.addToVector(item);
            demo.addToCopyOnWriteArrayList(item);

            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSafeCollectionsDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeListDemo demo = new ThreadSafeListDemo();
        System.out.println("=== Thread-Safe Collections Demo ===\n");
        ListWriterThread t1 = new ListWriterThread(demo, "Thread-1");
        ListWriterThread t2 = new ListWriterThread(demo, "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Results:");
        demo.displayAll();

    }
}
