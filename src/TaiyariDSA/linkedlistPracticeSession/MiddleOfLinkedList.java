package TaiyariDSA.linkedlistPracticeSession;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int middleList = getMiddleList(head);
        System.out.println(middleList);

    }

    private static int getMiddleList(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
