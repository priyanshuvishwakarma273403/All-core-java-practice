package JavaMultithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicPractice4 {
    static AtomicReference<String> ref = new AtomicReference<>("OFF");
    public static void main(String[] args) {
        boolean updated = ref.compareAndSet("OFF", "ON");
        System.out.println(updated);
        System.out.println(ref.get());

    }
}
