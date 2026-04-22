package TaiyariDSA.hashMapPractice;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}

class Pair{
    Node node;
    int dist;
    Pair(Node node,int dist){
        this.node = node;
        this.dist = dist;
    }
}

public class TopView {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.left = new Node(90);
        root.right.right = new Node(100);
        System.out.println(topView(root));
    }

    public static List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        int min = 0, max = 0;

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            Node node = curr.node;
            int dist = curr.dist;

            if (!map.containsKey(dist)) {
                map.put(dist, node.data);
            }

            min = Math.min(min, dist);
            max = Math.max(max, dist);

            if (node.left != null) {
                q.add(new Pair(node.left, dist - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, dist + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }
        return ans;

    }
}
