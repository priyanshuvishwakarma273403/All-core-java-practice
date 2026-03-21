package Practice;

import java.util.Scanner;

public class cwh_101 {
    public static void main(String[] args) {
        int [] arr = {7,0,4,3,2,8,10};
        Scanner scan = new Scanner(System.in);
        int target =  scan.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length-1;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    j--;
                    i++;
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
