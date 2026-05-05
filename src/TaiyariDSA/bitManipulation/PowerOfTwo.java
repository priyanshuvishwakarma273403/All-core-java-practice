package TaiyariDSA.bitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 98;
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}
