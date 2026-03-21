package RegularExpression;

import java.util.regex.Pattern;

public class DateValidate {
    public static void main(String[] args) {
        String date = "29-02-2025";
        String regex = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-\\d{4}$";
        boolean isValid = Pattern.matches(regex,date);
        System.out.println(isValid ? "Password is valid" : "Password is not valid");
    }
}
