package RegularExpression;

import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "priyanshu@gmail.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        boolean isValid = Pattern.matches(regex,email);
        if(isValid){
            System.out.println("Email is valid");
        }
        else{
            System.out.println("Email is invalid");
        }

    }
}
