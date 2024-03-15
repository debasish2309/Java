package Java.Strings;

//How to insert characters in a string at a certain position?
public class InsertStars {
    

    public static void main(String[] args) {
        String str =  "geeksforgeeks";
        int chars[] = {1,5,7,9};

        String ans = "";
        int j = 0 ;

        for(int i = 0 ; i < str.length(); i++) {
            if(j < chars.length && i == chars[j]) {
                ans += '*';
                j++;
            }
            ans += str.charAt(i);
        }

        System.out.println(ans);
    }
}
