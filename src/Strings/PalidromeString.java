package Strings;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
       boolean isPalindrome=true;
//       int i =0;
//       int j=s.length()-1;
//       while(i<j){   //Two pointer techniques
//           if(s.charAt(i)!=s.charAt(j)){
//               isPalindrome=false;
//
//               break;
//           }
//           if(s.charAt(i)==s.charAt(j)){
//               i++;
//               j--;
//           }
//
//       }
//       if(isPalindrome){
//           System.out.println("the string is palindrome");
//       }
//       else{
//           System.out.println("the string is not palindrome");
//       }
       for(int i=0;i<=s.length()/2;i++){  //Normal techniques
           if(s.charAt(i)!=s.charAt(s.length()-1-i))
           {
               isPalindrome=false;
               break;
           }
       }
       if(isPalindrome){
           System.out.println("The String is palindrome");
       }
       else{
           System.out.println("The String is not palindrome");
       }
    }

}
