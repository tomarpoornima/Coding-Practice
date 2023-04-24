package tree_practice;

import java.util.LinkedList;
import java.util.Queue;

/*
* Time Complexity: O(N) where n is the number of nodes in the binary tree.
Auxiliary Space: O(N) where n is the number of nodes in the binary tree.
* */
public class LevelOrderTraversalUsingQueue {
    Node root;

    void  printLevelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.data+" ");
            if(tempNode.left!= null){
                queue.add(tempNode.left);
            }
            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }

    }
    public static void main(String[] args) {
        LevelOrderTraversalUsingQueue tree = new LevelOrderTraversalUsingQueue();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printLevelOrder();
    }
}
