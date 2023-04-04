package linkedlist_practice;

public class SinglyLinkedListInsertion {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

        //complexity - O(1)
    public void insertAtHead(int val){
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    //complexity - O(N)
    public void insertAtEnd(int val){
        Node new_node = new Node(val);
        if(head == null){
            head = new Node(val);
            return;
        }
        new_node.next = null;

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = new_node;


        return;


    }
    //complexity - O(1)
    public void insertAfterNode(Node prev_node,int val){
        if(prev_node == null){
            return;
        }

        Node new_node = new Node(val);

        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedListInsertion sll = new SinglyLinkedListInsertion();

        sll.insertAtHead(1);
        sll.insertAtHead(2);

        System.out.println("Insert at Head");
        sll.printList();
        System.out.println();

        sll.insertAtEnd(3);
        sll.insertAtEnd(4);

        System.out.println("Insert at End");
        sll.printList();
        System.out.println();

        sll.insertAfterNode(sll.head.next, 5);
        sll.insertAfterNode(sll.head.next.next, 6);

        System.out.println("Insert after node");
        sll.printList();

    }
}
