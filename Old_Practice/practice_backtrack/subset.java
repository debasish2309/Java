package Java.practice_backtrack;

import java.util.ArrayList;
import java.util.List;

public class subset {

    public static void findSubset(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
        if(index == nums.size()) {
            subset.add(output);
            return;
        }

        findSubset(subset, nums, new ArrayList<>(output), index + 1);

        output.add(nums.get(index));
        findSubset(subset, nums, new ArrayList<>(output), index+ 1);
    } 
    
    public static void main(String[] args) {
        List<List<Integer>> subset = new ArrayList<>();

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        findSubset(subset, input, new ArrayList<>(), 0);

        for (int i = 0; i < subset.size(); i++) {
            for (int j = 0; j < subset.get(i).size(); j++) {
                System.out.print(subset.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
  
}
