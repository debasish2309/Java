package Jan_Practice.Arrays;

public class RotateReverse {

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        int temp = 0;

        for(int i = 0, j= arr.length - 1 ; i < arr.length/2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;           
        }
        for(int k : arr) {
            System.out.print( k + " ");
        }
        int d = 2;
        int p = 1;
        int last = arr.length;
        

        while (p <= d) { 
            last = arr[0];
            for(int i = 0 ; i < arr.length - 1 ; i++) {
                arr[i] = arr[i+ 1];
            }
            arr[arr.length - 1] = last;
            p++;
        }
        System.out.println();
        for(int k : arr) {
            System.out.print( k + " ");
        }
    }   
}
