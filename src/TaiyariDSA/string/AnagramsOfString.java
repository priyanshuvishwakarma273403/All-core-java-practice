package TaiyariDSA.string;

import java.util.Arrays;

public class AnagramsOfString {
    public static void main(String[] args) {
        String s1 = "shiva";
        String s2 = "hisva";
        if(s1.length()!=s2.length()){
            return;
        }
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("This are not anagrams");
                return;
            }
        }
        System.out.println("This String is Anagram");
    }
}
