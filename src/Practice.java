import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number row :");
     int row = sc.nextInt();
     System.out.println("Enter number column :");
     int col = sc.nextInt();

     for(int i = 0; i<=row; i++){
         for(int j = 0; j<=col; j++){
             if(j == row){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
    }
}
