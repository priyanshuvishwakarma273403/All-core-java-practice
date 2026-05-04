package TaiyariDSA.linkedlistPracticeSession;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head =  reverseList(head);

        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

   public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
