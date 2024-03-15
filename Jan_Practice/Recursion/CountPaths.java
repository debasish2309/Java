package Jan_Practice.Recursion;

// count all the paths from 0,0 to 3,3 it can move only right or down in the boxes
public class CountPaths {

    public static int countPath(int i, int j , int n , int m) {

        if(i == n || j == m) {
            return 0 ;
        }
        if(i == n-1 || j == m - 1) {
            return 1;
        }

        int rightPaths = countPath(i + 1, j, n, m);
        int leftPaths = countPath(i, j + 1, n, m);

        return rightPaths + leftPaths;
    }

    public static void main(String[] args) {
       int totalpath =  countPath(0, 0, 3, 3);
       System.out.println(totalpath);
    }
    
}
