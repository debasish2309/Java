package Java.Searching;

public class InterpolationSearch {

    static int interpolationSearch(int arr[],int low,int high, int x) {

        int pos;

        if(low <= high && x >= arr[low] && x <= arr[high]) {
            pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            if(arr[pos] == x)
                return pos;
            
            if(arr[pos] <= x)
                return interpolationSearch(arr, pos + 1, high, x);

            if(arr[pos] > x)
                return interpolationSearch(arr, low, pos - 1, x);
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47 };
        int index = interpolationSearch(arr, 0, arr.length - 1, 18);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
        
    }
    
}
