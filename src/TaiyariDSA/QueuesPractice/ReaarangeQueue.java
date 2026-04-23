package TaiyariDSA.QueuesPractice;

import java.util.*;

public class ReaarangeQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);

        System.out.println(reearrange(q));
    }

    private static Queue<Integer> reearrange(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for(int i = 0; i < n/2; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i = 0; i < n/2; i++){
            q.add(q.remove());
        }

        for(int i = 0; i < n/2; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }

        return q;
    }
}