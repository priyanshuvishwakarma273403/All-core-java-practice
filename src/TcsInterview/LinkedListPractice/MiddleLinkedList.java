package TcsInterview.LinkedListPractice;

public class MiddleLinkedList {

    static int getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

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
        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);


        printLinkedList(head);
        System.out.println();

        int middle = getMiddle(head);
        System.out.println("Middle linked list is: " + middle);



    }
}
