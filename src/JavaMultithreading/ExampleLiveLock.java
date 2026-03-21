package JavaMultithreading;

public class ExampleLiveLock {
    static class Worker{
        private boolean active =true;

        public void workWith(Worker other){
            while(active){
                if(other.active){
                    System.out.println(Thread.currentThread().getName()+" waiting because other worker is active");
                    try{
                        Thread.sleep(50);
                    } catch (InterruptedException e){}
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" working now....");
                    break;
                }
            }
        }
        public void setActive(boolean active){
            this.active = active;
        }
    }

    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
         new Thread(()->w1.workWith(w2),"Worker - 1").start();
         new Thread(()->w2.workWith(w1),"Worker - 2").start();
    }
}
