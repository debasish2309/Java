package Java.Sorting;

public class QuickSort {

    public static void quickSort(int arr[], int low,int high) {
        if(low < high) {
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[],int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] inputArr = {48,36,13,52,19,94,21};
        quickSort(inputArr, 0, inputArr.length - 1);

        for(int i = 0 ;i < inputArr.length ;i++) {
            System.out.print(inputArr[i] + " ");
        }

        System.out.println();
    }
    
}
