package Java.Strings;
//Print the frequency of each character in Alphabetical order

import java.util.HashMap;
import java.util.Map;

public class PrintFregquency {

    public static void main(String[] args) {
        
        String str = "geeksforgeeks";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey()+ ""+ entry.getValue());
        }

    }

    
}
