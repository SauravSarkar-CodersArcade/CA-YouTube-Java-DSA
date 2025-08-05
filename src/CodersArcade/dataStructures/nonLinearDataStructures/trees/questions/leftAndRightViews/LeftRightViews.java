package CodersArcade.dataStructures.nonLinearDataStructures.trees.questions.leftAndRightViews;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int x){
        val = x;
        left = right = null;
    }
}
public class LeftRightViews {
    public static void printRightView(Node root){
        if(root == null){
            System.out.println("Empty tree, no right view.");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++){
                Node node = q.poll();
                if(i == levelSize - 1) System.out.print(node.val + " "); // Last node at that level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }
    public static void printLeftView(Node root){
        if(root == null){
            System.out.println("Empty tree, no left view.");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++){
                Node node = q.poll();
                if(i == 0) System.out.print(node.val + " "); // Last node at that level
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        printRightView(root);
    }

}
