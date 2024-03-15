package Jan_Practice.Arrays;

//To find the largest three distinct elements 
public class LargestDistinct {

    public static void main(String[] args) {
        int arr[] = new int[]{10, 4, 3, 50, 23, 90};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third =Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++) {
            
            if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first ) {
                third = second;
                second = arr[i];
            }else if(arr[i] > third && arr[i] != first && arr[i] !=second){
                third = arr[i];
            }
        }
         System.out.println("The three largest numbers are " +first+ " "+second+" "+third);
        }
    }
    

