package RegularExpression;

import java.util.regex.Pattern;

public class Username {
    public static void main(String[] args) {
        String username ="Priyanshu_12";
        String regex = "^[A-Za-z0-9_]{5,15}$";
        boolean isValid = Pattern.matches(regex, username);
        if (isValid) {
            System.out.println("Username is valid");
        }
        else {
            System.out.println("Username is not valid");
        }
    }
}
