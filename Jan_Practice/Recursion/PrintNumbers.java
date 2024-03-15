package Jan_Practice.Recursion;


public class PrintNumbers {

    public static void main(String[] args) {
       printNumbers(5);
       printNumber(1); 
    }

    //Print numbers from 5 to 1 
    public static void printNumbers(int number) {
        if(number == 0) {
            return;
        }
        System.out.print(number + " ");
        printNumbers(number - 1);
    } 
    
    //print numbers from  1 to 5
    public static void printNumber(int number) {
        if(number == 6) {
            return;
        }
        System.out.print(number + " ");
        printNumber(number + 1);
    }
}
