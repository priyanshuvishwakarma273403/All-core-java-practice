package Recursion;

import java.util.Scanner;

public class printN {
    static int n;//Global printing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
//    public static void print(int x,int n) {
//        if (x > n) {
//            return;
//        }
//            System.out.println(x);
//            print(x + 1, n);
//        }
}
