package TaiyariDSA.binarySearch;

//class Node{
//    int val;
//    Node left;
//    Node right;
//    public Node(int val){
//        this.val = val;
//    }
//
//    @Override
//    public String toString() {
//        return String.valueOf(val);
//    }
//}

import static TaiyariDSA.binarySearch.dfs_level.inOrder;

public class ConstructTreeFromInorder {
    public static void main(String[] args) {
        int [] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};
        Node root = buildTree(inorder, preorder);
        inOrder(root);
        System.out.println();

    }

    public static Node buildTree(int [] inorder, int [] preorder){
        int n =  inorder.length;
        return build(0,n-1,0,n-1, inorder, preorder);
    }

    private static Node build(int preLo, int preHi, int inLo, int inHi, int[] inorder, int[] preorder) {
        if(preLo > preHi || inLo > inHi) return null;
        int val = preorder[preLo];
        Node root = new Node(val);
        int r = 0;
        for(int i = inLo; i <= inHi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int cnt = r - inLo; // Number of elements in LST
        root.left = build(preLo+1,preLo+cnt,inLo,r-1,inorder,preorder);
        root.right = build(preLo+cnt+1,preHi,r+1,inHi,inorder,preorder);
        return root;
    }

}
