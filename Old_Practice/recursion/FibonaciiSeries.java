package Old_Practice.recursion;

public class FibonaciiSeries {

    public static void printFib(int a , int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c+ " ");
        printFib(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0,b = 1;
        System.out.print(a +  " " + b + " "); // Printing the first
        int n = 7;
        printFib(a, b, n-2);
    }
    
}
