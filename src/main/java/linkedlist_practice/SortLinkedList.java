package linkedlist_practice;

public class SortLinkedList {
    Node head = null;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    void push(int val){
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    void printList(Node head){
        if(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node middle = findMiddle(head);
        return middle;
    }

    Node findMiddle(Node head){
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        SortLinkedList li = new SortLinkedList();
        li.push(15);li.push(10);li.push(5);li.push(7);li.push(11);li.push(6);
        li.head = li.mergeSort(li.head);
        System.out.println("Sorted Linked list");
        li.printList(li.head);
    }
}
