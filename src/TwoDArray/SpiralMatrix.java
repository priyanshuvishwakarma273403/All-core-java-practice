package TwoDArray;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> arr = new ArrayList<>();
        int m = matrix.length; int n = matrix[0].length;
        int minrow =0, maxrow = m-1,mincolumn = 0, maxcolumn = n-1;
        while(minrow<=maxrow && mincolumn<=maxcolumn) {
            for (int j = mincolumn; j <= maxcolumn; j++) {
                arr.add(matrix[minrow][j]);
            }
            minrow++;
            if (minrow>maxrow || mincolumn>maxcolumn) {
                break;
            }
            for(int j = minrow;j<=maxrow;j++) {
                arr.add(matrix[j][maxcolumn]);
            }
            maxcolumn--;
            if (minrow>maxrow || mincolumn>maxcolumn) {
                break;
            }
            for(int j = maxcolumn;j>=mincolumn;j--) {
                arr.add(matrix[maxrow][j]);
            }
            maxrow--;
            if(minrow>maxrow || mincolumn>maxcolumn) {
                break;
            }
            for(int j = maxrow;j>=minrow;j--) {
                arr.add(matrix[j][mincolumn]);
            }
            mincolumn++;
        }
        System.out.println(arr);
    }
}
