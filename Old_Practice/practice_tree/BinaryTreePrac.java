package Java.practice_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrac {

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

    int idx = -1;

    private Node insertData(int nodes[]) {
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = insertData(nodes);
        newNode.right = insertData(nodes);

        return newNode;

    }

    private void preorder(Node root) {
        if(root == null) {
            return;
        }      
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    private void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                } 

            }
        }
    }

    private int depth(Node root) {
        if(root == null) {
            return 0;
        }

        int leftheight = depth(root.left);
        int rightHeight = depth(root.right);

        return Math.max(leftheight, rightHeight) + 1;
    }


    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;
        BinaryTreePrac tree = new BinaryTreePrac();
        Node root = tree.insertData(nodes);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrderTraversal(root);
        System.out.println(tree.depth(root));
    }
    
}
