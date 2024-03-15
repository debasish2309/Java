package Jan_Practice.Recursion;

public class FibonaciiSeries {
    
    public static void main(String[] args) {
        fibSeries(0, 1, 0);
    }

    public static void fibSeries(int a, int b, int num ) {
        if(num == 10){
            return;
        }
        System.out.print(a + " ");
        fibSeries(b, a + b, num + 1);
    }
}
