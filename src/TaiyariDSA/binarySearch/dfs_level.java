package TaiyariDSA.binarySearch;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}

public class dfs_level {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4     2
        //   /   \ /   \
        // -1    1 6    9
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;


    }

    private static void preOrder(Node root){
        if(root == null) return;
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }

    private static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val+" ");
    }
}
