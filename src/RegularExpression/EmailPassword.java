package RegularExpression;

public class EmailPassword {
        public static void main(String[] args) {
            String email = "test.user@example.com";
            String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";

            if (email.matches(regex)) {
                System.out.println("Valid Email");
            } else {
                System.out.println("Invalid Email");
            }
        }
    }

