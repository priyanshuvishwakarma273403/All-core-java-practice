package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidate {
    private static final String mobile_Pattern = "^[6-9]\\d{9}$";

    private static final String mobile_Pattern_With_Prefix = "^(\\+91|0)?[6-9]\\d{9}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Mobile Number Validation===");
        System.out.println("Valid Format");
        System.out.println("  - 10 digits starting with 6, 7, 8, or 9");
        System.out.println("  - Optional +91 or 0 prefix");
        System.out.println();

        while (true) {
            System.out.print("Enter mobile number (or 'exit' to quit): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using Mobile Number Validator!");
                break;
            }
            if (isValidMobileNumber(input)) {
                System.out.println("✓ Valid mobile number!");
            } else {
                System.out.println("✗ Invalid mobile number!");
                System.out.println("  Please enter a 10-digit number starting with 6, 7, 8, or 9");
            }

            System.out.println();
        }
        sc.close();

    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.isEmpty()) {
            return false;
        }
        String cleanNumber = mobileNumber.replaceAll("[\\s-]", "");

        Pattern pattern = Pattern.compile(mobile_Pattern_With_Prefix);
        Matcher matcher = pattern.matcher(cleanNumber);

        return matcher.matches();
    }
    public static boolean isValidMobileNumberSimple(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.isEmpty()) {
            return false;
        }

        String cleanNumber = mobileNumber.replaceAll("[\\s-]", "");
        return Pattern.matches(mobile_Pattern_With_Prefix, cleanNumber);
    }
}
