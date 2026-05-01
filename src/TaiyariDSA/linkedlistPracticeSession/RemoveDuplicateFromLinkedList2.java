package TaiyariDSA.linkedlistPracticeSession;

public class RemoveDuplicateFromLinkedList2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head = deleteDuplicates(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head;

        while (i != null) {
            if (i.next == null || i.val != i.next.val) {
                t.next = i;
                t = i;
                i = i.next;
            } else {
                ListNode j = i.next;
                while (j != null && j.val == i.val) {
                    j = j.next;
                }
                i = j;
            }
        }

        t.next = null;
        return dummy.next;
    }
}