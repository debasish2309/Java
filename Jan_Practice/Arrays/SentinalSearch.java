package Jan_Practice.Arrays;

class SentinalSearch {

    static void sentinalSearch(int arr[],int n, int key) {

        //last element of the array
        int last = arr[n-1];

        //Elemt to besearched is places in the last
        arr[n - 1] = key;
        int i = 0;

        while (arr[i] != key) {
            i++;
        }

        //Put the last element back
        arr[n - 1] = last;

        if((i < n - 1) || (arr[n - 1] == key))
            System.out.println(key + " Present in " + i);
        else
            System.out.println("Element not present");
    }
    public static void main(String[] args) {
        
        int arr[] = {10,20,150,180,360,50,60,110,100,70};
        int n = arr.length;
        int key = 180;
        sentinalSearch(arr, n, key);
    }
}