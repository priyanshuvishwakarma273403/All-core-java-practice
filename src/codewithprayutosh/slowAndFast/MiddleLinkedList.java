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

    public static ListNode findMiddleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);

        System.out.println(findMiddleNode(head).data);

//        while(head != null){
//            System.out.print(head.data+" ");
//            head=head.next;
//        }

    }
}
