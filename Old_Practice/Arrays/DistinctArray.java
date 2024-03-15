package Old_Practice.Arrays;

//to find the largest thress distinct elements in java
public class DistinctArray {

    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 50, 23, 90};
        int first,second,third;

        first = second = third = Integer.MIN_VALUE;

        if(arr.length < 3)
            return;

        for(int i = 0 ; i < arr.length ; i++) {
              if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
              } else if (arr[i] > second) {
                third = second;
                second = arr[i];
              } else if(arr[i] > third) {
                third = arr[i];
              }         
        }
        System.out.println( first + " "+ second + " "+ third);
    }
    
}
