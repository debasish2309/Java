package Java.Trees;

import java.util.Scanner;

public class tree_creation {

    static Node create() {
        int data;
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter value");
        data = sc.nextInt();
        if(data == -1)
             return null;

        root = new Node(data);
        System.out.print("enter left child" + root);
        root.left = create();
        System.out.print("enter right child" + root);
        root.right = create();
        return root;
    }

    public static void main(String[] args) {
        Node root = create();
    }
    
}

class Node {
    Node left, right;
    int data;
    Node (int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
