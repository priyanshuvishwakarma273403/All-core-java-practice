package TaiyariDSA.array;

import java.util.Scanner;

public class NNaturalNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}
