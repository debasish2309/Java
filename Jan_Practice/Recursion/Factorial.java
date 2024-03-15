package Jan_Practice.Recursion;

public class Factorial {

    public static void main(String[] args) {
        fac(5, 1);
    }

    public static void fac(int num, int count) {
        if(num == 0) {
            System.out.println("the sum" + count);
            return;
        }
        count = num * count;
        fac(num - 1, count);
    }
    
}
