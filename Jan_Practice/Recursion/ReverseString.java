package Jan_Practice.Recursion;

//Reverse the string
public class ReverseString {
    
    public static void main(String[] args) {
        String s = "abcdefg";
        int len = s.length() - 1;
        stringRev(s,len);
    }

    private static void stringRev(String s, int len) {
        if(len == 0){
            return;
        }
        System.out.print(s.charAt(len));
        stringRev(s, len - 1);

    }
}
