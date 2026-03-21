package Practice;

import java.util.Scanner;

public class cwh_94 {
    static void main() {
        int arr[];
        arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        int arr1[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<5;i++)
            {
               arr1[i]=sc.nextInt();
            }
        System.out.println("print array elements:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        int arr2[] = {43,54,76,54,43};
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int arr3[] ={32,43,54,63};
        for(int i=0;i<4;i++)
        {
            System.out.println(arr3[i]);
        }

    }
}
