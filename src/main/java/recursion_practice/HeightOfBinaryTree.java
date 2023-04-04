package recursion_practice;

public class HeightOfBinaryTree {

    Node root;

   static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int findHeight(Node root){
        if(root==null)
            return 0;

        int left = findHeight(root.left);
        int right = findHeight(root.right);

        return 1+Math.max(left, right);
    }

    public static void main(String[] args) {

        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.right.left = new Node(7);

        System.out.println(findHeight(tree.root));

    }
}
