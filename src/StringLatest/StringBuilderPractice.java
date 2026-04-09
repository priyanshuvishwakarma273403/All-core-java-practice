package StringLatest;

public class StringBuilderPractice {
    public static void main(String[] args) {
        System.out.println("\n--- StringBuffer (Thread-Safe)---");
        StringBuffer threadSafe = new StringBuffer("Hello");

        threadSafe.append("World");
        System.out.println("StringBuffer: " + threadSafe);
        System.out.println("""
                StringBuffer: Every method is synchronized (thread-safe but slower)
                StringBuilder: No synchronization (faster, use in single-threaded code)
                RULE: Always prefer StringBuilder unless multiple threads
                access the same builder (which is rare).
                """);
    }
}
