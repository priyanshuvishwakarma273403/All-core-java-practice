package TwoDArray;

import java.util.Scanner;

public class MatricsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the element of array :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("print elemnt");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

    }

