package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample6 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\S{3}");
        Matcher matcher = compile.matcher("xyz");
        System.out.println(matcher.matches());
    }
}
