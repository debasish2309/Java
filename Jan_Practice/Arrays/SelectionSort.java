package Jan_Practice.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = new int[] { 9, 5, 6, 8, 3 };
        int min;
        int temp = 0;
        System.out.println("Given Array");

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print("Sorted array: ");
        for (int i = 0 ; i < arr.length ; i++) { 
            System.out.print(arr[i] + " ");  
        }
    }

}
