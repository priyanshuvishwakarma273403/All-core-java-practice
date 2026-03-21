package CollectionQuestion;

import java.util.Stack;

public class Practice4 {
    public static void main(String[] args) {
        long N = 6;
        String S = "110110";


    }
    public static void isPossible(long N , String S){
        Stack<Character> st = new Stack<>();
        for(char ch : S.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
            if(st.size() <=1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
