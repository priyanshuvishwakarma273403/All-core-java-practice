package StringAssignment;

import java.util.Scanner;

public class Palidromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean palindrome = false;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)) {
                palindrome = true;
                break;
            }
        }
        if(palindrome){
            System.out.println("The String is palindrome");
        }
        else {
            System.out.println("The String is not palindrome");
        }

    }
}
