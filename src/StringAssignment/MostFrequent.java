package StringAssignment;

import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[]arr = new int[256];
        int max =0; int smax=0;
        for(int i =0;i<s.length();i++) {
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            else if(arr[i]==max && arr[i]!=smax) {
                smax = arr[i];
            }
        }
        System.out.println("Max Repeated array"+max);
        System.out.println("Second max"+smax);

    }
}
