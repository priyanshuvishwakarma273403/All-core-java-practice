package StringLatest;

import java.util.StringJoiner;

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

        System.out.println("--- Practical Patterns---");
        String[] data =  {"Alice", "30", "Engineer"};
        StringBuilder csv = new StringBuilder();
        for(int i = 0; i< data.length; i++){
            if(i > 0) csv.append(',');
            csv.append(data[i]);
        }
        System.out.println("CSV: " + csv);

        // Building with StringJoiner (cleaner)
        var joiner = new StringJoiner(",");
        for(String str :  data) joiner.add(str);
        System.out.println("Joiner: " + joiner);

        // Building HTML/XML
        String html = new StringBuilder()
                .append(" <html>\n")
                .append(" <body>\n")
                .append(" <h1>Hello</h1>\n")
                .append(" </body>\n")
                .append(" </html>")
                .toString();
        System.out.println("HTML: " + html);

        // Reverse a string
        String reversed = new StringBuilder("Hello World").reverse().toString();
        System.out.println("Reversed: " + reversed);

        // Check palindrome
        String word = "racecar";
        boolean isPalindrome = word.equals(new StringBuilder(word).reverse().toString());
        System.out.println("isPalindrome: " + isPalindrome);


    }
}
