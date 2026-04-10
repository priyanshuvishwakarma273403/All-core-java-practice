package StringLatest;

public class StringTemplatesDemo {
    public static void main(String[] args) {
        System.out.println("═══ String Templates (Java 21 Preview) ═══\n");
        System.out.println("--- Evolution of String Composition---");

        String name = "Alice";
        int age = 19;
        double score = 95.5;
        String v1 = "Name: "+ name + "Age: " + age + "Score: " + score;
        System.out.println("Concat: "+v1);


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
                String json = STR.\\"\\"\\\\"
                {
                }
                "name": "\\{name}",
                "age": \\{age},
                "adult": \\{age >= 18}
                \\"\\"\\"";
                
                
                String status = STR."\\{name} is \\{age >= 18 ? "adult" : "minor"}";
                """);


    }
}
