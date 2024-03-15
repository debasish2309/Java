package Old_Practice.Arrays;

public class PositionedArray {

    public static void main(String[] args) {
        
        int arr[] = {1,3,2,2,5};

        
        for(int i = 1 ; i < arr.length ; i++) {

            if(i % 2 == 0) {
                if(arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp; 
                }
            } else {
                if(arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
