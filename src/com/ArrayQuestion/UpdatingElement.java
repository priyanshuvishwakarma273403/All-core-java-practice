package com.ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  ={43,64,75,43,76,9};   // add input to set an array  element
        System.out.println("Enter an array element : ");
        arr[0]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Enter an array index : ");
        arr[sc.nextInt()]=90;  // add input from user to set index
        System.out.println(Arrays.toString(arr));
    }
}
