package TaiyariDSA.heaps;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class BSTToMaxHeap {
    static int idx;
    public static void main(String[] args) {
       Node root = new Node(4);
       root.left = new Node(2);
       root.right = new Node(6);
       root.left.left = new Node(1);
       root.left.right = new Node(3);
       root.right.left = new Node(5);
       root.right.right = new Node(7);
        convertToMaxHeapUtil(root);
    }

    private static void convertToMaxHeapUtil(Node root) {
        idx = 0;
        ArrayList<Integer> in = new ArrayList<>();
        inorder(root,in);
        postorder(root,in);
        for(int ele : in){
            System.out.print(ele+" ");
        }
    }

    private static void postorder(Node root, ArrayList<Integer> in) {
        if(root==null) return;
        postorder(root.left,in);
        postorder(root.right,in);
        root.data=in.get(idx++);
    }

    private static void inorder(Node root, ArrayList<Integer> in) {
        if(root==null) return;
        inorder(root.left,in);
        in.add(root.data);
        inorder(root.right,in);
    }

}
