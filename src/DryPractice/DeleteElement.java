package DryPractice;

import java.util.Scanner;

//Delete an element from a specific index Remove an element and shift the remaining elements.
public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {43, 54, 66, 78, 54};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index : ");
        int index = sc.nextInt();
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
            }
            else {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int element : arr1) {
            System.out.print(element + " ");
        }
    }
}