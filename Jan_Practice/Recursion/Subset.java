package Jan_Practice.Recursion;

import java.util.ArrayList;

//print all subsets of a set of first n natural numbers
public class Subset {

    public static void printSubset(ArrayList<Integer> subset) {
        for(int i = 0 ; i < subset.size() ; i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println("");
    }

    public static void findSubsets(int n , ArrayList<Integer> subset) {
        if(n == 0) {
            printSubset(subset);
            return;
        }

        //add items
        subset.add(n);
        findSubsets(n - 1, subset);

        //will not add
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        findSubsets(3, new ArrayList<Integer>());
    }
    
}
