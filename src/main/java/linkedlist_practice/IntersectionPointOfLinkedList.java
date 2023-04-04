package linkedlist_practice;

import java.util.Scanner;

/**
 * First Approach-
 * 1. get length of two lists
 * 2. align them to the same point
 * 3. move them together untill find the intersecton point or the end null
 *
 * time complexity - O(M+N)
 * space complexity - O(1)
 *
 * second Approach -
 * 1. using two stack
 * 2. compare two nodes, if their refernce is same will return true else false
 * time - O(M+N), space = O(2N)
 *
 * Third approach -
 * 1. using set
 * 2. push first list node in set
 * 3. compare with second list node, if same node found return the node;
 * time - O(M+N), space - O(N)
 *
 * Reference post - https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-list
 */

public class
IntersectionPointOfLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public void pushNode(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printNode(Node node){

        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    public int getLen(Node node){
        int len=0;
        while(node!=null){
            len++;
            node = node.next;
        }
        return len;
    }
    public  Node getIntersectionNode(Node nodeA, Node nodeB){
         int lenA = getLen(nodeA);
         int lenB = getLen(nodeB);

         while (lenA > lenB){
             nodeA = nodeA.next;
             lenA--;
         }
         while (lenB > lenA){
             nodeB = nodeB.next;
             lenB--;
         }

         while (nodeA!=nodeB){
             nodeA = nodeA.next;
             nodeB = nodeB.next;
         }
         return nodeA;
    }

    public static void main(String[] args) {
        IntersectionPointOfLinkedList list = new IntersectionPointOfLinkedList();

        Scanner sc = new Scanner(System.in);

         Node node1, node2;

        /*
                Create two linked lists

                1st 3->6->9->15->30
                2nd 10->15->30

                15 is the intersection point
        */
        node1 = new Node(3);
        node2 = new Node(10);

        Node newNode = new Node(6);
        node1.next = newNode;

        newNode = new Node(9);
        node1.next.next = newNode;

        newNode = new Node(15);
        node1.next.next.next = newNode;
        node2.next = newNode;

        newNode = new Node(30);
        node2.next.next = newNode;

        node2.next.next.next = null;

        list.printNode(node1);
        list.printNode(node2);
        Node intersectionPoint = list.getIntersectionNode(node1, node2);

        if(intersectionPoint==null){
            System.out.println("No intersection point");
        }else{
            System.out.println("Intersection point: "+intersectionPoint.data);
        }

    }
}
/**
 * I found most solutions here preprocess linkedlists to get the difference in len.
 * Actually we don't care about the "value" of difference, we just want to make sure two pointers reach the intersection node at the same time.
 *
 * We can use two iterations to do that. In the first iteration, we will reset the pointer of one linkedlist to the head of another linkedlist after it reaches the tail node.
 * In the second iteration, we will move two pointers until they points to the same node.
 * Our operations in first iteration will help us counteract the difference. So if two linkedlist intersects,
 * the meeting point in second iteration must be the intersection point. If the two linked lists have no intersection at all, then the meeting pointer in second iteration must be the tail node of both lists, which is null
 *
 * Below is my commented Java code:
 *
 * public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
 *     //boundary check
 *     if(headA == null || headB == null) return null;
 *
 *     ListNode a = headA;
 *     ListNode b = headB;
 *
 *     //if a & b have different len, then we will stop the loop after second iteration
 *     while( a != b){
 *     	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
 *         a = a == null? headB : a.next;
 *         b = b == null? headA : b.next;
 *     }
 *
 *     return a;
 * }
 */

