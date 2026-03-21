package JavaMultithreading;

class Kitchen{
    private String currentOrder = null;
    private boolean orderReady = false;

    public synchronized void prepareOrder(String order) throws InterruptedException {
        while(orderReady){
            System.out.println("Chef waiting... Previous order not picked up");
            wait();
        }
        System.out.println("Chef: Preparing " + order);
        Thread.sleep(1000);
        this.currentOrder = order;
        this.orderReady = true;
        System.out.println("Chef: Order ready - " + order);
        notify(); // Notify waiter

    }
    // Waiter picks up order
    public synchronized String pickupOrder() throws InterruptedException {
        // Wait if no order is ready
        while (!orderReady) {
            System.out.println("Waiter waiting... No order ready");
            wait();
        }

        String order = currentOrder;
        System.out.println("Waiter: Picked up " + order);

        this.currentOrder = null;
        this.orderReady = false;

        notify(); // Notify chef that order is picked
        return order;
    }
}

class ChefThread extends Thread{
    private Kitchen kitchen;
    private String[] orders;

    public ChefThread(Kitchen kitchen, String[] orders){
        this.kitchen = kitchen;
        this.orders = orders;
    }

    public void run(){
        for(String order : orders){
            try{
                kitchen.prepareOrder(order);
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class WaiterThread extends Thread{
    private Kitchen kitchen;
    private int orderCount;

    public  WaiterThread(Kitchen kitchen, int orderCount){
        this.kitchen = kitchen;
        this.orderCount = orderCount;
    }
    public void run(){
        for (int i = 0; i < orderCount; i++) {
            try{
                String order = kitchen.pickupOrder();
                System.out.println("Waiter: Serving " + order + " to customer\n");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        Kitchen kitchen = new Kitchen();
        String[] orders =  {"Pizza", "Burger", "Pasta", "Salad"};
        System.out.println("=== Restaurant Order System ===\n");

        ChefThread chef = new ChefThread(kitchen, orders);
        WaiterThread waiter = new WaiterThread(kitchen, orders.length);
        chef.start();
        waiter.start();

        chef.join();
       waiter.join();
        System.out.println("\n=== All orders completed ===");

    }
}
