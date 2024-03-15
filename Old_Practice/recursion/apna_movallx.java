package Java.recursion;

//time complexity O(N)
public class apna_movallx {

    public static void moveallx(String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i = 0; i < count ; i++) {
                newString += 'x';
             }
                System.out.println(newString);
                return;
        }
        
        char currentChar = str.charAt(idx);
        if(currentChar == 'x') {
            count++;
            moveallx(str, idx + 1, count, newString);
        } else {
            newString += currentChar;
            moveallx(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {

        String str = "axbcxxd";
        moveallx(str, 0, 0, "");
        
    }
    
}
