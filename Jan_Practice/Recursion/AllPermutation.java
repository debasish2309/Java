package Jan_Practice.Recursion;

//print all the permutations of the string
// "abc" -> abc,acb,bac,bca,cab,cba
public class AllPermutation {

    public static void printPermutations(String str, String perm) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newString, perm + currentChar);
        }
    }

    public static void main(String[] args) {
        printPermutations("abc", "");
    }   
}
