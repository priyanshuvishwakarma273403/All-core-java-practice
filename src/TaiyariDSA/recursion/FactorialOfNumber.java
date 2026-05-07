package TaiyariDSA.recursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println( factorialNum(num));
    }

    private static int factorialNum(int num) {
        if(num == 0) return 1;
        return num * factorialNum(num - 1);
    }
}
