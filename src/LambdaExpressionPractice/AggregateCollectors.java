package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue()
    {
        return price * quantity;
    }
}

public class AggregateCollectors {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 800.00, 5),
                new Product("Mouse", 25.00, 20),
                new Product("Keyboard", 50.00, 15),
                new Product("Monitor", 200.00, 10),
                new Product("USB Cable", 10.00, 50)
        );

        // === counting() ===
        System.out.println("=== COUNTING ===");
        long count = products.stream()
                .collect(Collectors.counting());
        System.out.println(count);

        long expensiveCount =  products.stream()
                .filter( p -> p.getPrice() > 50)
                .collect(Collectors.counting());
        System.out.println("Expensive products (>$50): " + expensiveCount);

        // === summingInt() ===
        System.out.println("\n=== SUMMING ===");
        int totalQuantity = products.stream()
                .collect(Collectors.summingInt(Product::getQuantity));
        System.out.println("Total quantity: " + totalQuantity);

        // === summingDouble() ===
        double totalPrice = products.stream()
                .collect(Collectors.summingDouble(Product::getPrice));
        System.out.printf("Sum of prices: $%.2f%n", totalPrice);

        double totalValue = products.stream()
                .collect(Collectors.summingDouble(Product::getTotalValue));
        System.out.printf("Total inventory value: $%.2f%n", totalValue);


        // === averagingInt() ===
        System.out.println("\n=== AVERAGING ===");
        double avgQuantity = products.stream()
                .collect(Collectors.averagingInt(Product::getQuantity));
        System.out.printf("Average quantity: %.2f%n", avgQuantity);

        // === averagingDouble() ===
        double avgPrice = products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.printf("Average price: $%.2f%n", avgPrice);

        // === maxBy() and minBy() ===
        System.out.println("\n=== MAX & MIN ===");
        Optional<Product> mostExpensive = products.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));
        mostExpensive.ifPresent(product -> {
            System.out.println("Most Expensive : "+product.getName()+"$"+product.getPrice());
        });

        // === summarizingInt() - All statistics at once ===
        System.out.println("\n=== STATISTICS ===");
        IntSummaryStatistics stats = products.stream()
                .collect(Collectors.summarizingInt(Product::getQuantity));
        System.out.println("Quantity Statistics:");
        System.out.println("  Count: " + stats.getCount());
        System.out.println("  Sum: " + stats.getSum());
        System.out.println("  Min: " + stats.getMin());
        System.out.println("  Average: " + stats.getAverage());
        System.out.println("  Max: " + stats.getMax());

        DoubleSummaryStatistics priceStats = products.stream()
                .collect(Collectors.summarizingDouble(Product::getPrice));

        System.out.println("\nPrice Statistics:");
        System.out.printf("  Count: %d%n", priceStats.getCount());
        System.out.printf("  Sum: $%.2f%n", priceStats.getSum());
        System.out.printf("  Min: $%.2f%n", priceStats.getMin());
        System.out.printf("  Average: $%.2f%n", priceStats.getAverage());
        System.out.printf("  Max: $%.2f%n", priceStats.getMax());






    }
}
