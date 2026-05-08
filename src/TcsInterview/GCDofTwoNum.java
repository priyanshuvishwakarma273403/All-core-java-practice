package TcsInterview;

import Recursion.GCD;

import java.util.Scanner;

public class GCDofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),  b = sc.nextInt();
        while(b != 0){
            int temp = b;
            b =  a % b;
            a = temp;
        }
        System.out.println(a);

//        suppose input a = 10 , b = 8;
//        10 = 1,2,5,10; jisse ye divide ho jaye wo digit lene h
//        8 = 1,2,4,8
//        common hai dono me se 1,2, toh highest 2 hoga


    }
}
