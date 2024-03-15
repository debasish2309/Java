package Java.Searching;

public class binarySearch {

    static int BinarySearch(int[] arr, int low,int high,int x) {

        if(high >= low) {
            int mid = (low + (high-1)) / 2;

            if(arr[mid] == x) 
                return mid;

            if(arr[mid] > x) 
                return BinarySearch(arr, low, mid - 1, x);

            return BinarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int result = BinarySearch(arr, 0, arr.length - 1, 130);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        
    }
    
}
