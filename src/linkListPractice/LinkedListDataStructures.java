package linkListPractice;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size;

    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp!=null){
            if(temp.val==val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    int get(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void deleteAtHead(int val){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);

        if(tail == null){
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

     void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }


}

public class LinkedListDataStructures {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40); l1.display();
        l1.addAtHead(50);
        l1.addAtHead(60); l1.display();
        System.out.println(l1.size);
        l1.deleteAtHead(2); l1.display();

    }
}
