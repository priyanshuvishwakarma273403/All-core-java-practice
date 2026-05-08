package TcsInterview;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        int left = 0; int right = str.length()-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
//        StringBuilder reversed = new StringBuilder();
//        for(int i = str.length()-1; i>= 0 ; i--){
//            reversed.append(str.charAt(i));
//        }
//        System.out.println(reversed);
    }
}
