package Jan_Practice.Arrays;

//Find the second largest element 
public class SecongLargest {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            } 
        }
        System.out.println("The second largest element is " + " " + second);
    }
    
}
