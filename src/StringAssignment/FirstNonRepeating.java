package StringAssignment;

import java.util.Arrays;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "success";

        int ch [] = new int[256];
        for(int i = 0; i < s.length(); i++){
            ch[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++){
            if(ch[s.charAt(i)] == 1){
                System.out.println("NoN repeating char is "+s.charAt(i));
                return;
            }
        }
        System.out.println("NoN repeating char found");
    }
}
