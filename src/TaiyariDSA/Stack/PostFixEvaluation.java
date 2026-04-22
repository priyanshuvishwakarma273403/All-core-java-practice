package TaiyariDSA.Stack;

import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args) {
        String [] arr = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println(evaluatePostfix(arr));
    }

    private static int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(String s: arr){
            if(isOperator(s)){
                int top = st.pop();
                int bottom = st.pop();
                int val = evaluate(bottom,s,top);
                st.push(val);
            }
            else st.push(Integer.parseInt(s));
        }
        return st.peek();
    }

    private static int evaluate(int a, String op, int b) {
        if(op.equals("+")) return a+b;
        else if(op.equals("-")) return a-b;
        else if(op.equals("*")) return a*b;
        else if(op.equals("/")) return Math.floorDiv(a,b);
        else return (int)(Math.pow(a,b));
    }

    private static boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^"))
            return true;
        else return false;
    }

}
