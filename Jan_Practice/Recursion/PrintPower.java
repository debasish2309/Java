package Jan_Practice.Recursion;

public class PrintPower {
    
    public static void main(String[] args) {
        System.out.println(printPower(2, 5));
        
    }

    public static int printPower(int x , int n) {
        if(n == 0 ){
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        int x_ = printPower(x, n- 1);
         int xn = x * x_;
        return xn;

    }
}
 