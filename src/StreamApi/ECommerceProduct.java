package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;
    private double price;
    private int rating;
    private boolean inStock;

    public Product(String name, String category, double price, int rating, boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString(){
        return String.format("Product{name='%s', category='%s', price=%.2f, rating=%d, inStock=%s}",
                name, category, price, rating, inStock);
    }
}

public class ECommerceProduct {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 800.00, 5, true),
                new Product("Mouse", "Electronics", 25.00, 4, true),
                new Product("Keyboard", "Electronics", 50.00, 4, false),
                new Product("Chair", "Furniture", 150.00, 3, true),
                new Product("Desk", "Furniture", 300.00, 5, true),
                new Product("Monitor", "Electronics", 200.00, 5, true),
                new Product("Headphones", "Electronics", 75.00, 4, false),
                new Product("Bookshelf", "Furniture", 120.00, 4, true)
        );

        // 1. In-stock products only
        System.out.println("===IN - STOCK PRODUCTS=== ");
        products.stream()
                .filter(Product::isInStock)
                .forEach(System.out::println);

        //Electronic category
        System.out.println("\n=== ELECTRONICS ===");
        products.stream()
                .filter(p -> "Electronics".equals(p.getCategory()) )
                .forEach(System.out::println);

        // 3. Products under $100
        System.out.println("\n=== UNDER $100 ===");
        products.stream()
                .filter(p -> p.getPrice() <100)
                .forEach(System.out::println);

        // 4. High-rated products (rating >= 4)
        System.out.println("\n=== HIGH RATED (4+) ===");
        products.stream()
                .filter(p -> p.getRating()>=4)
                .forEach(System.out::println);

        // 5. Premium products (5-star & in-stock)
        System.out.println("\n=== PREMIUM IN-STOCK ===");
        products.stream()
                .filter(p -> p.getRating()==5)
                .forEach(System.out::println);

        // 6. Average price by category
        System.out.println("\n=== AVERAGE PRICE BY CATEGORY ===");
        Map<String , Double> avgPrice = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
        avgPrice.forEach((cat,avg)-> System.out.printf("%s: $%.2f%n", cat, avg));


        // 7. Most expensive product
        System.out.println("\n=== MOST EXPENSIVE ===");
        products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .ifPresent(System.out::println);

        // 8. Product names sorted
        System.out.println("\n=== PRODUCT NAMES (SORTED) ===");
        products.stream()
                .map(Product::getName)
                .sorted()
                .forEach(System.out::println);

        // 9. Total inventory value
        double totalValue = products.stream()
                .filter(Product::isInStock)
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.printf("\n=== TOTAL INVENTORY VALUE ===\n$%.2f%n", totalValue);

        // 10. Count by category
        System.out.println("\n=== COUNT BY CATEGORY ===");
        Map<String,Long> countByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.counting()
                ));
        countByCategory.forEach((k,v) -> System.out.printf("%s: %d%n", k, v));
    }
}
