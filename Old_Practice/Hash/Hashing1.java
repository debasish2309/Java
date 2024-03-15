package Old_Practice.Hash;

import java.util.HashMap;
import java.util.*;

public class Hashing1 {

    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();

        map.put("India", 1200);
        map.put("US",30);
        map.put("China", 150);

        System.out.println(map);

        map.remove("China");
        System.out.println(map);

        if(map.containsKey("Indonesia"))
            System.out.println("Key is prsent");
        else
            System.out.println("Key is not present");

        System.out.println(map.get("china"));
        System.out.println(map.get("Indonesia"));

        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ "" + map.get(key));
        }
    }
    
}
