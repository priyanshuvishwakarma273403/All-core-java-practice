package TcsInterview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i>= 0 ; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed);
    }
}
