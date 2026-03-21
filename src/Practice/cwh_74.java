package Practice;
import java.util.*;
public class cwh_74 {
    static void main() {
    int arr [] ={10,30,40,20,10,10};
    int num=10;
    int search =30;
       // System.out.println("result"+(arr,num,search));
        System.out.println("Result"+result(arr,num,search));
    }



    public static boolean result(int[] numbers, int search, int num){
        int temp =0;
        for(int ele:numbers){
            if(ele==num)
                temp+=num;
        }
        if(temp>search) {


        }

        return temp==search;

    }
}
