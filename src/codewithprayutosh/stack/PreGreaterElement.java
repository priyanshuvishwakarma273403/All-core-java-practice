package codewithprayutosh.stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreGreaterElement {

    public static ArrayList<Integer> preGreaterElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] > st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(preGreaterElement(arr));
    }
}
