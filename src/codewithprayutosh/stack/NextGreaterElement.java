package codewithprayutosh.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    public static ArrayList<Integer> nextlargestElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }

            st.push(arr[i]);

        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println( nextlargestElement(arr));
    }
}
