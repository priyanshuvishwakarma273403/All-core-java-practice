package TcsInterview;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));

//        int a = 0, b = 1;
//        for(int i=1;i<=n;i++){
//            System.out.println(a + " ");
//            int c = a + b;
//            a = b;
//            b = c;
//        }
    }

    private static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
