package Old_Practice.Arrays;

public class MovingZerosEnd {

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZeros(arr);
    }

    public static void moveZeros(int arr[]) {

        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while(count < n)
             arr[count++] = 0;

        for (int i : arr) {
            System.out.println(i);
        }

    }
    
}
