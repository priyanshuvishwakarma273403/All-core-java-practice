package StringAssignment;

import java.util.Scanner;

public class GetCharacterIndex {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = "Java Developer";
            System.out.println("Enter index range within Java Developer:"+s.charAt(sc.nextInt()));
        }
    }
