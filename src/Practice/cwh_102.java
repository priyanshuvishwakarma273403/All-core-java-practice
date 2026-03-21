package Practice;

import java.util.Arrays;

public class cwh_102 {
    public static void main(String[] args) {
        int [] arr = {34,54,23,45,23,55,67,89};
        int [] arr2 = {34,66,23,98,43,55,87,98,3};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
