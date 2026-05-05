package TaiyariDSA.string;

//    Agar n = 6 hai toh 6 numbers print honge, fib(6) nahi.
//Ye difference hai
//nth Fibonacci number → single value (fib(6)=8)
//first n Fibonacci numbers → 0,1,1,2,3,5 (6 terms)

public class FibonacchiSeries {
    public static void main(String[] args) {

        int n = 6, num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series" +num1 + ", " + num2);
        for(int i = 2; i<n; i++){
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
//        int n = 3;
//        System.out.println(fibonacci(n));
//    }
//
//    private static int fibonacci(int n) {
//        if (n == 1 || n == 2) return 1;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
}
