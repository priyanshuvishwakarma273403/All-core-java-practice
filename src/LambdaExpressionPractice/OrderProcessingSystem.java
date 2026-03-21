package LambdaExpressionPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order{
    private String orderId;
    private String customerId;
    private String product;
    private double amount;
    private String status;   // PENDING, SHIPPED, DELIVERED, CANCELLED
    private LocalDateTime orderDate;

    public Order(String orderId, String customerId, String product, double amount, String status, LocalDateTime orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.product = product;
        this.amount = amount;
        this.status = status;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return String.format("%s: %s ($%.2f) - %s", orderId, product, amount, status);
    }
}

public class OrderProcessingSystem {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("ORD001", "C001", "Laptop", 1200.00, "DELIVERED", LocalDate.of(2024, 1, 15).atStartOfDay()),
                new Order("ORD002", "C002", "Mouse", 25.00, "DELIVERED", LocalDate.of(2024, 1, 16).atStartOfDay()),
                new Order("ORD003", "C001", "Keyboard", 75.00, "SHIPPED", LocalDate.of(2024, 1, 17).atStartOfDay()),
                new Order("ORD004", "C003", "Monitor", 300.00, "PENDING", LocalDate.of(2024, 1, 18).atStartOfDay()),
                new Order("ORD005", "C002", "USB Cable", 10.00, "DELIVERED", LocalDate.of(2024, 1, 19).atStartOfDay()),
                new Order("ORD006", "C001", "Headphones", 80.00, "CANCELLED", LocalDate.of(2024, 1, 20).atStartOfDay()),
                new Order("ORD007", "C003", "Webcam", 60.00, "SHIPPED", LocalDate.of(2024, 1, 21).atStartOfDay()),
                new Order("ORD008", "C002", "Desk Lamp", 35.00, "DELIVERED", LocalDate.of(2024, 1, 22).atStartOfDay()));

        // === Group orders by customer ===
        System.out.println("=== ORDERS BY CUSTOMER ===");
        Map<String , List<Order>> orderByCustomer = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId));
        orderByCustomer.forEach((customerId , orderList ) -> {
            System.out.println("\nCustomer: " + customerId+" : ");
            orderList.forEach(o -> System.out.println("  " + o));
        });

        // === Total spent by customer ===
        System.out.println("\n\n=== TOTAL SPENT BY CUSTOMER ===");
        Map<String,Double> totalByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.summingDouble(Order::getAmount)
                ));
        totalByCustomer.forEach((customer , total ) ->
            System.out.printf("%s: $%.2f%n", customer, total));

        // === Count by status ===
        System.out.println("\n=== ORDER COUNT BY STATUS ===");
        Map<String , Long> countByStatus = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getStatus,
                        Collectors.counting()
                ));
        countByStatus.forEach((status , count) ->
            System.out.println(status + ": " + count));

        // === Revenue by status ===
        System.out.println("\n=== REVENUE BY STATUS ===");
        Map<String , Double> revenueByStatus = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getStatus,
                        Collectors.summingDouble(Order::getAmount)
                ));

        revenueByStatus.forEach((status , revenue) ->
            System.out.printf("%s: $%.2f%n", status, revenue));

        // === Product list by customer ===
        System.out.println("\n=== PRODUCTS ORDERED BY CUSTOMER ===");
        Map<String , List<String>> productByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.mapping(Order::getProduct, Collectors.toList())
                ));

        productByCustomer.forEach((customer , products) -> System.out.println(customer + ": " + products));

        // === Average order value by customer ===
        System.out.println("\n=== AVERAGE ORDER VALUE BY CUSTOMER ===");
        Map<String , Double> avgByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.averagingDouble(Order::getAmount)
                ));
        avgByCustomer.forEach((customer , avg) -> System.out.printf("%s: $%.2f%n", customer, avg));

        // === Statistics by customer ===
        System.out.println("\n=== CUSTOMER ORDER STATISTICS ===");
        Map<String , DoubleSummaryStatistics> statsByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerId,
                        Collectors.summarizingDouble(Order::getAmount)
                ));
        statsByCustomer.forEach((customer , stats) -> {
            System.out.println("\n" + customer + ":");
            System.out.println("  Orders: " + stats.getCount());
            System.out.printf("  Total: $%.2f%n", stats.getSum());
            System.out.printf("  Average: $%.2f%n", stats.getAverage());
            System.out.printf("  Min: $%.2f%n", stats.getMin());
            System.out.printf("  Max: $%.2f%n", stats.getMax());
        });

        // === Partition by delivered status ===
        System.out.println("\n\n=== DELIVERED VS OTHERS ===");
        Map<Boolean , List<Order>> deliveredPartition = orders.stream()
                .collect(Collectors.partitioningBy( o -> "Delivered".equals(o.getStatus())));
        System.out.println("\nDelivered (" + deliveredPartition.get(true).size() + " orders):");
        deliveredPartition.get(true).forEach(o -> System.out.println("  " + o));

        System.out.println("\nOther ("+ deliveredPartition.get(false).size()+" orders):");
        deliveredPartition.get(false).forEach(o -> System.out.println("  " + o));

        // === Top customer ===
        System.out.println("\n=== TOP CUSTOMER (BY TOTAL SPENT) ===");
        totalByCustomer.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry ->    System.out.printf("%s spent $%.2f%n", entry.getKey(), entry.getValue()));


    }
}
