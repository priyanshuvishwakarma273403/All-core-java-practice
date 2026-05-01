package TaiyariDSA.linkedlistPracticeSession;


public class OddEvenLinkedList {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = oddEvenList(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);
        ListNode odd = oddDummy;
        ListNode even = evenDummy;
        ListNode curr = head;

        while (curr != null) {
            odd.next = curr;
            odd = odd.next;
            curr = curr.next;
            if (curr != null) {
                even.next = curr;
                even = even.next;
                curr = curr.next;
            }
        }

        even.next = null; // imp
        odd.next = evenDummy.next;
        return oddDummy.next;
    }
}