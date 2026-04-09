package StringLatest;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.Formatter;

public class StringFormattingGuide {
    public static void main(String[] args) {

        System.out.println("═══ String Formatting ═══\n");

        // Basic types
        String s1 = String.format("Name: %s, Age: %d", "Alice", 30);
        String s2 = String.format("PI: %f", Math.PI);
        String s3 = String.format("PI: %.2f", Math.PI);

        String s4 = String.format("Hex: %x, Oct: %o", 255, 255);
        String s5 = String.format("Bool: %b, Char: %c", true, 'A');

        System.out.println(" " + s1);
        System.out.println(" " + s2);
        System.out.println(" " + s3);
        System.out.println(" " + s4);
        System.out.println(" " + s5);

        System.out.println("\n--- Flags & Width---");

        System.out.println(String.format(" |%10s|", "Hello"));
        System.out.println(String.format(" |%-10s|", "Hello"));
        System.out.println(String.format(" |%10d|", 42));
        System.out.println(String.format(" |%-10d|", 42));
        System.out.println(String.format(" |%010d|", 42));
        System.out.println(String.format(" |%+d|%+d|", 42,-42));
        System.out.println(String.format(" |%,d|", 1_000_000));
        System.out.println(String.format(" |%(d|%(d|", 42,-42));

        System.out.println("\n--- Argument Index---");
        System.out.println(String.format(" %1$s is %2$d. %1$s lives in %3$s.",
                "Alice", 30, "NYC"));

        System.out.println("\n--- printf()---");
        System.out.printf(" Name: %-10s Age: %3d Score: %6.2f%n", "Bob", 25, 98.5);
        System.out.printf(" Name: %-10s Age: %3d Score: %6.2f%n", "Charlie", 8, 100.0);


        System.out.println("\n--- formatted() (Java 15+)---");
        String msg = "Hello, %s! You have %d messages.".formatted("Alice", 5);
        System.out.println(" " + msg);


        String report = """
                Name: %s
                Age: %d
                Score: %.1f%%
                """.formatted("Alice", 30, 95.5);
        System.out.println(" Report:\n" + report);

        System.out.println("--- Date/Time Formatting---");
        Date now =new Date();
        System.out.printf(" Date: %tF%n", now);
        System.out.printf(" Time: %tT%n", now);
        System.out.printf(" DateTime: %tc%n", now);

        System.out.printf(" Custom: %tB %td, %tY%n", now, now, now);
        System.out.printf(" Reuse: %1$tB %1$td, %1$tY%n", now);

        LocalDateTime ldt = LocalDateTime.now();
        String formatted = ldt.format(
                java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(" Modern: " + formatted);

        System.out.println("\n--- Formatter Class---");
        StringBuilder sbOut = new StringBuilder();
        try (var formatter = new Formatter(sbOut)) {
            formatter.format("Pi is approximately %.5f", Math.PI);
        }
        System.out.println(" " + sbOut);

        System.out.println("\n--- Table Formatting---");
        String header = String.format(" %-15s %5s %10s", "Name", "Age", "Salary");
        String sep = " " + "-".repeat(32);
        System.out.println(header);
        System.out.println(sep);
        System.out.printf(" %-15s %5d %,10.2f%n", "Alice Johnson", 30, 85000.50);
        System.out.printf(" %-15s %5d %,10.2f%n", "Bob Smith", 25, 72500.00);
        System.out.printf(" %-15s %5d %,10.2f%n", "Charlie Brown", 35, 95000.75);




    }
}
