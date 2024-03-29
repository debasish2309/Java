package Old_Practice.Arrays;

public class SubArrayRec {

    static void printSub(int arr[],int start,int end) {
        if(end == arr.length)
            return;
        else if(start > end)
            printSub(arr, 0,end + 1);
        else {
            System.out.print("[");
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printSub(arr, start + 1, end);
        }
        return;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        printSub(arr,0,0);
    }
    
}
