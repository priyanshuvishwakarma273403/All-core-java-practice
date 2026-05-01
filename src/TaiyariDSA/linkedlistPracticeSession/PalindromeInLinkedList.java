package TaiyariDSA.linkedlistPracticeSession;

public class PalindromeInLinkedList {
    public static void main(String[] args) {
        Node head = new  Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.println( isPalindrome(head));
    }
    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
       return  prev;
    }

    private static boolean isPalindrome(Node head) {
        Node slow =  head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = null;
         head2 =reverse(head2);

        Node i = head;
        Node j = head2;
        while(j!=null){
            if(i.data != j.data){
                return false;
            }
            i = i.next;
            j = j.next;
        }
        return true;
    }
}
