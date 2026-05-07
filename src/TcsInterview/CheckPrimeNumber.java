package TcsInterview;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : " );
        int n = sc.nextInt();
        boolean flag = true;
        if(n <= 1) flag = false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Prime Number" : "Not Prime Number");

    }
}
