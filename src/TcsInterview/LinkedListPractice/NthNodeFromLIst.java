package TcsInterview.LinkedListPractice;

public class NthNodeFromLIst {

     public static int getKthFromLast(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++){
            if(fast == null) return -1;
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        int k = 3;
        int kthNode = getKthFromLast(head, k);
        System.out.println(kthNode);

        printLinkedList(head);
    }
}
