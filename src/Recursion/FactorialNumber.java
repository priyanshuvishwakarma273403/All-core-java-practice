package Recursion;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
//    ternory operator se print
    public static int factorial(int n){
        return (n<=1) ? 1 : n * factorial(n-1);
    }
//    basic method hai
//  /  public static int factorial(int n)
//    {
//        if(n==0 || n==1) return 1;
//        int answer =n* factorial(n-1);
//        System.out.println( n+" "+answer);
//        return answer;
//    }
}
