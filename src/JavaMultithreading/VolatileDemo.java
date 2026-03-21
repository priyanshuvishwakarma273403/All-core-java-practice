package JavaMultithreading;

class DataProcessor implements Runnable {
   private volatile boolean running = true;
   private int count = 0;

   public void run(){
       System.out.println("Processor started...");

       while(running){
           count++;
           if(count%100000000==0){
               System.out.println("Processed "+count);
           }
       }

       System.out.println("Processor stopped. Total count: "+count);

   }

   public void stop(){
       running = false;
       System.out.println("stop signal send!");
   }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        Thread processorThread = new Thread(processor,"Processor");
        System.out.println("=== Volatile Keyword Demo ===\n");
        processorThread.start();
        Thread.sleep(5000);
        processor.stop();
        processorThread.join();
        System.out.println("\n=== Processing Complete ===");
    }
}
