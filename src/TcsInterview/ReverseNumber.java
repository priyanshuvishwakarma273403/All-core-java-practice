package TcsInterview;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int rev = 0;
        while(n!=0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);

//        String s = String.valueOf(String.valueOf(n).length());
//        System.out.println(s);
    }
}
