package StringLatest;

public class StringMethodsByVersion {
    public static void main(String[] args) {
        String joined = String.join("->", "Start", "Middle", "End");
        System.out.println("Join : " + joined);

        long vowels = "Hello World".chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) >= 0)
                .count();
        System.out.println(vowels);

        "Hello 🌍".codePoints()
                .forEach(cp -> System.out.print(Character.toString(cp) + " "));
        System.out.println();

        System.out.println("isBlank(\" \"): " + " ".isBlank());
        System.out.println("isBlank(\"Hi\"): " + "Hi".isBlank());
        System.out.println("isBlank(\"\"): " + "".isBlank());

    }
}
