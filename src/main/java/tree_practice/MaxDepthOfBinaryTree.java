package tree_practice;

/**
 * Recursive (DFS):
 * Let's redefine the problem:
 * So, the question says given the root of a binary tree, return the maximum depth of the tree. Max depth means the number of nodes along the longest path from root to farthest leaf node.
 *
 * Recursion:
 * Lets have faith in recursion and assume that we are already given the maximum depth of root's left and right subtrees by recursion.
 * So to fnd the maximum depth of this binary tree, we will have to take out the maximum of the 2 depths given to us by recursion, and add 1 to that to consider the current level i.e. root's level into our depth.
 *
 * image
 *
 * So basically, to find the maximum depth of the binary tree given, we mainly have to have do
 *
 * int maxDepthLeft = maxDepth(root->left);
 * int maxDepthRight = maxDepth(root->right);
 * return max(maxDepthLeft, maxDepthRight) + 1;
 * Base Case:
 * We can easily analyse that if we are at a leaf node as root, then its left and right subtrees will have 0 depth, and consecutively, this leaf node will have max depth of 1.
 *
 * Example (Dry Run):
 * Lets take this example up and try running our approach on it.
 *
 * image
 *
 * image
 *
 * Code:
 * int maxDepth(TreeNode* root) {
 *         if(!root) return 0;
 *         int maxLeft = maxDepth(root->left);
 *         int maxRight = maxDepth(root->right);
 *         return max(maxLeft, maxRight)+1;
 *     }
 * Comlexity:
 * TC - O(num of nodes) as we are traversing all the nodes of the tree
 * SC - O(max depth of the tree)
 */
public class MaxDepthOfBinaryTree {

    static class  Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            val=data;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        MaxDepthOfBinaryTree obj = new MaxDepthOfBinaryTree();
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right.right = node5;

        int output = obj.maxDepth(root);
        System.out.println(output);
    }

    public int maxDepth(Node root){
       if(root==null) return 0;
       int l=maxDepth(root.left);
       int r = maxDepth(root.right);
       return Math.max(l,r)+1;
    }
}

/**
 * This is the iterative version of finding the depth. The recursive version is trivial, so expect the interviewer to ask for the iterative version. I used two stacks for the dfs one and a queue for the level-order traversal one. Level order one is faster.
 *
 * DFS
 *
 * public int maxDepth(TreeNode root) {
 *     if(root == null) {
 *         return 0;
 *     }
 *
 *     Stack<TreeNode> stack = new Stack<>();
 *     Stack<Integer> value = new Stack<>();
 *     stack.push(root);
 *     value.push(1);
 *     int max = 0;
 *     while(!stack.isEmpty()) {
 *         TreeNode node = stack.pop();
 *         int temp = value.pop();
 *         max = Math.max(temp, max);
 *         if(node.left != null) {
 *             stack.push(node.left);
 *             value.push(temp+1);
 *         }
 *         if(node.right != null) {
 *             stack.push(node.right);
 *             value.push(temp+1);
 *         }
 *     }
 *     return max;
 * }
 * // 7ms
 * BFS
 *
 * public int maxDepth(TreeNode root) {
 *     if(root == null) {
 *         return 0;
 *     }
 *     Queue<TreeNode> queue = new LinkedList<>();
 *     queue.offer(root);
 *     int count = 0;
 *     while(!queue.isEmpty()) {
 *         int size = queue.size();
 *         while(size-- > 0) {
 *             TreeNode node = queue.poll();
 *             if(node.left != null) {
 *                 queue.offer(node.left);
 *             }
 *             if(node.right != null) {
 *                 queue.offer(node.right);
 *             }
 *         }
 *         count++;
 *     }
 *     return count;
 * }
 *
 */



