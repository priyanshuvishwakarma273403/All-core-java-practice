package TaiyariDSA.recursion;

public class Uniquepath {
    public static void main(String[] args) {
        int[][] arr = new int[3][7];
        int m = arr.length;
        int n = arr[0].length;
        System.out.println(unique(m,n));
    }

    private static int unique(int m, int n) {
        if(m==1 || n==1) return 1;
        return unique(m-1,n) + unique(m,n-1);

    }
}
