package TaiyariDSA.linkedlistPracticeSession;

public class NodeOfLL {
    public static void main(String[] args) {
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(e.data);
        System.out.println(a.next.next.next.data);
        System.out.println(c.data);
        System.out.println(b.next.data);
        System.out.println(a.next.next.data);
    }
}
