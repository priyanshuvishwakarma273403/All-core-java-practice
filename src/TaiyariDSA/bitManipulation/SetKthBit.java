package TaiyariDSA.bitManipulation;

public class SetKthBit {
    public static void main(String[] args) {
        int n = 15;
        int k = 3;
        System.out.println(setKth(n,k));
    }

    private static int setKth(int n, int k) {
        int mask = (1 << k);
        return n | mask;
    }
}
