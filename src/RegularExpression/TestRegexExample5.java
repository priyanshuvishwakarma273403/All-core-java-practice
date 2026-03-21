package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample5 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\s{3}");
        Matcher matcher = compile.matcher("\n\n\n");
        System.out.println(matcher.matches());
    }
}
