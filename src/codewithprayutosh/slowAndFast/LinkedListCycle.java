package codewithprayutosh.slowAndFast;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
