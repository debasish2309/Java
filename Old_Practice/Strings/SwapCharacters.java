package Java.Strings;

//Swap characters in a String
public class SwapCharacters {

    String swapCharacters(String s, int c, int b) {
        
        int n = s.length();
        c = c % n;

        if(c == 0 ) {
            return s;
        }

        int f = b / n;
        int r = b % n;

        String p1 = rotateLeft(s.substring(0, c),((n % c) * f) % c);

        String p2 = rotateLeft(s.substring(c), ((c * f) % (n - c)));

        char a[] = (p1 + p2).toCharArray();

        for(int i = 0 ; i  <r ; i++) {
            char temp = a[i];
            a[i] = a[(i + c) % n ];
            a[(i + c) % n] = temp;
        }
        return new String(a);

    }

    String rotateLeft(String s , int p) {
        return s.substring(p) + s.substring(0,p);
    }

    public static void main(String[] args) {
        String s1 = "ABCDEFGHIJK";
        int b = 10;
        int c = 3;

        String s2 = new SwapCharacters().swapCharacters(s1, c, b);
        System.out.println(s2);
    }
    
}
