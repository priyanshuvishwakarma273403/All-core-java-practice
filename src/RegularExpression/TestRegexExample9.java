package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexExample9 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher m = p.matcher("Today's date is 14/11/2025");
        if(m.find()){
            System.out.println("Day: "+m.group(1));
            System.out.println("Month: "+m.group(2));
            System.out.println("Year: "+m.group(3));
        }
    }
}
