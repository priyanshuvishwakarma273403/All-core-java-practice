package TaiyariDSA.array;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
//        int nums = 28;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers :  ");
        int nums = sc.nextInt();
        int sum = 0;
        for(int i= 1; i<= nums/2; i++){
           if(nums % i == 0){
               sum += i;
           }
        }
        System.out.println(nums == sum);
    }
}
