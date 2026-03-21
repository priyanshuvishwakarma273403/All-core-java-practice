package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public  static void  checkString(String re , String str){
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(str);
        Boolean match = matcher.matches();
        System.out.println(match);
    }

    public static void main(String[] args) {

       while(true){
           System.out.println("Enter regular expression");
           Scanner sc = new Scanner(System.in);
           String re = sc.nextLine();
           System.out.println("Enter your String");
           String str = sc.nextLine();
           checkString(re,str);

           System.out.println("Want to exit [Y|N]");
           String exit = sc.nextLine();

           if(exit.equalsIgnoreCase("Y")){
               System.exit(0);
           }
       }
    }
}
