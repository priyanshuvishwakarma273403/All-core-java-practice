package TwoDArray;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row:");
        int row = sc.nextInt();
        int [][] arr = new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter number of column:"+(i+1)+":");
            int column = sc.nextInt();
            arr[i]=new int[column];
            System.out.println("Enter element:"+column+"enter for row"+(i+1)+":");
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        for(int j=0;j<arr.length;j++){
            for(int k=0;k< arr[j].length;k++){

                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
