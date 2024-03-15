package Jan_Practice.Recursion;

public class Hanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "s", "h", "d");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transferring disk " + n + " from " + src +" to " + dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1,src, dest, helper);

        System.out.println("transferring disk " + n +  " from " + src +" to " + dest);

        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper,src,dest);  
    }
    
}
