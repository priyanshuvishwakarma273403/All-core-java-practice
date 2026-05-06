package TaiyariDSA.string;

import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
