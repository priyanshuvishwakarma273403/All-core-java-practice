package FoodDeliverySystem.factories;

import FoodDeliverySystem.modals.*;
import FoodDeliverySystem.strategies.PaymentStrategy;

import java.util.List;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
                      PaymentStrategy paymentStrategy, double totalCost, String orderType);
}
