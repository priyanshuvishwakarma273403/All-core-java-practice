package TaiyariDSA.recursion;

public class NthStair {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(  countWay(n));
    }

    private static int countWay(int n) {
        if(n<=2) return n;
        return countWay(n-1) + countWay(n-2);
    }
}
