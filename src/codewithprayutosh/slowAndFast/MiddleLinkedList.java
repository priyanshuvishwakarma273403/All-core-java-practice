package codewithprayutosh.slowAndFast;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
}
