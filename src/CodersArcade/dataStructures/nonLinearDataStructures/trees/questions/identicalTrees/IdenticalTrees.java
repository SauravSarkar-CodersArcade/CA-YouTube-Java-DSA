package CodersArcade.dataStructures.nonLinearDataStructures.trees.questions.identicalTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int x){
        val = x;
        left = right = null;
    }
}
public class IdenticalTrees {
    static boolean areIdentical(Node t1, Node t2){
        // Both are null
        if(t1 == null && t2 == null){
            return true;
        }
        // If one of them is null
        if(t1 == null || t2 == null){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        // Use recursion to validate the left & right subtrees
        return (areIdentical(t1.left, t2.left) && areIdentical(t1.right, t2.right));
    }

    public static void main(String[] args) {
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);
        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);
        Node t3 = new Node(1);
        t3.left = new Node(2);
        t3.right = new Node(5);
        Node t4 = new Node(1);
        t4.left = new Node(2);
        t4.right = new Node(3);
        System.out.println(areIdentical(t1, t2));
        System.out.println(areIdentical(t3, t4));
    }
}
