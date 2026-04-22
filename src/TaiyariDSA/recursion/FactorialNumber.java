package TaiyariDSA.recursion;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println( factorial(n));
    }

    private static int factorial(int n) {
        if(n==0 || n == 1) return 1;
        return n * factorial(n-1);
    }
}
