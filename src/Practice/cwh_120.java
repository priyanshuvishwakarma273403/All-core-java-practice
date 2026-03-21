package Practice;

import java.util.Scanner;

public class cwh_120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr ={sc.nextInt()};
        boolean isPalidrome = true;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-1-i])
            {
                isPalidrome = false;
                break;
            }
        }
        if(isPalidrome)
        {
            System.out.println("The Number is palindrome");
        }
        else
        {
            System.out.println("The Number is not palindrome");
        }

    }
}
