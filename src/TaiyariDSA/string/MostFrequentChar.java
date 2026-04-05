package TaiyariDSA.string;

//Given a string s of lowercase alphabets. The task is to find the maximum
// occurring character in the string s. If more than one character occurs the
// maximum number of times then print the lexicographically smaller character.
//Input: s = "testsample"
//Output: 'e'
//Explanation: 'e' is the character which is having the highest frequency.

import java.util.Arrays;

public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "testcase";
//        int n = s.length();
//        int [] freq = new int[26];
//        for(int i = 0; i < n; i++){
//            char ch = s.charAt(i);
//            int idx = ch - 'a';
//            freq[idx]++;
//        }
//        int maxFreq = 0;
//        char ans = s.charAt(0);
//        for(int i=0;i<26;i++){
//            if(freq[i]>maxFreq){
//                maxFreq = freq[i];
//                ans = (char)(i + 97);
//            }
//        }
//        System.out.println(ans);


        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0, j =0;
        while(j< n){

            if(arr[i] == arr[j]){
                j++;
            }else{
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                 i = j;
            }
        }

        int freq = j-i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        System.out.println(ans);


    }
}
