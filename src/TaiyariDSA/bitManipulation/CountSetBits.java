package TaiyariDSA.bitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        for(int i = 0; i<31; i++){
            if((n>>i)%2 != 0) count++;
        }
        return count;
    }
}
