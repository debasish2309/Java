package Jan_Practice.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 23, 67, 10, 5};
        int temp = 0;
        for(int i = 0; i < arr.length ; i++) {

            for(int j = 0 ; j < arr.length - 1 ; j++) {
                if(arr[j] > arr[j+ 1]) {
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        for(int i = 0 ; i < arr.length  ; i++ ) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
