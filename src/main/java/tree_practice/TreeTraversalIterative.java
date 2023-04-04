package tree_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversalIterative {
    Node root;
    TreeTraversalIterative(){ root=null;}

    static class Node{
        int val;
        Node left, right;

        public Node(int data){
            val=data;
            left=right=null;
        }
    }

    public List<Integer> inorderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return list;

        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while(temp!=null || !stack.isEmpty()){
            while(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            list.add(temp.val);
            temp = temp.right;
        }
        return list;
    }
    public static void main(String[] args) {

        TreeTraversalIterative tree = new TreeTraversalIterative();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);

        System.out.println(tree.inorderTraversal(tree.root));

    }
}

//time complexity - O(N)
//space complexity - O(N)