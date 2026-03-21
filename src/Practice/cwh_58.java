package Practice;

import java.util.Scanner;

public class cwh_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Sixe: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element:");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

       }
        for (int i = 0; i < n; i++)
            if (arr[i] < 0) System.out.print(arr[i]);

    }
}
