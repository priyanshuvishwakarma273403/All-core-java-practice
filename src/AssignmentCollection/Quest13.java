package AssignmentCollection;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Quest13 {
    public static void main(String[] args) {
        System.out.println("=== ADVANCED STREAM API EXAMPLES ===\n");

        demonstrateOptional();
        demonstrateFunctionalInterfaces();
        demonstrateMethodReferences();
        demonstrateComplexOperations();
        demonstrateRealWorldExamples();
    }

    static void demonstrateOptional() {
        System.out.println("\n>>> OPTIONAL CLASS <<<\n");

        // Creating Optional
        System.out.println("--- Creating Optional ---");
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        System.out.println("Optional.of: " + optional1);
        System.out.println("Optional.ofNullable(null): " + optional2);
        System.out.println("Optional.empty: " + optional3);

        // isPresent() and isEmpty()
        System.out.println("\n--- isPresent() and isEmpty() ---");
        System.out.println("optional1 isPresent: " + optional1.isPresent());
        System.out.println("optional2 isEmpty: " + optional2.isEmpty());

        // ifPresent() and ifPresentOrElse()
        System.out.println("\n--- ifPresent() and ifPresentOrElse() ---");
        optional1.ifPresent(s -> System.out.println("Value: " + s));
        optional2.ifPresentOrElse(
                s -> System.out.println("Value: " + s),
                () -> System.out.println("No value present")
        );

        // get() - use with caution
        System.out.println("\n--- get() ---");
        try {
            String value = optional1.get();
            System.out.println("Got value: " + value);
            // optional2.get(); // This would throw NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        // orElse() and orElseGet()
        System.out.println("\n--- orElse() and orElseGet() ---");
        String result1 = optional2.orElse("Default Value");
        String result2 = optional2.orElseGet(() -> "Generated Default");
        System.out.println("orElse: " + result1);
        System.out.println("orElseGet: " + result2);

        // orElseThrow()
        System.out.println("\n--- orElseThrow() ---");
        try {
            String value = optional1.orElseThrow(() -> new IllegalStateException("No value"));
            System.out.println("Value: " + value);
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // map() and flatMap()
        System.out.println("\n--- map() and flatMap() ---");
        Optional<Integer> length = optional1.map(String::length);
        System.out.println("Mapped length: " + length.orElse(0));

        Optional<Optional<String>> nested = Optional.of(Optional.of("Nested"));
        Optional<String> flattened = nested.flatMap(o -> o);
        System.out.println("FlatMapped: " + flattened.orElse(""));

        // filter()
        System.out.println("\n--- filter() ---");
        Optional<String> filtered = optional1.filter(s -> s.length() > 3);
        System.out.println("Filtered (length > 3): " + filtered.orElse("Not matched"));

        // or() - Java 9+
        System.out.println("\n--- or() ---");
        Optional<String> result = optional2.or(() -> Optional.of("Alternative"));
        System.out.println("or() result: " + result.get());

        // stream() - Java 9+
        System.out.println("\n--- stream() ---");
        long count = optional1.stream().count();
        System.out.println("Stream count: " + count);
    }

    static void demonstrateFunctionalInterfaces(){
        System.out.println("\n>>> FUNCTIONAL INTERFACES <<<\n");

        // 1. Predicate<T> - boolean test(T t)
        System.out.println("--- Predicate ---");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;

        System.out.println("10 is even: " + isEven.test(10));
        System.out.println("10 is even and positive: " + isEven.and(isPositive).test(10));
        System.out.println("10 is even or negative: " + isEven.or(n -> n < 0).test(10));
        System.out.println("10 is not even: " + isEven.negate().test(10));

        // 2. Function<T, R> - R apply(T t)
        System.out.println("\n--- Function ---");
        Function<String, Integer> stringLength = String::length;
        Function<Integer, Integer> square = n -> n * n;

        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        Function<String, Integer> composed = stringLength.andThen(square);
        System.out.println("Composed (length then square): " + composed.apply("Hi"));

//        Function<Integer, String> toString = Object::toString;
//        Function<String, String> composeFunc = toString.compose(square);
//        System.out.println("Compose (square then toString): " + composeFunc.apply(5));

        // 3. Consumer<T> - void accept(T t)
        System.out.println("\n--- Consumer ---");
        Consumer<String> printer = s -> System.out.println("Printing: " + s);
        Consumer<String> upperPrinter = s -> System.out.println("Upper: " + s.toUpperCase());

        printer.accept("Hello");
        printer.andThen(upperPrinter).accept("World");

        // 4. Supplier<T> - T get()
        System.out.println("\n--- Supplier ---");
        Supplier<Double> randomSupplier = Math::random;
        Supplier<String> stringSupplier = () -> "Generated String";

        System.out.println("Random: " + randomSupplier.get());
        System.out.println("String: " + stringSupplier.get());

        // 5. BiPredicate<T, U> - boolean test(T t, U u)
        System.out.println("\n--- BiPredicate ---");
        BiPredicate<String, Integer> lengthEquals = (s, len) -> s.length() == len;
        System.out.println("'Hello' length is 5: " + lengthEquals.test("Hello", 5));

        // 6. BiFunction<T, U, R> - R apply(T t, U u)
        System.out.println("\n--- BiFunction ---");
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println("Add 5 + 3: " + add.apply(5, 3));

//
        // 7. BiConsumer<T, U> - void accept(T t, U u)
        System.out.println("\n--- BiConsumer ---");
        BiConsumer<String, Integer> printWithCount = (s, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.print(s + " ");
            }
            System.out.println();
        };
        printWithCount.accept("Hi", 3);

        // 8. UnaryOperator<T> - T apply(T t) - extends Function<T, T>
        System.out.println("\n--- UnaryOperator ---");
        UnaryOperator<Integer> increment = n -> n + 1;
        UnaryOperator<String> toUpper = String::toUpperCase;

        System.out.println("Increment 5: " + increment.apply(5));
        System.out.println("ToUpper 'hello': " + toUpper.apply("hello"));

        // 9. BinaryOperator<T> - T apply(T t1, T t2) - extends BiFunction<T, T, T>
        System.out.println("\n--- BinaryOperator ---");
        BinaryOperator<Integer> max = BinaryOperator.maxBy(Integer::compareTo);
        BinaryOperator<Integer> min = BinaryOperator.minBy(Integer::compareTo);

        System.out.println("Max of 5 and 10: " + max.apply(5, 10));
        System.out.println("Min of 5 and 10: " + min.apply(5, 10));

        // 10. Primitive Functional Interfaces
        System.out.println("\n--- Primitive Functional Interfaces ---");

        IntPredicate isEvenInt = n -> n % 2 == 0;
        System.out.println("IntPredicate 10 is even: " + isEvenInt.test(10));

        IntFunction<String> intToString = n -> "Number: " + n;
        System.out.println("IntFunction: " + intToString.apply(42));

        IntConsumer printInt = n -> System.out.println("Int: " + n);
        printInt.accept(100);

        IntSupplier randomInt = () -> (int) (Math.random() * 100);
        System.out.println("IntSupplier: " + randomInt.getAsInt());

        IntUnaryOperator doubleInt = n -> n * 2;
        System.out.println("IntUnaryOperator: " + doubleInt.applyAsInt(5));

        IntBinaryOperator sumInt = (a, b) -> a + b;
        System.out.println("IntBinaryOperator: " + sumInt.applyAsInt(3, 7));

        ToIntFunction<String> strLengthToInt = String::length;
        System.out.println("ToIntFunction: " + strLengthToInt.applyAsInt("Hello"));

        ToIntBiFunction<String, String> combinedLength = (s1, s2) -> s1.length() + s2.length();
        System.out.println("ToIntBiFunction: " + combinedLength.applyAsInt("Hi", "World"));


    }

    static void demonstrateMethodReferences(){
        System.out.println("\n>>> METHOD REFERENCES <<<\n");

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // 1. Static method reference - ClassName::staticMethod
        System.out.println("--- Static Method Reference ---");
        List<Integer> parsed = Arrays.asList("1", "2", "3", "4").stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Parsed integers: " + parsed);

        // 2. Instance method reference - object::instanceMethod
        System.out.println("\n--- Instance Method Reference ---");
        String prefix = "Item: ";
        List<String> prefixed = words.stream()
                .map(prefix::concat)
                .collect(Collectors.toList());
        System.out.println("Prefixed: " + prefixed);

        // 3. Instance method reference on arbitrary object - ClassName::instanceMethod
        System.out.println("\n--- Instance Method on Arbitrary Object ---");
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Upper case: " + upperWords);

        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Lengths: " + lengths);

        // 4. Constructor reference - ClassName::new
        System.out.println("\n--- Constructor Reference ---");
        List<Person> people = Arrays.asList("Alice", "Bob", "Charlie").stream()
                .map(Person::new)
                .collect(Collectors.toList());
        System.out.println("Created persons: " + people.size());

        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();
        System.out.println("Created list: " + newList.getClass().getSimpleName());

    }

    static void demonstrateComplexOperations(){
        System.out.println("\n>>> COMPLEX STREAM OPERATIONS <<<\n");

        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "IT"),
                new Person("Bob", 25, "HR"),
                new Person("Charlie", 35, "IT"),
                new Person("David", 28, "Finance"),
                new Person("Eve", 32, "IT"),
                new Person("Frank", 27, "HR")
        );

        // 1. Multi-level grouping with downstream collectors
        System.out.println("--- Multi-level Grouping ---");
        Map<String, Map<Boolean, Long>> complexGrouping = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getDepartment,
                        Collectors.groupingBy(
                                p -> p.getAge() > 30,
                                Collectors.counting()
                        )
                ));
        System.out.println("Complex grouping: " + complexGrouping);

        // 2. Finding and grouping
        System.out.println("\n--- Finding with Grouping ---");
        Map<String, Optional<Person>> oldestByDept = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Person::getAge))
                ));
        oldestByDept.forEach((dept, person) ->
                System.out.println(dept + ": " + person.map(Person::getName).orElse("None"))
        );

        // 3. Custom reduction
        System.out.println("\n--- Custom Reduction ---");
        Optional<Integer> totalAge = people.stream()
                .map(Person::getAge)
                .reduce((a, b) -> a + b);
        System.out.println("Total age: " + totalAge.orElse(0));

        // 4. Combining multiple predicates
        System.out.println("\n--- Combining Predicates ---");
        Predicate<Person> itDept = p -> p.getDepartment().equals("IT");
        Predicate<Person> ageAbove30 = p -> p.getAge() > 30;

        List<Person> filtered = people.stream()
                .filter(itDept.and(ageAbove30))
                .collect(Collectors.toList());
        System.out.println("IT dept and age > 30: " + filtered.size());

        // 5. Chaining optional operations
        System.out.println("\n--- Chaining Optional ---");
        Optional<String> result = people.stream()
                .filter(p -> p.getAge() > 30)
                .findFirst()
                .map(Person::getName)
                .map(String::toUpperCase)
                .filter(name -> name.startsWith("C"));
        System.out.println("Chained result: " + result.orElse("Not found"));

    }

    static void demonstrateRealWorldExamples(){
        System.out.println("\n>>> REAL-WORLD EXAMPLES <<<\n");

        List<Order> orders = Arrays.asList(
                new Order("O1", "Alice", 150.0, "Delivered"),
                new Order("O2", "Bob", 200.0, "Pending"),
                new Order("O3", "Alice", 300.0, "Delivered"),
                new Order("O4", "Charlie", 100.0, "Cancelled"),
                new Order("O5", "Bob", 250.0, "Delivered"),
                new Order("O6", "Alice", 180.0, "Pending")
        );

        // 1. Calculate total revenue by customer
        System.out.println("--- Total Revenue by Customer ---");
        Map<String, Double> revenueByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getAmount)
                ));
        revenueByCustomer.forEach((customer, revenue) ->
                System.out.printf("%s: $%.2f%n", customer, revenue)
        );

        // 2. Find top customers by order count
        System.out.println("\n--- Top Customers by Order Count ---");
        Map<String, Long> orderCountByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.counting()
                ));

        orderCountByCustomer.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(2)
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue() + " orders")
                );

        // 3. Calculate average order value by status
        System.out.println("\n--- Average Order Value by Status ---");
        Map<String, Double> avgByStatus = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getStatus,
                        Collectors.averagingDouble(Order::getAmount)
                ));
        avgByStatus.forEach((status, avg) ->
                System.out.printf("%s: $%.2f%n", status, avg)
        );

        // 4. Get all unique customers with delivered orders
        System.out.println("\n--- Customers with Delivered Orders ---");
        Set<String> deliveredCustomers = orders.stream()
                .filter(o -> o.getStatus().equals("Delivered"))
                .map(Order::getCustomerName)
                .collect(Collectors.toSet());
        System.out.println("Customers: " + deliveredCustomers);

        // 5. Find highest value order per customer
        System.out.println("\n--- Highest Value Order per Customer ---");
        Map<String, Optional<Order>> maxOrderByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.maxBy(Comparator.comparingDouble(Order::getAmount))
                ));

        maxOrderByCustomer.forEach((customer, order) ->
                order.ifPresent(o ->
                        System.out.printf("%s: %s ($%.2f)%n", customer, o.getOrderId(), o.getAmount())
                )
        );

        // 6. Partition orders by amount threshold
        System.out.println("\n--- Orders Partitioned by $200 Threshold ---");
        Map<Boolean, List<Order>> partitioned = orders.stream()
                .collect(Collectors.partitioningBy(o -> o.getAmount() >= 200));
        System.out.println("High value orders (>=$200): " + partitioned.get(true).size());
        System.out.println("Low value orders (<$200): " + partitioned.get(false).size());

    }
}

class Person {
    private String name;
    private int age;
    private String department;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + department + ")";
    }
}

class Order {
    private String orderId;
    private String customerName;
    private double amount;
    private String status;

    public Order(String orderId, String customerName, double amount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return String.format("%s: %s - $%.2f (%s)", orderId, customerName, amount, status);
    }
}

