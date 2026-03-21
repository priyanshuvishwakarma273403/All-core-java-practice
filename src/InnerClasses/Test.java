package InnerClasses;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car("Tata Safari");
//        Car.Engine engine = car.new Engine();
//        engine.start();
//        engine.stop();

//        ShoppingCard card = new ShoppingCard(1500);
//        card.processPayment(new Payment() {  //annonymous
//            @Override
//            public void pay(double amount) {
//                System.out.println("Paid "+amount+ "Using credit card");
//            }
//        });
//
//        card.processPayment(new Payment() {
//            public void pay(double amount) {
//                System.out.println("Paid "+amount+ "Using Paypal");
//            }
//
//        });

        Hotel hotel = new Hotel("SunShine",10,5);
        hotel.reserveRoom("Priyanshu",5);
        hotel.reserveRoom("Vaibhav",1);


    }
}
