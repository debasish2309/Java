package Jan_Practice.Recursion;

import java.util.HashSet;

//Print all the sub sequence of string order will also be followed for the sequence
// abc ab ac a bc b c
public class SubSequence {

    public static void subSeq(String str, int idx, String newStr, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // to ne
        subSeq(str, idx + 1, newStr + currChar, set);

        // not to be
        subSeq(str, idx + 1, newStr, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subSeq("abc", 0, "",set);
    }

}
