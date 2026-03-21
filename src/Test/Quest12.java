package Test;
class Room{
    private String name;
    private double price;
    private int available;
    public Room(String name,double price,int available){
        this.name=name;
        this.price=price;
        this.available=available;
    }
    void display(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(available);
    }
}
public class Quest12 {
    static void main() {
    Room r1 = new Room("Hotel Taaz",1500.0,10);
    r1.display();
    }
}
