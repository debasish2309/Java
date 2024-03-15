package Java.practice_tree;

//Check if two nodes are cousins in a Binary Tree
public class CousinNodes {

    public Node root;

    

    public static void main(String[] args) {
        CousinNodes tree = new CousinNodes();
        tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(3);
    }
    
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }
}
