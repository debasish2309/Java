package Java.Strings;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        
    String str = "geeksforgeeks";

    char[] ch = str.toCharArray();

    Stack<Character> stack = new Stack<>();

    for(int i = 0; i < ch.length ; i++) {
        stack.push(ch[i]);
    }

    for(int i = 0 ; i < ch.length ; i++) {
        ch[i] = stack.peek();
        stack.pop();      
    }

    System.out.println(String.valueOf(ch));

    } 
}
