package Jan_Practice.Recursion;

//find the first and last occurance of the string
public class Occurance {

    public static void main(String[] args) {
        String s = "abaacdaefaah";
        findOccurance(s,  0,'a');
    }

    public static int first = -1;
    public static int last = -1;

    private static void findOccurance(String s, int index , char chr) {
        if(s.length() - 1 == index) {
            System.out.println(first + " " + last);
            return;
        }
        
        if(s.charAt(index) == chr) {
            if(first == -1) {
                first = index;
            } else {
                last = index;
            }
         }
         findOccurance(s, index + 1, chr);
    }
    
}
