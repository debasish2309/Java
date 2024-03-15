package Jan_Practice.Arrays;

//Rearrange the array such that the even is greater tha in the odd
public class RearrageEvenOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int temp = 0;

        for(int i = 0 ; i < arr.length - 1 ; i += 2) {

            for(int j = 1 ; j < arr.length ; j += 2) {

                if(arr[i] < arr[j] ) {
                    temp = arr[j]; 
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
    
}
