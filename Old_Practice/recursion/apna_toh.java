package Java.recursion;

public class apna_toh {

    private static void towerOfHanoi(int n , String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transer disc " + n + " from " + src + " to " + dest);
            return;
        }

        //transfer top n-1 from src to destination
        towerOfHanoi(n -1, src, dest, helper);

        //transfer nth from stc to dest
        System.out.println("transfer disc " + n + " from " + src +  " to " + dest);

        //transfer n-1 from src to destination
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 5;
        towerOfHanoi(n, " S ", " H ", " D ");
    }
    
}
