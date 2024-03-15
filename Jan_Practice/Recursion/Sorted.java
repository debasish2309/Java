package Jan_Practice.Recursion;

//Check  if the numbers are strictly increasing
public class Sorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        if(strictlyIncreasing(0,arr)) {
            System.out.println("this is strictly increasing");
        } else {
            System.out.println("this is not stricly increasing");
        }   
    }

    private static boolean strictlyIncreasing(int idx, int[] arr) {

        if(idx == arr.length - 1){
            return true;
        }

        if(arr[idx] < arr[idx + 1]) {
           return strictlyIncreasing(idx + 1, arr);
        } else {
            return false;
        }
    }    
}
