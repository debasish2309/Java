package Jan_Practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

import Java.practice_backtrack.stringSum;

public class BinaryTreeYt {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }    
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + "");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if(root == null){
            return 0;
        }
        int leftRoot = countOfNodes(root.left);
        int rightRoot = countOfNodes(root.right);
        return leftRoot + rightRoot + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftRoot = sumOfNodes(root.left);
        int rightRoot = sumOfNodes(root.right);

        return leftRoot + rightRoot + root.data;
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight)  + 1;
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightdia = diameter(root.right);
        int diaRoot = height(root.left) + height(root.right) + 1;

        return Math.max(diaRoot, Math.max(rightdia, leftDia));
    }

    static class TreeInfo {
        int ht;
        int dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }   
    }

    public static TreeInfo diameter2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }
         
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1 ;

        int diam1 = left.dia;
        int diam2 = right.dia;
        int diam3 = left.ht + right.ht + 1;

        int mydia = Math.max(Math.max(diam2, diam1), diam3) ;

        TreeInfo treeInfo = new TreeInfo(myHeight, mydia);
        return treeInfo;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.err.println();
        levelorder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);

    }
    
}
