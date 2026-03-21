package LambdaExpressionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningCollector {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Sohan");
        // === Simple joining ===
        System.out.println("=== SIMPLE JOINING ===");
        String joined1 = names.stream()
                .collect(Collectors.joining());
        System.out.println("No delimiter: " + joined1);

        // === Joining with delimiter ===
        System.out.println("\n=== WITH DELIMITER ===");
        String joined2 = names.stream()
                .collect(Collectors.joining(","));
        System.out.println("Comma seperated : " + joined2);

        // === Joining with delimiter, prefix, suffix ===
        System.out.println("\n=== WITH PREFIX & SUFFIX ===");
        String joined3 = names.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("With brackets : " + joined3);

        // === Different delimiters ===
        System.out.println("\n=== DIFFERENT FORMATS ===");

        String hyphenSeperated = names.stream()
                .collect(Collectors.joining("-"));
        System.out.println("Hyphen : "+hyphenSeperated);

        String pipe = names.stream()
                .collect(Collectors.joining("|"));
        System.out.println("Pipe : "+pipe);

        String newLine = names.stream()
                .collect(Collectors.joining("\n"));
        System.out.print("New line : "+newLine);

        // === Practical examples ===
        System.out.println("\n=== PRACTICAL EXAMPLES ===");
        // Email list
        List<String> emails = Arrays.asList("ram@email.com", "shyam@email.com",
                "mohan@email.com");
        String emailList = emails.stream()
                .collect(Collectors.joining("; "));
        System.out.println("Email list : "+emailList);

        // SQL IN clause
        List<Integer> ids = Arrays.asList(101, 102, 103, 104);
        String sqlIn = ids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "SELECT * FROM students WHERE id IN (", ")"));
        System.out.println("SQL: " + sqlIn);

        // CSV format
        List<String> csvData = Arrays.asList("Name", "Age", "City");
        String csv = csvData.stream()
                .collect(Collectors.joining(","));
        System.out.println("CSV: " + csv);



    }
}
