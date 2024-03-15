package Java.Strings;

public class ReverseString1 {

    public static void main(String[] args) {
        
        String str = "geeksgorgeeks";
        int length = str.length();
        StringBuffer buffer = new StringBuffer();
        for(int i = length - 1 ; i > 0  ; i--) {
            buffer.append(str.charAt(i));
        }
        System.out.println(buffer);
    }
    
}
