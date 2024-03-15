package Old_Practice.Arrays;

import java.util.Arrays;
//Rearrange an array in maximum minimum form using Two Pointer Technique
public class RearrangeArray1 {

    static void Rearrange(int[] arr,int n) {
        int temp[] = arr.clone();
        int small = 0, large = n-1;

        boolean flag = true;

        for(int i = 0 ; i < n; i++) {
            if(flag)
                arr[i] = temp[large--];
            else 
                arr[i] = temp[small++];
                flag = !flag;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
        Rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
