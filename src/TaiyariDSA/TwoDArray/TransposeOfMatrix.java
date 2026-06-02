package TaiyariDSA.TwoDArray;

import java.util.Arrays;

public class TransposeOfMatrix {

    public static int[][] transpose(int[][] matrix, int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,4,-1},{-10,5,11},{18,-7,6}};
        int n = matrix.length;
        System.out.println(Arrays.deepToString(transpose(matrix, n)));

    }
}
