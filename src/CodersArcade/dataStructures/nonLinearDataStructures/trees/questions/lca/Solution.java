package CodersArcade.dataStructures.nonLinearDataStructures.trees.questions.lca;

import CodersArcade.dataStructures.nonLinearDataStructures.trees.questions.mirrorTree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: If root is null or matches any of the nodes
        if(root == null || root == p || root == q){
            return root;
        }
        // Search the left & right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // If both the left & right are non-null, root will be the LCA
        if(left != null && right != null){
            return root;
        }
        // Otherwise return the non-null child
        return (left != null) ? left : right;
    }
}