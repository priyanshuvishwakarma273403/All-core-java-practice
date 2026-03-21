package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[0-9]{10}");
        Matcher matcher = compile.matcher("12345678904");
        System.out.println("Result is : "+matcher.matches());
    }
}
