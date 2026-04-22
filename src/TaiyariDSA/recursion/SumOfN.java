package TaiyariDSA.recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        if(n==1 || n == 0) return n;
        return n+findSum(n-1);
    }
}
