package Jan_Practice.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 23, 1, 90, -56 };
        int temp = 0;
        int j;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        for(int  k : arr){
            System.out.print(k + " ");
        }
    
    }
}
