package RegularExpression;

import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        String number  = "9369420619";
        String regex = "^[6-9]\\d{9}$";
        boolean isValid = Pattern.matches(regex,number);
        if(isValid){
            System.out.println("Phone number is valid");
        }
        else{
            System.out.println("Phone number is not valid");
        }

    }
}
