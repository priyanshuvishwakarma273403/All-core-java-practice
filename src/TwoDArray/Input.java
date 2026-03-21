package TwoDArray;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row = sc.nextInt();
        System.out.print("Enter column:");
        int column = sc.nextInt();
        System.out.println("Enter values:");
        int [][] array = new int [row][column];
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


}
