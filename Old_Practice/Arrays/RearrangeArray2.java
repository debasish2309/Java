package Old_Practice.Arrays;

import java.util.ArrayList;

public class RearrangeArray2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0, j = arr.length - 1 ; i < arr.length/2  ; i++, j--) {
            arrayList.add(arr[j]);
            arrayList.add(arr[i]);
        }

        for(int i = 0 ; i < arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
    
}
