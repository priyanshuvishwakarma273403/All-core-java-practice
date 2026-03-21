package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample12 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*(?!forbidden).*");
        Matcher m = p.matcher("Weight: 1500kg ");
        if(m.find()){
            System.out.println(m.group());
        }
    }
}
