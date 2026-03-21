package Practice;

import java.util.Scanner;

public class cwh_4 {
    public static void main(String[] args) {
        System.out.println("two sum");
    }

    // Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    public static boolean twosum(int arr[], int target) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                   return true;
                }

            }
        return false;

        }
    }


