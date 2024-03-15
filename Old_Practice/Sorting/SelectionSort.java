package Java.Sorting;

public class SelectionSort {

    public static void sort(int[] arr) {

        for(int i = 0 ; i < arr.length -1 ; i++) {

            int min_inx = i;
            for(int j = i + 1 ; j < arr.length ; j++) {
                if(arr[j] < arr[min_inx] ) {
                    min_inx = j;
                }
            }

            //swap the elements
            int temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        sort(arr);
        printArray(arr);

    }
    
}
