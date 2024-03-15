package Java.practice_recursion;

import java.util.ArrayList;

public class PalindromePartition2 {

    static boolean CheckPalindrome(String s) {
        int len = s.length();
        len--;
        for(int i = 0 ; i < len; i++) {
            if(s.charAt(i) != s.charAt(len))
                return false;
            len--;
        }
        return true;
    }

    static void printSolution(ArrayList<ArrayList<String>> partition)  {
        for(ArrayList<String> i: partition){
            for(String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    Goes through all indexes and recursively add remaining
    partitions if current string is paindrome
    */ 
    static ArrayList<ArrayList<String>> addString(ArrayList<ArrayList<String>> v,String s, ArrayList<String> temp,int index) {

        int len = s.length();
        String str = "";
        ArrayList<String> current = new ArrayList<>(temp);
        
        if(index == 0) 
            temp.clear();
        
        for(int i = index ; i < len ;++i) {
            str = str + s.charAt(i);

            //cehck weather string is plaindrome or not
            if(CheckPalindrome(str)) {
                temp.add(str);

                if(i + 1 < len) 
                    v = addString(v, s, temp, i + 1);
                else 
                    v.add(temp);
                
                temp = new ArrayList<>(current);
            }
        }
        return v;
    }


    //Genrerate all palindromic partion of  's' and stores the result 'v'
    static void partition(String s, ArrayList<ArrayList<String>> v) {
        //temparary arraylist to store  each palindromic string
        ArrayList<String> temp = new ArrayList<>();

        //calling add string method it adds all the palindromic partitions of v
        v = addString(v,s,temp,0);

        //printing the solution
        printSolution(v);
    }

    public static void main(String[] args) {
        String s = "geeks";
        ArrayList<ArrayList<String>> str = new ArrayList<>();
        partition(s, str);

    }   
    
}
