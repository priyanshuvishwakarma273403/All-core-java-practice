package TaiyariDSA.Stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size() == 0);
        st.push("Khushi");
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");
        System.out.println(st.size());
        System.out.println(st); // A.S. = O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then removes it
        String s = st.pop();

    }
}
