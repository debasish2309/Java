package Java.practice_tree;

//Construct a tree from Inorder and Level order traversals
public class ConstructTree {

    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public void setLeft(Node left) { this.left = left; }
 
        public void setRight(Node right) { this.right = right; }
    }

    private Node buildTree(int in[],int level[]) {
        Node startNode = null;
        return constructTree(startNode, level, in, 0, in.length - 1);
    }

    private Node constructTree(Node startNode,int[] levelOrder,int[] inOrder,int inStart,int inEnd) {
        if(inStart > inEnd) {
            return null;
        }
        if(inStart == inEnd) {
            return new Node(inOrder[inStart]);
        }
        boolean found = false;
        int index = 0;
        for(int i = 0 ; i < levelOrder.length ; i++) {
            int data = levelOrder[i];
            for(int j = inStart; j < inEnd ; j++) {
                if (data == inOrder[j]) {
                startNode = new Node(data);
                index = j;
                found = true;
                break;
                }
            }
            if (found == true)
                break;
        }
        startNode.setLeft(
            constructTree(startNode, levelOrder, inOrder,
                          inStart, index - 1));
        startNode.setRight(
            constructTree(startNode, levelOrder, inOrder,
                          index + 1, inEnd));
 
        return startNode;


    }

    private void printInorderTree(Node node) {
        if(node == null) {
            return ;
        }
        printInorderTree(node.left);
        System.out.print(node.data + " ");
        printInorderTree(node.right);
    }

    public static void main(String[] args) {
        ConstructTree constructTree = new ConstructTree();
        int in[] = new int[] { 4, 8, 10, 12, 14, 20, 22 };
        int level[] = new int[] { 20, 8, 22, 4, 12, 10, 14 };
        int n = in.length;
        Node node = constructTree.buildTree(in, level);
        System.out.print("Inorder traversal to construct tree");
        constructTree.printInorderTree(node);
    }
    
}
