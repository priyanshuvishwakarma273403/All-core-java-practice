package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample2 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[a-z&&[^m-p]]");
        Matcher matcher = compile.matcher("p");
        System.out.println(matcher.matches());
    }
}
