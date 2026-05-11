package TcsInterview;

public class StrongNumber {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 15;
        int temp = n, sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum += factorial(digit);
            n = n / 10;
        }
        System.out.println(temp == sum ? "Strong Number" : "Not Strong Number");

    }
}
