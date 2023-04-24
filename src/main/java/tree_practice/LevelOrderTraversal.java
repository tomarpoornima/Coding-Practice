package tree_practice;

class Node{
    Node left, right;
    int data;
    public Node(int val){
        data = val;
        left = right = null;
    }
}
/*LevelOrderTraversal by recursion
* Time Complexity: O(N2), where N is the number of nodes in the skewed tree. So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(N2).
    Auxiliary Space:  O(N) in the worst case. For a skewed tree, printGivenLevel() uses O(n) space
* */
public class LevelOrderTraversal {

    Node root;
    public LevelOrderTraversal(){
        root = null;
    }
    void printLevelOrder(){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++){
            printCurrentLevel(root, i);
        }
    }

    int height(Node root){
        if(root == null){
            return 0;
        }else{
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight > rheight){
                return (lheight+1);
            }else{
                return  (rheight+1);
            }
        }

    }
    void printCurrentLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data+" ");
        }else if(level > 1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right = new Node(5);

        tree.printLevelOrder();
    }

}
