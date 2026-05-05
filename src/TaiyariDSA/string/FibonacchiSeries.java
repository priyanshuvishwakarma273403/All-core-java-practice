package TaiyariDSA.string;

public class FibonacchiSeries {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
