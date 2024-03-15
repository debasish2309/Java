package Old_Practice.Arrays;

public class SegregateArray {

    public static void segregate(int arr[]) {
        int index = 0;
        int ar[] = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                ar[index] = arr[i];
                index++;
            }
        }

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                ar[index] = arr[i];
                index++;
            }
        }

        for(int i = 0 ; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        segregate(arr);
    }
    
}
