package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation2 {
        public static void main(String[] args) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String[] emails = {
                    "test@example.com",
                    "Ankit.champ123@gmail.com",
                    "invalid-email@",
                    "hello@domain",
                    "abc@xyz.in"
            };

            Pattern pattern = Pattern.compile(regex);

            for (String email : emails) {
                Matcher matcher = pattern.matcher(email);

                if (matcher.matches()) {
                    System.out.println(email + " → Valid");
                } else {
                    System.out.println(email + " → Invalid");
                }
            }
        }
    }
