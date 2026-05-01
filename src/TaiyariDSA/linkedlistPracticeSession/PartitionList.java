package TaiyariDSA.linkedlistPracticeSession;

// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]


public class PartitionList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;

        partition(head, x);
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    private static ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(45);
        ListNode d2 = new ListNode(18);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode t = head;
        while (t != null){
            if(t.val < x){
                t1.next = t;
                t1 = t1.next;
            } else{
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}
