package FoodDeliverySystem;

import FoodDeliverySystem.modals.Order;
import FoodDeliverySystem.modals.Restaurant;
import FoodDeliverySystem.modals.User;
import FoodDeliverySystem.strategies.UpiPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        TomatoApp tomato = new TomatoApp();

        User user = new User(101, "Aditya" , "Delhi");
        System.out.println("User: " + user.getName() + " is active.");

        // User searches for restaurants by location
        java.util.List<Restaurant> restaurantList = tomato.searchRestaurants("Delhi");
        if(restaurantList.isEmpty()){
            System.out.println("Restaurant not found");
            return;
        }

        System.out.println("Restaurant found");
        for(Restaurant restaurant: restaurantList){
            System.out.println(" - " + restaurant.getName());
        }

        // User selects a restaurant
        tomato.selectRestaurant(user , restaurantList.get(0));
        System.out.println("Selected Restaurant : "+ restaurantList.get(0).getName());

        //user adds items to the cart
        tomato.addToCart(user , "P1");
        tomato.addToCart(user , "P2");

        tomato.printUserCart(user);

        // User checkout the cart
        Order order = tomato.checkoutNow(user, "Delivery", new UpiPaymentStrategy("1234567890"));

        // User pays for the cart. If payment is successful, notification is sent.
        tomato.payForOrder(user, order);

    }
}
