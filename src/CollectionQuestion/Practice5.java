package CollectionQuestion;

import java.util.HashMap;
import java.util.Stack;

public class Practice5 {
    static HashMap<Integer,Integer> endIndex = new HashMap<>();
    public static void getClosingIndex(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
           if(s.charAt(i) == ')'){
               int startIndex = st.pop();
               endIndex.put(startIndex, i);
           }
           else{
               st.push(i);
           }
        }
    }

    public static  int calcWeight(String s,int low , int high){
        if(low+1 == high){
            return 1;
        }
        else{
            int mid = endIndex.get(low);
            if(mid == high){
                return 2* calcWeight(s,low+1,high-1);

            }
            else{
                return calcWeight(s,low,mid) +calcWeight(s,mid+1,high);
            }
        }
    }

    public static void main(String[] args) {
        String input = "(()(()))";
        int n = input.length();
        getClosingIndex(input);
        System.out.println(calcWeight(input,0,n-1));

    }
}
