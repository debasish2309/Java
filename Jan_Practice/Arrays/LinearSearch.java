package Jan_Practice.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 12, 23, 43, 54, 67, 98 };
        int key = 154;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
        }
        }
        System.out.println("Element not found");
    }
}
