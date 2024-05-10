package Jan_Practice.Hash;

import java.util.*;

//find the unionof two arrays using hash
//arr1[] = {7,3,9}
//arr2[] = {6,3,9,2,9,4}
public class Union {

    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++) {
            set.add(arr2[i]);
        }

        return set.size();
    }

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0 ; i < arr1.length ; i++) {
            set.add(arr1[i]);
        }

        for(int i= 0 ; i < arr2.length ; i++) {
            if(set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        System.out.println(union(arr1,arr2));
        System.out.println(intersection(arr1, arr2));
    }
    
}
