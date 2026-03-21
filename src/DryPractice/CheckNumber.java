package DryPractice;

import java.util.Arrays;

public class CheckNumber {
    public static void main(String[] args) {
        int [] arr ={77,77,65,65,65,77};
        System.out.println(Arrays.toString(arr));
        int num1 = 65;
        int num2 = 77;
        System.out.println(result(arr,num1,num2));

    }
    static boolean result(int [] arr,int num1,int num2){
        for(int ele :arr)
        {
           boolean b = ele != num1 && ele != num2;
           if(b) {
               return false;
           }
        }
        return true;
    }
}
