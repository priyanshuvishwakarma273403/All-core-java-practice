package TcsInterview;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers : ");
        int n = sc.nextInt();
        int temp = n , sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        System.out.println(temp == sum ? "Armstrong Number" : "Not Armstrong Number");
    }
}
