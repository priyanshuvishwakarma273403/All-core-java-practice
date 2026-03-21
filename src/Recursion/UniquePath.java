package Recursion;

public class UniquePath {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3,4},{5,4,5,3},{8,6,4,3}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println(uniquePaths(n,m));
    }
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
}

