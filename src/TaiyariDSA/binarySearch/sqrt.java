package TaiyariDSA.binarySearch;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        if(n ==0){
            System.out.println(0);
            return;
        }
        int low = 0 , high = n;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid == n/mid){
                System.out.println(mid);
                return;
            }
            else if(mid > n/mid) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(high);
    }
}
