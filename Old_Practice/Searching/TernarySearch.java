package Java.Searching;

import javax.lang.model.util.ElementScanner6;

public class TernarySearch {

    static int ternarySearch(int low,int high,int key, int arr[]) {

        if(high >= low) {

            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if(arr[mid1] == key) 
                return mid1;

            if(arr[mid2] == key)
                return mid2;

            if(key < arr[mid1])
                return  ternarySearch(low, mid1 - 1, key, arr);
            else if(key > arr[mid2])
                return ternarySearch(mid2 + 1, high, key, arr);
            else 
                return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int search = ternarySearch(0, arr.length - 1, 6, arr);

        if(search == -1)
            System.out.println("Not found");
        else
            System.out.println("found  at" + search);

    }
    
}
