package RegularExpression;

import java.util.regex.Pattern;

public class TimeValidate {
    public static void main(String[] args) {
        String time = "23:59";
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d$";
        boolean isValid = Pattern.matches(regex,time);
        System.out.println(isValid ? "time is valid" : "time is not valid");
    }
}
