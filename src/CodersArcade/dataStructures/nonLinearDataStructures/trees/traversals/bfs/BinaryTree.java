package CodersArcade.dataStructures.nonLinearDataStructures.trees.traversals.bfs;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
        left = right = null;
    }
}
public class BinaryTree {
    static void levelOrderTraversal(TreeNode root){
        // Base case: If the root is null or the tree is empty, we don't traverse
        if (root == null){
            return;
        }
        // Queue to store the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Because we always have a single node at the root
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            // Left subtree
            if(node.left != null){
                queue.add(node.left);
            }
            // Right subtree
            if(node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Top to Bottom, Left to Right, level By Level
        // Level-0
        TreeNode root = new TreeNode(1);
        // Level-1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // Level-2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Level-3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("Level Order or BFS Traversal: ");
        levelOrderTraversal(root);
    }
}
