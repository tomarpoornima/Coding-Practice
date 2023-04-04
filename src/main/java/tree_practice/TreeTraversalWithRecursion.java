package tree_practice;

public class TreeTraversalWithRecursion {
    Node root;
    TreeTraversalWithRecursion(){ root = null;}

    static class Node{
         int val;
         Node left, right;
         public Node(int data){
            val=data;
            left=right=null;
         }
     }
     //Inorder Traversal
     void printInorder(Node root){
         if(root==null)
             return;
         printInorder(root.left);
         System.out.print(root.val+" ");
         printInorder(root.right);
     }

     //Preorder Traversal
      void printPreOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
      }


      //Postorder Traversal
      void printPostorder(Node root){
        if(root==null)
            return;

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.val+" ");
      }
     public static void main(String[] args) {

        TreeTraversalWithRecursion tree = new TreeTraversalWithRecursion();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("In order tree traversal: ");
            tree.printInorder(tree.root);
            System.out.println();

           System.out.println("Pre order tree traversal: ");
           tree.printPreOrder(tree.root);
           System.out.println();

           System.out.println("Post order tree traversal: ");
           tree.printPostorder(tree.root);

    }
}

//Time complexity - O(N) as recursive function T(N) = 2.T(n/2) + 1
//space complexity - O(N)