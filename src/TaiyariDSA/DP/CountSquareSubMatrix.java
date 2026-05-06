package TaiyariDSA.DP;

import java.util.Arrays;

public class CountSquareSubMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int [][] arr = {{0, 1, 1, 1},{1, 1, 1, 1},{0, 1, 1, 1}};
        countSquares(n,m,arr);
        System.out.println(Arrays.deepToString(arr));

    }

    private static int countSquares(int n, int m, int[][] arr) {
        int count = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                if(i!=0 && j!=0){
                    if(arr[i][j]==1){
                        arr[i][j] += Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                    }
                }
                count += arr[i][j];
            }
        }
        return count;
    }
}
