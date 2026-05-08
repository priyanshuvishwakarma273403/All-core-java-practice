package TcsInterview;

import java.util.Scanner;

public class CountVowelAndConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vowels = 0 ,  consonents = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) !=-1){
                    vowels++;
                }else consonents++;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonents : " + consonents);
    }
}
