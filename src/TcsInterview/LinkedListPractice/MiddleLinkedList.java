package TcsInterview.LinkedListPractice;

public class MiddleLinkedList {


    public static void printLinkedList(Node head) {
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printLinkedList(head);


    }
}
