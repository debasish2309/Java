package Old_Practice.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArray {

    public static void fixArray(int arr[]) {

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] != i) {
                arr[i] = -1;
            } 
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        fixArray(array);
    }
}