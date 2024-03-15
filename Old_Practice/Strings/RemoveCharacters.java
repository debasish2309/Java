package Java.Strings;

public class RemoveCharacters {

    public static void main(String[] args) {
        
        String s = "geeksforgeeks";
        char[] c = s.toCharArray();
        String newString = "";

        for(int  i = 0 ; i < c.length ; i++) {
            if(c[i] == 'g') {
                continue;
            } else {
                newString += c[i];
            }
        } 
        System.out.println(newString);
    }
    
}
