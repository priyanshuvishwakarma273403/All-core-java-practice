package Project5;

import java.util.ArrayList;
import java.util.List;

class MovieShow{
    private String movieName;
    private String showTime;
    private int totalSeats;
    private int availableSeats;
    private List<String> bookedSeats;

    public MovieShow(String movieName, String showTime, int totalSeats) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.bookedSeats = new ArrayList<String>();
    }

    // Synchronized method for thread-safe booking
    public synchronized BookingResult bookSeats(String customerName,int seatsRequested){
        System.out.println("\n" + customerName + " attempting to book " +
                seatsRequested + " seat(s)...");
        System.out.println(customerName + " acquired lock on booking system");
        //check availability
        if(availableSeats<seatsRequested){
            System.out.println("BOOKING FAILED for " + customerName +
                    " - Not enough seats");
            System.out.println("Requested: " + seatsRequested +
                    ", Available: " + availableSeats);
            return new BookingResult(false,null,"insufficient seats");
        }

        // Processing booking
        System.out.println("Processing booking for " + customerName + "...");
        try {
            Thread.sleep(500); // Simulate payment processing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> allocatedSeats = new ArrayList<>();
        int startSeat = totalSeats - seatsRequested+1;
        for (int i = 0; i < seatsRequested; i++) {
            String seatNumber = "S" + (startSeat + i);
            allocatedSeats.add(seatNumber);
            bookedSeats.add(seatNumber);

        }

        availableSeats = availableSeats - seatsRequested;
        System.out.println("BOOKING CONFIRMED for " + customerName);
        System.out.println("Seats allocated: " + allocatedSeats);
        System.out.println("Remaining seats: " + availableSeats);
        return new BookingResult(true,allocatedSeats,"Booking Successfull");

    }

    public synchronized void displayShowInfo() {
        System.out.println("\n===== SHOW INFORMATION =====");
        System.out.println("Movie: " + movieName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("============================");
    }

    public String getMovieName() {
        return movieName;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

}

class BookingResult{
    private boolean success;
    private List<String> seatNumbers;
    private String message;

    public BookingResult(boolean success, List<String> seatNumbers, String message) {
        this.success = success;
        this.seatNumbers = seatNumbers;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<String> getSeatNumbers() {
        return seatNumbers;
    }

    public String getMessage() {
        return message;
    }
}

class CustomerThread extends Thread{
    private MovieShow show;
    private String customerName;
    private int seatsRequested;
    private BookingResult result;
    public CustomerThread(MovieShow show, String customerName, int seatsRequested) {
        this.show = show;
        this.customerName = customerName;
        this.seatsRequested = seatsRequested;
    }

    public void run(){
        result = show.bookSeats(customerName,seatsRequested);
    }

    public BookingResult getResult(){
        return result;
    }

    public String getCustomerName() {
        return customerName;
    }
}


public class MovieTicketBookingSystem {
    public static void main(String[] args) throws InterruptedException {
        MovieShow show = new MovieShow("Avengers: Endgame", "7:00 PM", 10);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║     ONLINE MOVIE TICKET BOOKING SYSTEM   ║");
        System.out.println("╚══════════════════════════════════════════╝");

        show.displayShowInfo();

        System.out.println("\n>>> BOOKING WINDOW OPENED <<<\n");

        // Multiple customers trying to book simultaneously
        CustomerThread customer1 = new CustomerThread(show, "Rahul", 3);
        CustomerThread customer2 = new CustomerThread(show, "Priya", 4);
        CustomerThread customer3 = new CustomerThread(show, "Amit", 2);
        CustomerThread customer4 = new CustomerThread(show, "Sneha", 3);
        CustomerThread customer5 = new CustomerThread(show, "Vikram", 2);

        // Start all booking requests simultaneously
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();

        // Wait for all bookings to complete
        customer1.join();
        customer2.join();
        customer3.join();
        customer4.join();
        customer5.join();

        // Display final show status
        System.out.println("\n>>> BOOKING WINDOW CLOSED <<<");
        show.displayShowInfo();

        // Display booking summary
        System.out.println("\n===== BOOKING SUMMARY =====");
        displayBookingSummary(customer1);
        displayBookingSummary(customer2);
        displayBookingSummary(customer3);
        displayBookingSummary(customer4);
        displayBookingSummary(customer5);
        System.out.println("===========================");

    }

    private static void displayBookingSummary(CustomerThread customer){
        BookingResult result = customer.getResult();
        if(result!=null && result.isSuccess()){
            System.out.println("✓ " + customer.getCustomerName() +
                    " - Seats: " + result.getSeatNumbers());
        }
        else{
            System.out.println("✗ " + customer.getCustomerName() +
                    " - Booking Failed");
        }
    }
}
