package Project06;

import java.util.*;
import java.util.concurrent.*;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM - MULTITHREADING DEMO");
        System.out.println("=".repeat(80));

        EmployeeService service = new EmployeeService();
        service.initialize();

        try {
            // Phase 1: Concurrent Insertions
            System.out.println("\n>>> PHASE 1: CONCURRENT EMPLOYEE INSERTIONS");
            runInsertionPhase(service);

            // Display initial statistics
            displayStatistics(service);

            // Phase 2: Concurrent Reads and Queries
            System.out.println("\n>>> PHASE 2: CONCURRENT READ OPERATIONS");
            runQueryPhase(service);

            // Phase 3: Concurrent Updates
            System.out.println("\n>>> PHASE 3: CONCURRENT UPDATE OPERATIONS");
            runUpdatePhase(service);

            // Phase 4: Mixed Operations
            System.out.println("\n>>> PHASE 4: MIXED CONCURRENT OPERATIONS");
            runMixedOperations(service);

            // Final Statistics
            System.out.println("\n" + "=".repeat(80));
            System.out.println("FINAL STATISTICS");
            System.out.println("=".repeat(80));
            displayStatistics(service);
            displayOperationLog(service);

            // Demonstrate Collection Framework operations
            demonstrateCollectionOperations(service);

        } catch (Exception e) {
            System.err.println("Error in main execution: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConfig.closeAllConnections();
            System.out.println("\n>>> System shutdown completed");
        }
    }

    private static void runInsertionPhase(EmployeeService service) throws InterruptedException {
        String[] departments = {"IT", "HR", "Finance", "Sales", "Marketing"};
        int employeesPerDept = 5;

        CountDownLatch insertLatch = new CountDownLatch(departments.length);
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (String dept : departments) {
            executor.submit(new EmployeeInsertWorker(service, dept, employeesPerDept, insertLatch));
        }

        insertLatch.await();
        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);

        System.out.println("\n✓ Insertion phase completed");
    }

    private static void runQueryPhase(EmployeeService service) throws InterruptedException {
        int queryThreads = 5;
        CountDownLatch queryLatch = new CountDownLatch(queryThreads);
        ExecutorService executor = Executors.newFixedThreadPool(queryThreads);

        for (int i = 0; i < queryThreads; i++) {
            executor.submit(new EmployeeQueryWorker(service, queryLatch));
        }

        queryLatch.await();
        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);

        System.out.println("\n✓ Query phase completed");
    }

    private static void runUpdatePhase(EmployeeService service) throws InterruptedException {
        int updateThreads = 3;
        CountDownLatch updateLatch = new CountDownLatch(updateThreads);
        CyclicBarrier barrier = new CyclicBarrier(updateThreads);
        ExecutorService executor = Executors.newFixedThreadPool(updateThreads);

        for (int i = 0; i < updateThreads; i++) {
            executor.submit(new EmployeeUpdateWorker(service, updateLatch, barrier));
        }

        updateLatch.await();
        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);

        System.out.println("\n✓ Update phase completed");
    }

    private static void runMixedOperations(EmployeeService service) throws InterruptedException {
        CountDownLatch mixedLatch = new CountDownLatch(8);
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit different types of workers
        executor.submit(new EmployeeInsertWorker(service, "R&D", 3, mixedLatch));
        executor.submit(new EmployeeQueryWorker(service, mixedLatch));
        executor.submit(new EmployeeQueryWorker(service, mixedLatch));
        executor.submit(new EmployeeDeleteWorker(service, mixedLatch));

        // Use Callable for tasks that return results
        Future<Integer> futureCount = executor.submit(() -> {
            try {
                Thread.sleep(1000);
                int count = service.getCacheSize();
                System.out.println("Callable: Current employee count = " + count);
                mixedLatch.countDown();
                return count;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        });

        // Use FutureTask
        FutureTask<List<Employee>> futureTopPaid = new FutureTask<>(() -> {
            Thread.sleep(1000);
            List<Employee> topPaid = service.getTopPaidEmployees(3);
            System.out.println("FutureTask: Retrieved top " + topPaid.size() + " paid employees");
            mixedLatch.countDown();
            return topPaid;
        });
        executor.submit(futureTopPaid);

        // Schedule periodic tasks using ScheduledExecutorService
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Scheduled Task: Cache size = " + service.getCacheSize());
        }, 0, 500, TimeUnit.MILLISECONDS);

        mixedLatch.await();
        scheduledFuture.cancel(true);
        scheduler.shutdown();
        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);

        // Get results from Future tasks
        try {
            System.out.println("\nFuture Results:");
            System.out.println("  Employee count from Callable: " + futureCount.get());
            System.out.println("  Top paid employees: " + futureTopPaid.get().size());
        } catch (ExecutionException e) {
            System.err.println("Error getting future results: " + e.getMessage());
        }

        System.out.println("\n✓ Mixed operations phase completed");
    }

    private static void displayStatistics(EmployeeService service) {
        System.out.println("\nEmployee Statistics:");
        System.out.println("  Total employees: " + service.getCacheSize());

        Map<String, Long> deptCount = service.getEmployeeCountByDepartment();
        System.out.println("\n  Employees by Department:");
        deptCount.forEach((dept, count) ->
                System.out.println("    " + dept + ": " + count));

        Map<String, DoubleSummaryStatistics> stats = service.getDepartmentStatistics();
        System.out.println("\n  Salary Statistics by Department:");
        stats.forEach((dept, stat) -> {
            System.out.printf("    %s: Avg=%.2f, Min=%.2f, Max=%.2f%n",
                    dept, stat.getAverage(), stat.getMin(), stat.getMax());
        });

        System.out.println("\n  Top 5 Highest Paid Employees:");
        service.getTopPaidEmployees(5).forEach(emp ->
                System.out.printf("    %s (%s): $%.2f%n",
                        emp.getName(), emp.getDepartment(), emp.getSalary()));
    }

    private static void displayOperationLog(EmployeeService service) {
        System.out.println("\nLast 10 Operations:");
        List<String> lastOps = service.getLastOperations(10);
        lastOps.forEach(op -> System.out.println("  " + op));
    }

    private static void demonstrateCollectionOperations(EmployeeService service) {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("COLLECTION FRAMEWORK DEMONSTRATIONS");
        System.out.println("=".repeat(80));

        Collection<Employee> employees = service.getAllEmployees();

        // 1. ArrayList operations
        System.out.println("\n1. ArrayList Operations:");
        ArrayList<Employee> empList = new ArrayList<>(employees);
        Collections.sort(empList, Comparator.comparing(Employee::getName));
        System.out.println("   Sorted " + empList.size() + " employees by name");

        // 2. HashSet operations
        System.out.println("\n2. HashSet Operations:");
        Set<String> uniqueDepts = new HashSet<>();
        employees.forEach(emp -> uniqueDepts.add(emp.getDepartment()));
        System.out.println("   Unique departments: " + uniqueDepts);

        // 3. TreeMap operations
        System.out.println("\n3. TreeMap Operations:");
        TreeMap<Double, Employee> salaryMap = new TreeMap<>();
        employees.forEach(emp -> salaryMap.put(emp.getSalary(), emp));
        System.out.println("   Lowest salary: $" + salaryMap.firstKey());
        System.out.println("   Highest salary: $" + salaryMap.lastKey());

        // 4. LinkedList operations
        System.out.println("\n4. LinkedList Operations:");
        LinkedList<Employee> queue = new LinkedList<>(employees);
        System.out.println("   Queue size: " + queue.size());
        if (!queue.isEmpty()) {
            System.out.println("   First: " + queue.getFirst().getName());
            System.out.println("   Last: " + queue.getLast().getName());
        }

        // 5. PriorityQueue operations
        System.out.println("\n5. PriorityQueue Operations:");
        PriorityQueue<Employee> salaryQueue = new PriorityQueue<>(
                Comparator.comparingDouble(Employee::getSalary).reversed());
        salaryQueue.addAll(employees);
        System.out.println("   Highest paid (peek): " +
                (salaryQueue.peek() != null ? salaryQueue.peek().getName() : "N/A"));

        // 6. HashMap operations
        System.out.println("\n6. HashMap Operations:");
        HashMap<Integer, Employee> empMap = new HashMap<>();
        employees.forEach(emp -> empMap.put(emp.getId(), emp));
        System.out.println("   HashMap contains " + empMap.size() + " entries");

        // 7. Stream API with Collections
        System.out.println("\n7. Stream API Operations:");
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.printf("   Average salary: $%.2f%n", avgSalary);

        long highEarners = employees.stream()
                .filter(emp -> emp.getSalary() > 60000)
                .count();
        System.out.println("   High earners (>60k): " + highEarners);
    }
}