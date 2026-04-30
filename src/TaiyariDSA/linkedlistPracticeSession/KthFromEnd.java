package TaiyariDSA.linkedlistPracticeSession;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class KthFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
//        head.next.next.next.next.next.next.next.next.next = new Node(10);
        int k = 3;
        System.out.println(getKthFromLast(head,k));
    }

    private static int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for(int i =1; i<=k; i++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
