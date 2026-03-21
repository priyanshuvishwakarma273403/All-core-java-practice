//import java.util.*;
//
//class Task implements Comparable<Task> {
//    String title;
//    int priority;
//    String status;
//
//    Task(String title, int priority, String status) {
//        this.title = title;
//        this.priority = priority;
//        this.status = status;
//    }
//
//    @Override
//    public int compareTo(Task other) {
//        return Integer.compare(this.priority, other.priority);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("[P%d] %s - %s", priority, title, status);
//    }
//}
//
//class TaskManager {
//    private PriorityQueue<Task> pendingTasks = new PriorityQueue<>();
//    private Set<Task> completedTasks = new HashSet<>();
//    private Map<String, List<Task>> tasksByStatus = new HashMap<>();
//
//    public void addTask(Task task) {
//        if ("pending".equals(task.status)) {
//            pendingTasks.offer(task);
//        }
//        tasksByStatus.computeIfAbsent(task.status, k -> new ArrayList<>())
//                .add(task);
//    }
//
//    public Task getNextTask() {
//        Task task = pendingTasks.poll();
//        if (task != null) {
//            task.status = "in-progress";
//        }
//        return task;
//    }
//
//    public void completeTask(Task task) {
//        task.status = "completed";
//        completedTasks.add(task);
//    }
//
//    public void displayTasksByStatus() {
//        tasksByStatus.forEach((status, tasks) -> {
//            System.out.println("\n" + status.toUpperCase() + ":");
//            tasks.forEach(System.out::println);
//        });
//    }
//}
//
//public class TaskManagementExample {
//    public static void main(String[] args) {
//        TaskManager manager = new TaskManager();
//
//        manager.addTask(new Task("Fix bug", 1, "pending"));
//        manager.addTask(new Task("Write docs", 3, "pending"));
//        manager.addTask(new Task("Code review", 2, "pending"));
//        manager.addTask(new Task("Deploy", 1, "pending"));
//
//        System.out.println("Processing tasks by priority:");
//        Task task1 = manager.getNextTask();
//        System.out.println("Working on: " + task1);
//
//        Task task2 = manager.getNextTask();
//        System.out.println("Working on: " + task2);
//
//        manager.completeTask(task1);
//
//        manager.displayTasksByStatus();
//    }
//}