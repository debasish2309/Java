package Java.practice_backtrack;

import java.util.ArrayList;

//Print all possible strings that can be made by placing spaces
public class PlacingSpaces {

    private static ArrayList<String> spaceString(String str) {

        ArrayList<String> strs = new ArrayList<String>();
        
        //Check if str.length() is 1
        if(str.length() == 1) {
            strs.add(str);
            return strs;
        }

        ArrayList<String> strsTemp = spaceString(str.substring(1,str.length()));

        //iterate over strsTemp
        for(int i = 0 ; i < strsTemp.size();i++) {
            strs.add(str.charAt(0) + strsTemp.get(i));
            strs.add(str.charAt(0) +  " " + strsTemp.get(i) );
        }
        return strs;
    }

    public static void main(String[] args) {
        ArrayList<String> patterns = new ArrayList<>();
        patterns = spaceString("ABCD");

        for(String s: patterns) 
            System.out.println(s);
    }
    
}
