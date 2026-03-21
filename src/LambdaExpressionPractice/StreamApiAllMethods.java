package LambdaExpressionPractice;

import java.util.*;
import java.util.stream.*;

public class StreamApiAllMethods {
    public static void main(String[] args) {
        System.out.println("=== JAVA STREAM API COMPREHENSIVE DEMO ===\n");
        // Create sample data
        List<Employee> employees = createEmployeeList();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Run all demos
        demonstrateStreamCreation();
        demonstrateIntermediateOperations(employees, numbers);
        demonstrateTerminalOperations(employees, numbers);
        demonstrateCollectors(employees);
        demonstrateNumericStreams();
        demonstrateParallelStreams(numbers);
        demonstrateAdvancedOperations(employees);
    }

    static void demonstrateStreamCreation() {
        System.out.println("\n>>> 1. STREAM CREATION METHODS <<<\n");

        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> streamFromList  = list.stream();
        System.out.println("From List: " + streamFromList.collect(Collectors.toList()));

        //from array
        String [] str = {"X", "Y", "Z"};
        Stream<String> stream = Arrays.stream(str);
        System.out.println("From Array: " + stream.collect(Collectors.toList()));

        // 3. Using Stream.of()
        Stream<String> streamOf = Stream.of("One", "Two", "Three");
        System.out.println("Stream.of(): " + streamOf.collect(Collectors.toList()));

        // 4. Using Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("Builder1")
                .add("Builder2")
                .build();
        System.out.println("Stream.builder(): " + streamBuilder.collect(Collectors.toList()));

        // 5. Infinite Stream with limit
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2 ).limit(5);
        System.out.println("Stream.iterate(): " + infiniteStream.collect(Collectors.toList()));

        // 6. Stream.generate()
        Stream<Double> randomStream = Stream.generate(Math::random).limit(3);
        System.out.println("Stream.generate(): " + randomStream.collect(Collectors.toList()));

        // 7. Empty Stream
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Empty Stream count: " + emptyStream.count());

