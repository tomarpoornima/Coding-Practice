package linkedlist_practice;

public class ReverseLinkedList {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            next = null;
        }
    }

     /*static Node reverse(Node head){
        if(head==null){
            return head;
        }
        Node curr = head, next = null, prev = null;
         while (curr!=null) {
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         head = prev;
         return head;
     }
*/
     /*static Node reverseRecursion(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node rest = reverseRecursion(head.next);
        head.next.next = head;

        head.next = null;
        return rest;

     }*/
    static Node reverseRecursion(Node head)
    {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverseRecursion(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;
    }
   static void printList(Node node)
    {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        System.out.println();
       // Node res = reverse(head);
        //printList(res);
        Node rec = reverseRecursion(head);
        System.out.println();
        printList(rec);


    }
}
