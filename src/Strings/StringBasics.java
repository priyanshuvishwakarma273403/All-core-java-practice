package Strings;

import java.util.Scanner;
//Print vowels
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "aeiou";
        int count = 0;
//       for(int i=0;i<s.length();i++)
//           {
//          char ch = s.charAt(i);
//          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//              count++;
//          }
//           }
//        System.out.println(count);
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s.charAt(i)==s1.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
