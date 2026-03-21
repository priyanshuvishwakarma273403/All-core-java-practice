package RegularExpression;

import java.util.regex.Pattern;

public class StrongPassword {
    public static void main(String[] args) {
        String name = "Priyanshu@123";
        String pass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        boolean isValid = Pattern.matches(pass, name);
        if (isValid) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is not valid");
        }
    }
}
