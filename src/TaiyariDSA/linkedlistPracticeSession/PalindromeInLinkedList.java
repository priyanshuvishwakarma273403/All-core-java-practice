package TaiyariDSA.linkedlistPracticeSession;

public class PalindromeInLinkedList {
    public static void main(String[] args) {
        Node head = new  Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        reverse(head);
        isPalindrome(head);

    }

    private static boolean isPalindrome(Node head) {

    }

    static void reverse(Node head) {

    }
}
