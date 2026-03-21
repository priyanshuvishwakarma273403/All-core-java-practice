package com.ArrayQuestion;

import java.util.Arrays;

public class Quest7 {
    static void main() {
        int arr[] = {32,54,32,42,98,1,3,9};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;

            }
            else {
                countOdd++;
            }
        }
        System.out.println("Count of even numbers is: " + countEven);
        System.out.println("Count of odd numbers is: " + countOdd);

    }
}





