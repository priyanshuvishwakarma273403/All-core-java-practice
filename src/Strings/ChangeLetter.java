package Strings;

import java.util.Scanner;
//change first letter to upper or lowercase case
public class ChangeLetter {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(str.charAt(0)==str.toLowerCase().charAt(0)){
                System.out.println(str.toLowerCase());
            }
            else {
                System.out.println(str.toUpperCase());
            }
        }
    }
