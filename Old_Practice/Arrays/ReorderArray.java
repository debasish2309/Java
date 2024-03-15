package Old_Practice.Arrays;


import java.util.*;
import java.util.TreeMap;

public class ReorderArray {

    public static void main(String[] args) {
        
        int arr[] = {50,40,70,60,90};
        int index[] = {3,0,4,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length ; i++) {
            map.put(index[i], arr[i]);
        }

        TreeMap<Integer, Integer> treemap = new TreeMap<>(map);

        for(Map.Entry<Integer, Integer> entry: treemap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    
}
