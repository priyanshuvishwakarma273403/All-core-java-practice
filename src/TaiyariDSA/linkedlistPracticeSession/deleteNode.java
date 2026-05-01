package TaiyariDSA.linkedlistPracticeSession;

class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public void delete(ListNode head){
        head.val = head.next.val;
        head.next = head.next.next;
    }
}

public class deleteNode {
    public static void main(String[] args) {
        ListNode target =  new ListNode(4);
        target.next = new ListNode(5);
        target.next.next = new ListNode(1);
        target.next.next.next = new ListNode(9);
        target.delete(target.next);
        while(target != null){
            System.out.print(target.val + " ");
            target = target.next;
        }
    }
}
