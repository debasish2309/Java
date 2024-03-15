package Jan_Practice.Arrays;

//Segregate even and odd numbers using Lomuto’s Partition Scheme
public class SegregareOddEven {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int i = -1;
        int j = 0;
        int  n = arr.length;
        while (j != n) {
            if(arr[j] % 2 == 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
            }
            j++;
            
        }

        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
    
}