        // 8. Parallel Stream
        Stream<String> parallelStream = list.parallelStream();
        System.out.println("Parallel Stream: " + parallelStream.collect(Collectors.toList()));

    }

    static void demonstrateIntermediateOperations(List<Employee> employees, List<Integer> numbers){
        System.out.println("\n>>> 2. INTERMEDIATE OPERATIONS <<<\n");
        // 1. filter() - Filter elements based on condition
        System.out.println("--- filter() ---");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toList());
        System.out.println("High earners (>60k): " + highEarners.size());

        // 2. map() - Transform elements
        System.out.println("\n--- map() ---");
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employee names: " + names);

        List<Integer> squared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squared);

        // 3. flatMap() - Flatten nested structures
        System.out.println("\n--- flatMap() ---");
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened);

        // 4. distinct() - Remove duplicates
        System.out.println("\n--- distinct() ---");
        List<Integer> withDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        List<Integer> unique = withDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique elements: " + unique);

        // 5. sorted() - Sort elements
        System.out.println("\n--- sorted() ---");
        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sorted);


        List<Employee> sortedByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted by name: " + sortedByName+" ");

        // 6. peek() - Perform action without modifying stream
        System.out.println("\n--- peek() ---");
        List<Integer> peekedNumbers = numbers.stream()
                .peek(n -> System.out.print(n + " "))
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("\nAfter peek and map: " + peekedNumbers);

        // 7. limit() - Limit stream size
        System.out.println("\n--- limit() ---");
        List<Integer> limited = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("First 3 elements: " + limited);

        // 8. skip() - Skip elements
        System.out.println("\n--- skip() ---");
        List<Integer> skipped = numbers.stream()
                .skip(7)
                .collect(Collectors.toList());
        System.out.println("After skipping 7: " + skipped);

        // 9. takeWhile() - Take while condition is true (Java 9+)
        System.out.println("\n--- takeWhile() ---");
        List<Integer> taken = numbers.stream()
                .takeWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println("Take while < 6: " + taken);

        // 10. dropWhile() - Drop while condition is true (Java 9+)
        System.out.println("\n--- dropWhile() ---");
        List<Integer> dropped = numbers.stream()
                .dropWhile(n -> n < 6)
                .collect(Collectors.toList());
        System.out.println("Drop while < 6: " + dropped);

        // 11. mapToInt(), mapToLong(), mapToDouble()
        System.out.println("\n--- mapToInt/Long/Double ---");
        double sumOfSalaries = (double) employees.stream()
                .mapToDouble(e -> (double) e.getSalary())
                .sum();
        System.out.println("Sum of salaries: " + sumOfSalaries);


    }

    static void demonstrateTerminalOperations(List<Employee> employees, List<Integer> numbers){
        System.out.println("\n>>> 3. TERMINAL OPERATIONS <<<\n");

        // 1. forEach() - Iterate over elements
        System.out.println("--- forEach() ---");
        System.out.print("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 2. forEachOrdered() - Iterate in order (for parallel streams)
        System.out.println("\n--- forEachOrdered() ---");
        System.out.print("Ordered: ");
        numbers.parallelStream().forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();

        // 3. toArray() - Convert to array
        System.out.println("\n--- toArray() ---");
        Integer[] array = numbers.stream().toArray(Integer[]::new);
        System.out.println("Array length: " +Arrays.toString(array));

        // 4. reduce() - Reduce to single value
        System.out.println("\n--- reduce() ---");
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum.orElse(0));

        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // 5. collect() - Collect to collection
        System.out.println("\n--- collect() ---");
        List<Integer> list = numbers.stream().collect(Collectors.toList());
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println("Collected to List size: " + list.size());
        System.out.println("Collected to Set size: " + set.size());

        // 6. min() and max()
        System.out.println("\n--- min() and max() ---");
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("Min: " + min.orElse(0) + ", Max: " + max.orElse(0));

        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest paid: " + highestPaid.get().getName());

        // 7. count() - Count elements
        System.out.println("\n--- count() ---");
        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println("Numbers > 5: " + count);

        // 8. anyMatch(), allMatch(), noneMatch()
        System.out.println("\n--- anyMatch(), allMatch(), noneMatch() ---");
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Any even: " + anyEven);
        System.out.println("All positive: " + allPositive);
        System.out.println("None negative: " + noneNegative);

        // 9. findFirst() and findAny()
        System.out.println("\n--- findFirst() and findAny() ---");
        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println("First: " + first.orElse(0));
        System.out.println("Any: " + any.orElse(0));

    }

    static void demonstrateCollectors(List<Employee> employees){
        System.out.println("\n>>> 4. COLLECTORS <<<\n");

        // 1. toList(), toSet(), toCollection()
        System.out.println("--- toList(), toSet(), toCollection() ---");
        List<String> namesList = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        Set<String> namesSet = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        LinkedList<String> namesLinkedList = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("List: " + namesList.size() + ", Set: " + namesSet.size());

        // 2. joining()
        System.out.println("\n--- joining() ---");
        String allNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + allNames);

        String formatted = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Formatted: " + formatted);

        // 3. counting()
        System.out.println("\n--- counting() ---");
        long totalEmployees = employees.stream().collect(Collectors.counting());
        System.out.println("Total employees: " + totalEmployees);

        // 4. summingInt(), summingLong(), summingDouble()
        System.out.println("\n--- summingInt/Long/Double() ---");
        double totalSalary = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary: " + totalSalary);

        // 5. averagingInt(), averagingLong(), averagingDouble()
        System.out.println("\n--- averagingInt/Long/Double() ---");
        double avgSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary: " + avgSalary);

        // 6. summarizingInt(), summarizingLong(), summarizingDouble()
        System.out.println("\n--- summarizingDouble() ---");
        DoubleSummaryStatistics stats = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Salary stats: " + stats);

        // 7. groupingBy()
        System.out.println("\n--- groupingBy() ---");
        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Departments: " + byDepartment.keySet());

        Map<String, Long> countByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println("Count by department: " + countByDepartment);

        // 8. partitioningBy()
        System.out.println("\n--- partitioningBy() ---");
        Map<Boolean, List<Employee>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 60000));
        System.out.println("High earners: " + partitioned.get(true).size());
        System.out.println("Others: " + partitioned.get(false).size());

        // 9. toMap()
        System.out.println("\n--- toMap() ---");
        Map<String, Double> nameToSalary = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getName,
                        Employee::getSalary
                ));
        System.out.println("Name to Salary map size: " + nameToSalary.size());

        // 10. maxBy(), minBy()
        System.out.println("\n--- maxBy(), minBy() ---");
        Optional<Employee> maxSalaryEmp = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("Max salary employee: " + maxSalaryEmp.get().getName());

        // 11. mapping()
        System.out.println("\n--- mapping() ---");
        Map<String, Set<String>> deptToNames = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toSet())
                ));
        System.out.println("Department to names: " + deptToNames.keySet());

        // 12. collectingAndThen()
        System.out.println("\n--- collectingAndThen() ---");
        int totalEmpCount = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        List::size
                ));
        System.out.println("Total count using collectingAndThen: " + totalEmpCount);

    }

    static void demonstrateNumericStreams(){
        System.out.println("\n>>> 5. NUMERIC STREAMS (IntStream, LongStream, DoubleStream) <<<\n");

        // IntStream
        System.out.println("--- IntStream ---");
        IntStream intStream = IntStream.range(1, 7);
        System.out.println("Range 1-6: " + Arrays.toString(intStream.toArray()));
        IntStream intStreamClosed = IntStream.rangeClosed(1, 4);
        System.out.println("RangeClosed 1-5: " + Arrays.toString(intStreamClosed.toArray()));

        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println("Sum: " + sum);

        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();
        System.out.println("Average: " + average.orElse(0.0));

        IntSummaryStatistics intStats = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
        System.out.println("Stats: " + intStats);

        // LongStream
        System.out.println("\n--- LongStream ---");
        LongStream longStream = LongStream.range(1L, 6L);
        System.out.println("Long range: " + Arrays.toString(longStream.toArray()));

        // DoubleStream
        System.out.println("\n--- DoubleStream ---");
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);
        System.out.println("Double stream: " + Arrays.toString(doubleStream.toArray()));

