package Java.practice_backtrack;

//permutation with spaces
public class PlacongSpaces2 {

    //function recursively prints the string having spaces
    //pattern i and j are indices in "StringStr" and 'buf[]' respectively
    static void printPatternUtil(String str,char buf[],int i, int j, int n) {

        if(i == n) {
            buf[j] = '\0';
            System.out.println(buf);
            return;
        }

        //either put the character
        buf[j] = str.charAt(i);
        printPatternUtil(str, buf, i + 1, j + 1, n);

        //or put space followed by next character
        buf[j] = ' ';
        buf[j + 1] = str.charAt(i);

        printPatternUtil(str, buf, i + 1, j + 2, n);
    }

    //function creates buf[]  to store individual output 
    //string and uses printPatternUtil() to print all permutations
    static void printPattern(String str) {
        int len = str.length();

        //Buffer to hold the string containing spaces
        //2n - 1 characters and 1 string terminator
        char[] buf = new char[2 * len];

        //copy he first character as it is,since it will
        //be always in first position
        buf[0] = str.charAt(0);
        printPatternUtil(str,buf,1,1,len);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        printPattern(str);
    }
    
}
