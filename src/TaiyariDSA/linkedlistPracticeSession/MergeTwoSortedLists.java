package TaiyariDSA.linkedlistPracticeSession;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
        Node result = sortedMerge(head1, head2);
        printList(result);

    }

    private static Node sortedMerge(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        while (i!= null && j!= null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null){
            k.next = j;
        }else {
            k.next = i;
        }
        return dummy.next;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
