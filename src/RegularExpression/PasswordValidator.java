package RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Password Validator ===");
        System.out.println("Password Requirements:");
        System.out.println("- At least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one digit");
        System.out.println("- Contains at least one special character (@#$%^&+=!)");
        System.out.println();
        System.out.print("Enter Your Password:");
        String password = sc.nextLine();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        if(password.matches(regex)){
            System.out.println("Password Is Valid");
        }
        else{
            System.out.println("Password  Is Not Valid");
        }
    }
}
