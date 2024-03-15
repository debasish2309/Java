package Java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class apna_order {

   static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
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
        System.out.print(-1 + " ");
        return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
   }

   public static void postorder(Node root) {
    if(root == null) {
        System.out.print(-1 + " ");
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");

   }

   public static void inorder(Node root) {
    if(root == null) {
        System.out.print(-1 + " ");
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
   }

   public static void levelorder(Node root) {

    if(root == null) {
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()) {
        Node curr = q.remove();
           if(curr == null) {
               System.out.println();
               //queue empty
               if(q.isEmpty()) {
                   break;
               } else {
                   q.add(null);
               }
           } else {
               System.out.print(curr.data+" ");
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }
        }
    }

    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right); 

        return leftNodes + rightNodes + root.data;
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    public static int diameter(Node root) {
        if(root == null) {
            return 0 ;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam2, diam1));
    }
   

   public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
       preorder(root);
       System.out.println();
       postorder(root);
       System.out.println();
       inorder(root);
    //   System.out.println(root.data);
        System.out.println();
       levelorder(root);
       System.out.println(countOfNodes(root));
       System.out.println(sumOfNodes(root));
       System.out.println(height(root));
       System.out.println(diameter(root));


   }
    
}
