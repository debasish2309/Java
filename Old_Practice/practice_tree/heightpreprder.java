package Java.practice_tree;


// Java program to find height of full binary tree using preorder
public class heightpreprder {

    private int findDepth(String tree,int n, int index) {
        if(index >= n || tree.charAt(index) == 'l')
            return 0;

        index++;
        int left = findDepth(tree,n, index);

        index++;
        int right = findDepth(tree, n, index);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        String tree = "nlnnlll";
        int n = tree.length();
        heightpreprder height = new heightpreprder();
        System.out.println(height.findDepth(tree, n, 0));
    }
    
}
