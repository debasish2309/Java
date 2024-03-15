package Old_Practice.Arrays;

import java.util.Arrays;

public class ReorderArray2 {

    static int arr[] = new int[]{50, 40, 70, 60, 90};
    static int index[] = new int[]{3,  0,  4,  1,  2};

    static void reorder() {
        for(int i = 0 ; i < arr.length ; i++) {

            while(index[i] != i) {

                int oldTargetI = index[index[i]];
                int oldTargetE = arr[index[i]];

                arr[index[i]] = arr[i];
                index[index[i]] = index[i];

                index[i] = oldTargetI;
                arr[i] = oldTargetE;
            }
        }
    }

    public static void main(String[] args) {
        reorder();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));    
    }  
}
