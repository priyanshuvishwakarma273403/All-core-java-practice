package TaiyariDSA.BInaryTree;

import java.util.ArrayList;
import java.util.Stack;

//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}

public class PreOrder {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = preOrder(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st =  new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.data);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
        return ans;
    }

}
