package Practice;

import java.util.Arrays;

public class cwh_73 {
    static void main(String[] args) {
        int [] arr ={23,43,54,65,43,32};
        System.out.println(Arrays.toString(arr));
        System.out.println(test(arr));

    }
    public static boolean test(int [] numbers)
    {
        for(int ele:numbers)
        {
            int number = 0;
            if(number==0||number==-1)
                {
                return false;
                }
        }
        return true;
    }
}