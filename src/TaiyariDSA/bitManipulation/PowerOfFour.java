package TaiyariDSA.bitManipulation;

public class PowerOfFour {
    public static void main(String[] args) {
        Long n = 75L;
        isPowerofTwo(n);
        isSquare(n);
        isPowerOfFour(n);
        while(n!=0){
            n = n >> 1;
            System.out.println( isPowerofTwo(n));
            return;
        }
    }

     static boolean isSquare(long n) {
        long root = (long)(Math.sqrt(n));
        return (root*root == n);
    }
    static  int isPowerOfFour(long n) {
        return (isPowerofTwo(n) && isSquare(n)) ? 1 : 0;
    }
    private static boolean isPowerofTwo(Long n) {
        return ((n & (n - 1)) == 0);
    }

}
