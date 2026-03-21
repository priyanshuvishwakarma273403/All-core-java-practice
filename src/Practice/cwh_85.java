package Practice;
import java.util.Scanner;
public class cwh_85 {

         static void main(String[] args) {

            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter row : ");
            int row = s1.nextInt();
            System.out.println("Enter Col : ");
            int col = s1.nextInt();

            int arr[][] = new int[row][col];
            System.out.println("Enter Elements of an Array : ");
            for(int i=0 ; i<row ; i++)
            {
                for(int j=0 ; j<col ; j++)
                {
                    arr[i][j] = s1.nextInt();
                }
            }

            System.out.println("Print Array Element : ");
            for(int i=0 ; i<row ; i++)
            {
                for(int j=0 ; j<col ; j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }


        }
    }

