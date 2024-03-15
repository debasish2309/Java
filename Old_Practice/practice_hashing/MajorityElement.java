package Java.practice_hashing;

import java.util.HashMap;

public class MajorityElement {

    public static void Majority(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i < arr.length ; i++) {
            if(map.containsKey(arr[i])) 
                map.put(arr[i], map.get(arr[i]) + 1);
             else 
                map.put(arr[i], 1);     
        }
        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) {
        int nums[] = {1 ,3 ,2 ,5 ,1 ,3 ,1 ,5 , 1};
        Majority(nums);
    }
  
}
