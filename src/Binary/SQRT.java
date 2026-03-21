package Binary;

import java.util.Scanner;

public class SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        int n = sc.nextInt();
        int low =1;
        int high =n;
        while(low<=high){
            int mid = low + (high- low)/2;
            if(mid==n/mid){
                System.out.println(mid);
            }
            else if(mid>n/mid){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        System.out.println("Target is: "+n);
    }
}
