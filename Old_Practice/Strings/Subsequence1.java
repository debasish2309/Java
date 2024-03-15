package Java.Strings;

import java.util.HashSet;

public class Subsequence1 {

    static HashSet<String> st = new HashSet<>();

    static void subsequence(String str) {

        //Iterate over the entire string
        for(int i = 0 ; i < str.length() ; i++) {

            //Iterate from the end of the string to generate substring
            for(int j = str.length() ; j > i ; j--) {
                String sub_string = str.substring(i, j);

                if(!st.contains(sub_string))
                    st.add(sub_string);

                //Drop the kth character in the string
                //and if not in the set then recur
                 for(int k = 1; k < sub_string.length() - 1; k++) {
                     StringBuffer sb = new StringBuffer(sub_string);
                     sb.deleteCharAt(k);
                     if(!st.contains(sb))
                         subsequence(sb.toString());
                 }

            }

        }

    }

    public static void main(String[] args) {
        
        String s = "abcd";
        subsequence(s);
        System.out.println(st);
    }
    
}
