package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample4 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\D{4}");
        Matcher matcher = compile.matcher("abcd");
        System.out.println(matcher.matches());
    }
}
