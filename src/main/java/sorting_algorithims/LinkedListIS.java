package sorting_algorithims;

public class LinkedListIS {

    node head;
    node sorted;

    class node{
        int val;
        node next;

        public node(int data){
            val = data;
        }
    }
    void push(int data){
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertionSort(node headref){
        sorted = null;
        node current = headref;
        while(current != null){
            node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }
    void sortedInsert(node newnode){
        if(sorted == null || sorted.val >= newnode.val){
            newnode.next = sorted;
            sorted = newnode;
        }else{
            node current = sorted;
            while (current.next != null && current.next.val < newnode.val){
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    void printList(node head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        LinkedListIS list = new LinkedListIS();
        list.push(5);list.push(20);list.push(4);list.push(3);list.push(30);list.push(7);
        System.out.println("Before sorting: ");
        list.printList(list.head);
        list.insertionSort(list.head);
        System.out.println();
        System.out.println("After sorting: ");
        list.printList(list.head);
    }
}
