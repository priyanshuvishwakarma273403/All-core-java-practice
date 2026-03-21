package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int base = sc.nextInt();
        System.out.println("Enter exponent :");
        int exponent = sc.nextInt();
        System.out.println(base+" raised to the power "+exponent+" is "+pow(base,exponent));
       //  Built In mathod System.out.println(base+" raised to the power  "+exponent+" is "+Math.pow(base,exponent));
    }
//    mathMethod
    public static int pow(int base, int exponent){
        if(exponent==0) return 1;
        int call = pow(base,exponent/2);
        if(exponent%2==0) return call*call;
      else return base*call*call;
    }
    //Recursion method
//    public static int pow(int base, int exponent){
//        if(exponent==0) return 1;
//        return base*pow(base,exponent-1);
//    }
}
