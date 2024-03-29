package Old_Practice.Hash;

import java.util.HashMap;

public class Itenary {

    public static String getStart(HashMap<String,String> tick) {
        HashMap<String, String> revMAp = new HashMap<>();

        for(String key : tick.keySet()) {
            revMAp.put(tick.get(key), key);
        }

        for(String key : tick.keySet()) {
            if(!revMAp.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Benguluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
    
}
