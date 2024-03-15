package Old_Practice.Hash;

import java.util.HashSet;

public class Union {

    public static int union(int arr[], int arr1[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++) {
            set.add(arr[i]);
        }

        for(int i = 0 ; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        return set.size();
    }

    public static int intersection(int arr[],int arr1[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0 ; i < arr.length;i++) {
            set.add(arr[i]);
        }

        for(int j = 0; j < arr1.length;j++) {
            if(set.contains(arr1[j])) {
                count++;
                set.remove(arr1[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {7,3,9};
        int arr1[] = {6,3,9,2,9,4};
        System.out.println(union(arr, arr1));
        System.out.println(intersection(arr, arr1));
     }
    
}
