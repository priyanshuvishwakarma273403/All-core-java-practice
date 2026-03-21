package Test;
class Mobile{
    private String brand;
    private String model;
    private double price;
    private static int Totalsale=1;
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        Totalsale++;
    }
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
        System.out.println("Total sales:"+Totalsale);
        System.out.println("=============new line=============");

    }
}
public class Quest9 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Oppo","Xiami",12000.0);
        m1.display();
       Mobile m2 = new Mobile("Oppo","Xiami",12000.0);
       m2.display();
       Mobile m3 = new Mobile("Oppo","Xiami",12000.0);
       m3.display();
       Mobile m4 = new Mobile("Oppo","Xiami",12000.0);
       m4.display();
        Mobile m5 = new Mobile("Oppo","Xiami",12000.0);
        m5.display();


    }
}
