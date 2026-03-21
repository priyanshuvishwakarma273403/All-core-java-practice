package JavaMultithreading;

class RailwayTicketCounter{
    private int availableTicket = 5;
    private String trainName;

    public RailwayTicketCounter(String trainName , int tickets){
        this.availableTicket = tickets;
        this.trainName = trainName;
    }

    public void bookTicket(String passengerName, int requiredTickets){
        System.out.println(passengerName+" is checking availability...");
        System.out.println("Train "+trainName);

        synchronized (this){
            System.out.println(passengerName+" acquired lock");

            if(availableTicket >=requiredTickets){
                System.out.println(passengerName +" is booking "+requiredTickets+" ticket(s)");

                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                availableTicket -= requiredTickets;

                System.out.println("Booking confirmed for "+passengerName);
                System.out.println("Ticket booked: "+requiredTickets);
                System.out.println("Remaining tickets: "+availableTicket);
            }else{
                System.out.println("Sorry! not enough tickets for "+passengerName);
                System.out.println("Available: " + availableTicket + ", Required: " + requiredTickets);
            }
            System.out.println(passengerName+" released lock");
        }
        System.out.println(passengerName + " transaction complete");
        System.out.println("--------------------------------");

    }
    public int getAvailableTicket(){
        return availableTicket;
    }
}

class PassengerThread extends Thread{
    private RailwayTicketCounter counter;
    private String passengerName;
    private int ticketsNeeded;
    public PassengerThread(RailwayTicketCounter counter, String passengerName, int ticketsNeeded){
        this.counter = counter;
        this.passengerName = passengerName;
        this.ticketsNeeded = ticketsNeeded;
    }
    public void run(){
        counter.bookTicket(passengerName, ticketsNeeded);
    }
}


public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        RailwayTicketCounter counter = new  RailwayTicketCounter("RajDhani express",5);
        System.out.println("=== Railway Ticket Booking System ===");
        System.out.println("Train: Rajdhani Express");
        System.out.println("Available Tickets: " + counter.getAvailableTicket());
        System.out.println("=====================================\n");

        PassengerThread p1 = new  PassengerThread(counter,"Shiva",2);
        PassengerThread p2 = new  PassengerThread(counter,"Vijay",3);
        PassengerThread p3 = new  PassengerThread(counter,"Nikhil",2);

        p1.start();
        p2.start();
        p3.start();

        try{
            p1.join();
            p2.join();
            p3.join();
        }catch(InterruptedException e){}

        System.out.println("\n=== FINAL STATUS ===");
        System.out.println("Remaining Tickets: " + counter.getAvailableTicket());

    }
}
