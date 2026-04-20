package TaiyariDSA.Stack;

import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class RemoveNodesFromLinkedList {

    public ListNode removeNodes(ListNode head){
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            while(!st.isEmpty() && st.peek().val < temp.val){
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }

        ListNode newHead = null;
        while(!st.isEmpty()){
            ListNode node = st.pop();
            node.next = newHead;
            newHead = node;
        }

        return newHead;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        ListNode result = new RemoveNodesFromLinkedList().removeNodes(head);
        printList(result);
    }
}