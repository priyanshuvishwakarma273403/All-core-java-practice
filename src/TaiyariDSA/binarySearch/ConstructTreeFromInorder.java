package TaiyariDSA.binarySearch;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}

public class ConstructTreeFromInorder {
    public static void main(String[] args) {
        int [] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};
        buildTree(inorder, preorder);
    }

    public static Node buildTree(int [] inorder, int [] preorder){
        int n =  inorder.length;
        return build(0,n-1,n-1, inorder,preorder);
    }

    private static Node build(int preLo, int preHi, int inLo, int[] inorder, int[] preorder) {



    }

}
