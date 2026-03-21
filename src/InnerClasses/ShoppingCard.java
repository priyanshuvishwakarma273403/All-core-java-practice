package InnerClasses;

public class ShoppingCard {
    private double totalAmout;
    public ShoppingCard(double totalAmout) {
        this.totalAmout = totalAmout;
    }
    public void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmout);

    }
}
