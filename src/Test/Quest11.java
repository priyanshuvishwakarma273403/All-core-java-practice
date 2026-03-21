package Test;
class Test{
    private String name;
    private double price;
    private int quantity;
    Test(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public void getName(){
        System.out.println(name);
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public double calculate(){
        price=price*quantity;
       return price;
    }
    public double remove(){
        if(quantity>quantity)
            quantity=quantity-quantity;
        return quantity;

    }
    public void display(){
        System.out.println("Item name:"+" "+ name);
        System.out.println("Item Price:"+" "+price);
        System.out.println("Item qty:"+" "+quantity);

        System.out.println();
    }

}
public class Quest11 {
    static void main() {
    Test i = new Test("Marry gold",10.0,5);
        i.display();
    i.remove();
    i.calculate();
    i.getName();
    i.getPrice();
    i.getQuantity();
        System.out.println(i.calculate());
        System.out.println(i.remove());



    }
}
