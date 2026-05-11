package TcsInterview.LinkedListPractice;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        while(current != null){
            Node nextNode = current.next; // store next
            current.next = prev; // reverse linkedlist
            prev = current; // move prev
            current = nextNode; // move current

        }
        return prev;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printList(head);

        Node reverse = reverse(head);
        printList(reverse);

    }
}
