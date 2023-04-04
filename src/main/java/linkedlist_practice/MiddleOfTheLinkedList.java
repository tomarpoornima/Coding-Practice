package linkedlist_practice;

public class MiddleOfTheLinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void pushNode(int data){
        Node  new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

     public void printNode(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
         System.out.print("Null"+"\n");
     }
      public int getLen(){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
      }

      public void printMiddle(){
        if(head!=null) {
            Node temp = head;
            int len = getLen();
            int middleLength = len/2;
            while (middleLength!=0){
                temp = temp.next;
                middleLength--;
            }
            System.out.println("Middle of LinkedList is: "+temp.data);
        }
      }
    public static void main(String[] args) {
        MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
        for(int i=1; i<=5; i++){
            obj.pushNode(i);
            obj.printNode();
            obj.printMiddle();
        }
    }
}
/*
* In this question we need to find the middle element of a linked list of size N.
Middle Element = N/2 or N/2+1

First Approach: Using Two Passes

Iterate over the whole linked list and find the length of the linked list, say N.
Then, iterate till N/2+1 in case of odd number of nodes and N/2 in case of even number of nodes.
In this case Time Complexity will be O(N) and Space Complexity will be O(1).

class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        int middlePos = 0;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            count++;
        }

        if(count % 2 == 0)
            middlePos = count / 2;
        else
            middlePos = count / 2 + 1;

        for(int i = 0; i < middlePos; i++) {
            head = head.next;
        }
        return head;
    }
}


Alternative Approach: Using Extra Space

Iterate over the whole linked list and store the data in an ArrayList.
Then find the element by accessing the N/2 index of the ArrayList.
In this case Time Complexity and Space Complexity will be O(N).




Second Approach: Using Two pointers

Let's think of a scenario where you have a field 200m long and there are two people, A is running with 1x speed and B is running with 2x, so at any given point A will be at half of what B has reached.

Say both starts at 0m, when Person B reaches 50m then Person A will be at 25m. When Person B reaches 100m then Person A will be at 50m.

After sometime If Person B reaches 200m then Person A will be at 100m.
Hence Person A is at mid of the field, when B reaches the end.

In order to solve this problem, we are going to use Two pointers, one pointer which moves with 1x speed and another one with 2x speed.

In this case Time Complexity will be O(N) and Space Complexity will be O(1).

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

*/