package Java.practice_tree;

import java.io.*;

//Find the checksum of integers
public class CheckSum {

    public Node root;

    int left = 0;
    private int sumData(Node root) {
        if(root == null) {
            return 0;
        }
               
        return sumData(root.left) + sumData(root.right) + root.data;
    }

    private int getSumTree(Node root) {
        if(root == null) {
            return 0;
        }

        int ls = sumData(root.left);
        int rs = sumData(root.right);
        int data = root.data;
        if(data == ls + rs) {
            return 1;
        }

        return 0;

    }



    public static void main(String[] args) {
        CheckSum tree = new CheckSum();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(3);
        System.out.println(tree.getSumTree(tree.root));

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
