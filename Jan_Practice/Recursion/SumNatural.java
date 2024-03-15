package Jan_Practice.Recursion;

//sum of firat n natural numbers
public class SumNatural {

    public static void main(String[] args) {
        sumNatural(10, 0);
    }

    public static void sumNatural(int num,int count) {
        if(num == 0) {
            System.out.println("the sum =" + count );
            return;
        }
        count = num + count ;
        sumNatural(num - 1, count);
    }
    
}
