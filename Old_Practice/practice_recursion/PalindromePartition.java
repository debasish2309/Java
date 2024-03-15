package Java.practice_recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    //check if the string is palindrome or not
    public static boolean checkPalindrome(String s, int index, int i) {
        while(index <= i) {
            if(s.charAt(index) != s.charAt(i))
                return false;
            
            index++;
            i--;
        }
        return true;
    }

    public static void TheHelper(List<List<String>> result,List<String> dump,String s, int n,int index) {
        //Base case when the end of the string is reached add possible partition
        if(index == n) {
            result.add(new ArrayList<>(dump));
            return;
        }

        //Main worker function
        for(int i = index; i < n ; i++) {
            if(checkPalindrome(s, index, i)) {
                dump.add(s.substring(index, i+ 1));
                TheHelper(result, dump, s, n, i + 1);
                dump.remove(dump.size() - 1);
            }
        }
    }

    public static List<List<String>> allPalindromePartition(String s) {
        //store all the possible partitions
        List<List<String>> result = new ArrayList<>();
        //Temporary storage
        List<String> dump = new ArrayList<>();
        int n = s.length();
        //call the helper function
        TheHelper(result, dump, s, n, 0);
        return result;
    }

    public static void main(String[] args) {
        String s = "nitin";
        List<List<String>> result = allPalindromePartition(s);
        System.out.println(result);
    }
}