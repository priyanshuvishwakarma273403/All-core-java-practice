package TcsInterview;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum = sum + n%10;  //add the element
            n = n/10; // remove the last element
        }
        System.out.println("The sum is: " + sum);
    }
}
