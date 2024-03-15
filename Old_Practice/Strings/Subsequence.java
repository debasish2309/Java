package Java.Strings;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static List<String> al = new ArrayList<>();

    public static void main(String[] args) {
        
        String str = "abcd";
        findsubsequences(str,"");
        System.out.println(al);
    }  

    private static void findsubsequences(String s, String ans) {

        if(s.length() == 0) {
            al.add(ans);
            return;
        }

        //we add first character to the string
        findsubsequences(s.substring(1), ans + s.charAt(0));

        //Not adding the first character of the string because the concept
        //of the subsequence either character will present or not
        findsubsequences(s.substring(1), ans);

    }
}
