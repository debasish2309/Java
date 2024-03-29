package Java.practice_backtrack;

import java.util.ArrayList;

//find all the subsets of a given set any repeated subset will be considered only once
public class DistinctiveSubset {

    static void printPowerSet(int[] set,int set_size) {
        ArrayList<String> subset = new ArrayList<>();

        /*set the power of set with set_size n is (2**n - 1) */
        long pow_set_size = (long)Math.pow(2, set_size);
        int counter,j;

        /*Run from counter 000..00 to 111..1 */
        for(counter = 0 ; counter < pow_set_size ; counter++) {
            String temp = "";
            for (j = 0; j < set_size; j++) {
            /*Check if jth bit in the counter is set then
             * if set then print jth element fron set
             */
                if((counter & (1 << j)) > 0)
                    temp += (Integer.toString(set[j], '$'));
            }

            if(!subset.contains(temp) && temp.length() > 0) {
                subset.add(temp);
            }        
        }

        for(String s : subset) {
            s = s.replace('$', ' ');
            System.out.println(s);
        }        
    }

    public static void main(String[] args)
    {
        int[] set = { 10, 12, 12 };
        printPowerSet(set, 3);
    }    
}
