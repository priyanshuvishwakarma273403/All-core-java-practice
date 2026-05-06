package TaiyariDSA.string;

import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "talent";

        if(str1.length()!=str2.length()) {
            System.out.println("this is not anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("this is not anagram");
                return;
            }
        }
        System.out.println("this is anagram");

        // using method
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.equals(arr1, arr2));
    }
}
