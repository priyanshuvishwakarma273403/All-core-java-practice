package TaiyariDSA.recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibbonacciSeries(n));
    }

    private static int fibbonacciSeries(int n) {
        if(n<=1) return n;
        return fibbonacciSeries(n-1)+fibbonacciSeries(n-2);
    }
}
