package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample8 {
    public static void main(String[] args) {
        Pattern compile =   Pattern.compile("\\d+");
        Matcher matcher = compile.matcher("Price 120 and 450,789,975,45");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
