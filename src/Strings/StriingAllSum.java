package Strings;

import java.util.Scanner;

public class StriingAllSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      String str = ""+x;
      int sum = 0;
      for(int i=0;i<str.length();i++){
          for(int j=i+1;j<=str.length();j++){
             sum+=Integer.parseInt(str.substring(i,j));
          }
      }
        System.out.println(sum);
    }
}
