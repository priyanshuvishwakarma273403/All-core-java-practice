package StringLatest;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String oldJson = "{\n" +
                " \"name\": \"Alice\",\n" +
                " \"age\": 30,\n" +
                " \"city\": \"NYC\"\n" +
                "}";
        System.out.println("Old way:\n" + oldJson);

        String newJson = """
                {
                "name": "Alice",
                "age": 30,
                "city": "NYC"
                }
                """;
        System.out.println("\nNew way:\n" + newJson);

        System.out.println("Equal? " + oldJson.equals(newJson.stripTrailing()));

        String fullyIndented = """
                Line 1 (indented 4)
                Line 2 (indented 4)
                """;
        System.out.println("Full indent:\n" + fullyIndented);

        String noIndent = """
                Line 1
                Line 2
                """;
        System.out.println("No indent:\n" + noIndent);


        String withTrailingSpace = """
                Line with trailing space\s\s
                Line without trailing space
                """;

        System.out.println("\\s escape:\n" + withTrailingSpace);
        System.out.println(" Line 1 ends with spaces: " +
                withTrailingSpace.lines().findFirst().get().endsWith(" "));

        String longLine = """
                This is a very long line that \
                we want to break in the source \
                but should appear as one line.""";

        System.out.println("Line continuation:\n " + longLine);
        System.out.println(" Lines: " + longLine.lines().count());

        System.out.println("\n--- Practical Examples---");
// SQL
        String sql = """
                SELECT u.name, u.email, o.total
                FROMusers u
                JOIN orders o ON u.id = o.user_id
                WHEREo.total > 100
                ANDu.active = true
                ORDERBYo.total DESC
                LIMIT 10
                """;
        System.out.println("SQL:\n" + sql);

        // HTML
        String html = """
                <html>
                <head>
                <title>%s</title>
                </head>
                <body>
                <h1>Welcome, %s!</h1>
                <p>You have %d messages.</p>
                </body>
                </html>
                """.formatted("Home", "Alice", 5);
        System.out.println("HTML:\n" + html);

        // Regular expressions
        String emailRegex =
                """
                ^[a-zA-Z0-9._%+-]+\
                @[a-zA-Z0-9.-]+\
                \\.[a-zA-Z]{2,}$""";
        System.out.println("Regex: " + emailRegex);
        System.out.println("Matches: " + "test@example.com".matches(emailRegex));

        // Java code as string
        String codeTemplate = """
public class %s {
private final String name;
public %1$s(String name) {
this.name = name;
}
@Override
public String toString() {
return "%1$s{name=" + name + "}";
}
}
""".formatted("Person");
        System.out.println("Generated code:\n" + codeTemplate);

        System.out.println("--- Text Block String Methods---");
        String tb = """
Hello
World
""";

        System.out.println(" length: " + tb.length());
        System.out.println(" lines: " + tb.lines().count());
        System.out.println(" contains: " + tb.contains("World"));
        System.out.println(" trim:'" + tb.trim() + "'");
        System.out.println(" strip: '" + tb.strip() + "'");

        System.out.println(" Class: " + tb.getClass().getName());

        String equivalent = " Hello\n World\n";
        System.out.println(" equals: " + tb.equals(equivalent));


    }
}
