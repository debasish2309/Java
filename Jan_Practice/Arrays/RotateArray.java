package Jan_Practice.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int n = arr.length;
        int d = 2;
        int p = 1;

        while (p <= d) {
            int last = arr[0];
            for(int i = 0 ; i < arr.length - 1 ; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;         
        }
        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
    
}
