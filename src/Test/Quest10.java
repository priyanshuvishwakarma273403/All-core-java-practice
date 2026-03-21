package Test;
class Passenger{
    private String name;
    private int age;
    private String gender;
    private static int ticket=1;
    private static double ticketPrice=2000.0;
    private static String Travell="First Ac Sliper";
    public Passenger(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        ticket++;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Ticket:"+ticket);
        System.out.println("Travell:"+Travell);
        System.out.println("TicketPrice:"+ticketPrice);
        System.out.println("=======Booking system abhi karna baki h=======");

    }
}
public class Quest10 {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("James",23,"Male");
       p1.display();
       Passenger p2 = new Passenger("James",23,"Male");
       p2.display();
       Passenger p3 = new Passenger("James",23,"Male");
       p3.display();
       Passenger p4 = new Passenger("James",23,"Male");
       p4.display();
       Passenger p5 = new Passenger("James",23,"Male");
       p5.display();
       Passenger p6 = new Passenger("James",23,"Male");
       p6.display();
       Passenger p7 = new Passenger("James",23,"Male");
       p7.display();
       Passenger p8 = new Passenger("James",23,"Male");
       p8.display();



    }
}
