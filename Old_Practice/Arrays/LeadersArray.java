package Old_Practice.Arrays;

public class LeadersArray {
    
    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};

        for(int i = 0 ; i < arr.length ; i++) {

            int j;
            for( j = 0 ; j < arr.length ; j++) {
                if(arr[i] <= arr[j])
                    break;
            }
            if(j == arr.length)
                System.out.println( arr[i] + " ");
        }
        
    } 
    
}
