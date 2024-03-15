package Jan_Practice.Recursion;

//Move all the x to the end of the string
public class Movex {
    
    public static void main(String[] args) {
        
        String str = "abcdefxghxixjxxxk";
        moveX(str, 0);
    }
    private static int count = 0;
    private static String newstr = "";
    
    private static void moveX(String str, int idx) {
        if(idx == str.length() - 1) {
            while (count < str.length() - 1) {
                newstr = newstr + 'x';
                count++;
            }
            System.out.println(newstr);
            return;
        }
        
        if(str.charAt(idx) == 'x') {
            count++;
            moveX(str, idx + 1);
        } else {
            newstr = newstr + str.charAt(idx);
            moveX(str, idx + 1);
        }
        
    }
    
}
