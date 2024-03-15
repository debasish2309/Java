package Old_Practice.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++) {

            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second) {
                second = arr[i];
            }  else { }     
        }
        System.out.println(second);
    }
    
}
