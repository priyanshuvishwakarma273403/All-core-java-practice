package TwoDArray;

import java.util.Scanner;

public class Practiceanother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array");
        int n = sc.nextInt();
        System.out.println("Enter the col of the array");
        int m = sc.nextInt();
        int arr [] [] =new int[n][m];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
