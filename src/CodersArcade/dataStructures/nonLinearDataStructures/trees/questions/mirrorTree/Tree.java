package CodersArcade.dataStructures.nonLinearDataStructures.trees.questions.mirrorTree;
public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
    private static void inOrder(Tree root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static Tree mirrorTree(Tree root){
        if(root == null){
            return null;
        }
        // Swap the left & right subtrees
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Recursive swap for the children as well
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        System.out.print("InOrder of Original Tree: ");
        inOrder(root);
        System.out.println();
        root = mirrorTree(root);
        System.out.print("InOrder of Mirror Tree: ");
        inOrder(root);
        System.out.println();
    }
}