// Boxing and Unboxing
        System.out.println("\n--- Boxing/Unboxing ---");
        Stream<Integer> boxed = IntStream.range(1, 6).boxed();
        System.out.println("Boxed: " + boxed.collect(Collectors.toList()));

        IntStream unboxed = Stream.of(1, 2, 3, 4, 5).mapToInt(Integer::intValue);
        System.out.println("Unboxed sum: " + unboxed.sum());

    }

    static void demonstrateParallelStreams(List<Integer> numbers){
        System.out.println("\n>>> 6. PARALLEL STREAMS <<<\n");

        // Sequential vs Parallel
        long startSequential = System.currentTimeMillis();
        long sumSequential = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endSequential = System.currentTimeMillis();

        long startParallel = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endParallel = System.currentTimeMillis();

        System.out.println("Sequential sum: " + sumSequential + " (Time: " + (endSequential - startSequential) + "ms)");
        System.out.println("Parallel sum: " + sumParallel + " (Time: " + (endParallel - startParallel) + "ms)");

        // isParallel()
        boolean isParallel = numbers.parallelStream().isParallel();
        System.out.println("Is parallel: " + isParallel);

        // parallel() and sequential()
        Stream<Integer> stream = numbers.stream().parallel();
        System.out.println("Made parallel: " + stream.isParallel());

        stream = numbers.parallelStream().sequential();
        System.out.println("Made sequential: " + stream.isParallel());

    }

    static void demonstrateAdvancedOperations(List<Employee> employees){
        System.out.println("\n>>> 7. ADVANCED OPERATIONS <<<\n");

        // 1. Custom Collector
        System.out.println("--- Custom Collector ---");
        String customJoin = employees.stream()
                .map(Employee::getName)
                .collect(Collector.of(
                        StringBuilder::new,
                        (sb, s) -> sb.append(s).append(";"),
                        StringBuilder::append,
                        StringBuilder::toString
                ));
        System.out.println("Custom join: " + customJoin);

        // 2. Nested Grouping
        System.out.println("\n--- Nested Grouping ---");
        Map<String, Map<Boolean, List<Employee>>> nestedGrouping = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(e -> e.getSalary() > 60000)
                ));
        System.out.println("Nested grouping keys: " + nestedGrouping.keySet());
    }
    static List<Employee> createEmployeeList() {
        return Arrays.asList(
                new Employee("Alice", "IT", 75000),
                new Employee("Bob", "HR", 55000),
                new Employee("Charlie", "IT", 80000),
                new Employee("David", "Finance", 65000),
                new Employee("Eve", "IT", 70000),
                new Employee("Frank", "HR", 50000),
                new Employee("Grace", "Finance", 72000),
                new Employee("Henry", "IT", 85000),
                new Employee("Iris", "HR", 58000),
                new Employee("Jack", "Finance", 68000)
        );
    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): $%.2f", name, department, salary);
    }
}
