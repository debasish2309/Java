package Old_Practice.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("size of the set :" + set.size());

        if(!set.contains(6)) 
            System.out.println("absent");

        set.remove(1);
        if(!set.contains(1))
            System.out.println("sorry there is no element");

        System.out.println(set);

        set.add(0);
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
    }
    
}
