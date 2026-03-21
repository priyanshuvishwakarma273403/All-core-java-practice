package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Product{
    String id;
    String name;
    double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(!(obj instanceof Product))return false;
        return  id.equals(((Product)obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class ShoppingCart{
    private Map<Product,Integer> items = new HashMap<>();
    public void addItem(Product product, int quantity){
        items.merge(product, quantity, Integer::sum);
    }

    public void removeItem(Product product){
        items.remove(product);
    }

    public void updateQuantity(Product product, int quantity){
       if(quantity <= 0){
           items.remove(product);
       }
       else{
           items.put(product, quantity);
       }
    }

    public double getTotal(){
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().price * e.getValue()).sum();
    }

    public void display(){
        System.out.println("Shopping Cart:");
        items.forEach((product,quantity)->{
            System.out.printf("%s x %d = $%.2f%n",
                    product.name, quantity, product.price * quantity);
        });
        System.out.printf("Total: $%.2f%n", getTotal());

    }
}

public class ShoppingCartExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new Product("P001", "Laptop", 999.99);
        Product mouse = new Product("P002", "Mouse", 29.99);
        Product keyboard = new Product("P003", "Keyboard", 79.99);

        cart.addItem(laptop, 1);
        cart.addItem(mouse, 2);
        cart.addItem(keyboard, 1);

        cart.display();

        System.out.println("\nUpdating quantities...");
        cart.updateQuantity(mouse, 3);
        cart.display();

        System.out.println("\nRemoving laptop...");
        cart.removeItem(laptop);
        cart.display();

    }
}
