package StringLatest;

public class StringTemplatesDemo {
    public static void main(String[] args) {
        System.out.println("═══ String Templates (Java 21 Preview) ═══\n");
        System.out.println("--- Evolution of String Composition---");

        String name = "Alice";
        int age = 19;
        double score = 95.5;
        String v1 = "Name: " + name + "Age: " + age + "Score: " + score;
        System.out.println("Concat: " + v1);


        String v2 = String.format("Name: %s, Age: %d, Score: %.1f", name, age, score);
        System.out.println(" v2 (format): " + v2);

        String v3 = "Name: %s, Age: %d, Score: %.1f".formatted(name, age, score);
        System.out.println(" v3 (formatted): " + v3);

        String v4 = java.text.MessageFormat.format(
                "Name: {0}, Age: {1}, Score: {2}", name, age, score);
        System.out.println(" v4 (MsgFormat): " + v4);

        System.out.println("\n--- STR Template Processor (Preview Syntax)---");
        System.out.println("""
                String msg = STR."Hello, \\{name}! You are \\{age} years old.";
                String calc = STR."\\{age} + 10 = \\{age + 10}";
                String upper = STR."Name: \\\\{name.toUpperCase()}";
                
                // Multi-line:
                String json = STR.\\"\\"\\"
                {
                }
                "name": "\\{name}",
                "age": \\{age},
                "adult": \\{age >= 18}
                \\"\\"\\"";
                
                
                String status = STR."\\{name} is \\{age >= 18 ? "adult" : "minor"}";
                """);

        System.out.println("--- FMT Template Processor (Preview Syntax)---");
        System.out.println("""
                String formatted = FMT."Name: %-10s\\{name} Age: %03d\\{age} Score: %.1f\\{score}";
                // Result: "Name: Alice Age: 030 Score: 95.5"
                // Table formatting:
                record Product(String name, double price, int qty) {}
                Product[] products = { new Product("Widget", 9.99, 100), ... };
                for (var p : products) {
                System.out.println(FMT." %-15s\\{p.name()} $%8.2f\\{p.price()} %5d\\{p.qty()}");
                }
                """);

        System.out.println("--- Custom Template Processors (Preview)---");
        System.out.println("""
                StringTemplate template = RAW."Hello \\{name}, age \\{age}";
                // Custom processors can validate, sanitize, transform:
                // SQL injection prevention:
                var SQL = StringTemplate.Processor.of((st)-> {
                // Build PreparedStatement with ? placeholders
                // Bind values safely
                return preparedStatement;
                });
                
                PreparedStatement ps = SQL."SELECT * FROM users WHERE name = \\\\{name}";
                // name is NEVER concatenated into SQL — it's bound as a parameter!
                // HTML escaping:
                var HTML =StringTemplate.Processor.of((st)-> {
                // Escape < > & " ' in all embedded values
                return escapedHtml;
                });
                String safe = HTML."<p>Hello, \\\\{userInput}</p>";
                // userInput like "<script>alert('xss')</script>" is safely escape
                
                
                """);

        System.out.println("--- Why Template Processors, Not Just Interpolation?---");
        System.out.println("""
                Other languages: "Hello ${name}" — just string interpolation
                Java 21:
                STR."Hello \\{name}" — template PROCESSING
                The difference:
                1. SAFETY: Custom processors can prevent SQL injection, XSS, etc.
                2. TYPE SAFETY: Processor can return non-String types (PreparedStatement, etc.)
                3. VALIDATION: Processor can validate embedded values
                4. TRANSFORMATION: Values can be formatted, escaped, encoded
                5. EXTENSIBILITY: Anyone can write a custom processor
                Java chose the safer, more powerful approach over simple convenience.
                NOTE: This API was removed after Java 22 for redesign.
                The concept will return in a future Java version with improved design.
                """);


    }
}
