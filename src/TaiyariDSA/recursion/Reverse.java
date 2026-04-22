package TaiyariDSA.recursion;

public class Reverse {
    public static void main(String[] args) {
       int n = 12345678;
        System.out.println(reverse(n,0));
    }

    private static int reverse(int n, int r) {
        if(n==1 || n==0) return  r;
        return reverse(n/10, r*10+n%10);
    }
}
