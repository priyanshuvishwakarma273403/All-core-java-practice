package TaiyariDSA.linkedlistPracticeSession;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(5);

        Node result = removeDuplicates(head);
       printLIst(result);

    }

    private static void printLIst(Node result) {
        while(result!=null){
            System.out.print(result.data+" ");
            result = result.next;
        }
    }

    private static Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head.next;

        while (j != null) {
            if (i.data == j.data) {
                j = j.next;
            } else {
                i.next = j;
                i = j;
                j = j.next;
            }
        }

        i.next = null;
        return head;
    }
}


//If your linked list is:
//        1 -> 2 -> 2 -> 3 -> 4 -> 2
//then your current algorithm will not remove all duplicates correctly.
//Why?
//Because your code only removes adjacent duplicates (works for sorted linked lists).