package Jan_Practice.Arrays;

//move all the zeros to the end of the array
public class MoveZeros {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {

            if(arr[i] != 0) {
                arr[count++] = arr[i];
            } 
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }

        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
    
}
