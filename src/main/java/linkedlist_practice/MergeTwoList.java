package linkedlist_practice;

public class MergeTwoList {

    static class Node{
        int val;
        Node next;
        public Node(){}
        public Node(int val){this.val = val;}
    }
    public static Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        Node l3 = new Node();
        Node ptr = l3;

        while (l1!=null && l2!=null){
            if(l1.val == l2.val || l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            }else{
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        if(l1==null){
            ptr.next=l2;
        }else{
            ptr.next=l1;
        }
        return l3.next;
    }
    static Node reverseList(Node head){
        if(head.next == null){
            return head;
        }
        Node rest = reverseList(head.next);
        head.next.next= head;
        head.next = null;
        return rest;

    }
    public static void main(String[] args) {

            Node head1 = new Node(1);
            head1.next = new Node(2);
            head1.next.next = new Node(3);

            Node head2 = new Node(4);
            head2.next = new Node(5);

            Node head3 = mergeTwoLists(head1, head2);

            while(head3!= null){
                System.out.print(head3.val+"->");
                head3 = head3.next;
            }


    }
}
