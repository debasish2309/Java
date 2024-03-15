package Jan_Practice.Arrays;

public class LargeSmall {

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int[] temp = arr.clone();

        int large = temp.length - 1;
        int small = 0;

        boolean flag = true;

        for(int i = 0 ; i < arr.length ; i++) {
            if(flag) {
                arr[i] = temp[large--];
            } else {
                arr[i] = temp[small++];
            }
            flag = !flag;

        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
