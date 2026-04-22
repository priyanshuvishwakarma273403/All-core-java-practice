package Recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}
