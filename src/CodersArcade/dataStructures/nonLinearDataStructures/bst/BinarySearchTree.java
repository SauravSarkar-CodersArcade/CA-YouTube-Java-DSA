package CodersArcade.dataStructures.nonLinearDataStructures.bst;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value){
        data = value;
        left = right = null;
    }
}
public class BinarySearchTree {
    static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // 1. Empty tree or the data(key) is at the root node only
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        inOrderTraversal(root);
        System.out.println();
        int[] arr = {60,20,30,10,58,100};
        for (int i=0; i< arr.length; i++){
            root = insert(root, arr[i]);
        }
        inOrderTraversal(root);
        System.out.println();
        TreeNode result = search(root, 1001);
        if(result == null){
            System.out.println("Not found");
        }else {
            System.out.println("Found");
        }
        root = deleteNode(root, 58);
        inOrderTraversal(root);
        System.out.println();
    }
    static TreeNode findMin(TreeNode root){
        TreeNode current = root;
        while (current != null && current.left != null){
            current = current.left;
        }
        return current;
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{
            // Only one child - return the non-null child
            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            } else if (root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with 2 children
            // Find the in-order successor & replace the root node with that value
            // The inorder successor of a node is the smallest value of the
            // right subtree
            TreeNode temp = findMin(root.right);
            // Replace the root node with the inorder successor
            root.data = temp.data;
            // Delete the duplicate element that exists after this operation
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
}
