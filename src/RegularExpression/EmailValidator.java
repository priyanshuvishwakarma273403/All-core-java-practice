package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("=== Email Validator ===");
        System.out.println("Enter 'quit' to exit\n");
        while(true){
            System.out.print("Enter email address: ");
            String email = sc.nextLine().trim();
            if(email.equalsIgnoreCase("quit")){
                System.out.println("Goodbye!");
                break;
            }
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                System.out.println("Email address is valid!");
            }
            else{
                System.out.println("Email address is invalid!");
            }
        }
        sc.close();
    }
}
