package Old_Practice.Arrays;

import java.util.*;

public class DistinctElements {

    public static void main(String[] args) {
        
        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++) {

            while(i < (arr.length - 1) &&  arr[i] == arr[i + 1])
                i++;

            System.out.print(arr[i] + " ");
        }
    }
    
}
