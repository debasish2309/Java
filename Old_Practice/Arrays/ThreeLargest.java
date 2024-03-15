package Java.Arrays;
//space complexity O[1] timecomplexity O[n]
public class ThreeLargest {

    public static void main(String[] args) {
       int arr[] = {10,4,3, 50,23,90};
       int n = arr.length;
       Pritn3Largest(arr, n);   
    }

    static void Pritn3Largest(int arr[], int arr_size) {
        int i, first, second,third;

        if(arr_size < 3) {
    
            System.out.println("invalid input");
            return;
        }

        third = second = first = Integer.MIN_VALUE;

        for( i = 0 ; i < arr_size; i++) {
            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if(arr[i] > second){
                third = second;
                second = arr[i];
            } else if(arr[i] > third) {
                third = arr[i];
            }

            
        }
        System.out.print("the three elements are " +  first + ""+second + third);
    }
    
}
