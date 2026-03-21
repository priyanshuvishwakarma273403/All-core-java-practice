package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample1 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile(".s");
        Matcher matcher = compile.matcher("Ah");
        boolean match = matcher.matches();
        System.out.println("Match is: " + match);

        boolean b2 = Pattern.compile("..m").matcher("ran").matches();
        System.out.println("Match is: " + b2);

        boolean b3 = Pattern.matches("..f","adg");
        System.out.println("Match is: " + b3);
    }
}
