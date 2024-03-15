package Java.Stacks;

import java.util.Stack;

//Remove all adjucent duplicates in string 
//Removing consecutive duplicates
public class AdjucentDuplicate {

    static void AdjucentDuplicates(Stack<String> stack) {

        Stack<String> stack2 = new Stack<>();
        
        while(!stack.isEmpty()) {
            if(stack2.isEmpty()) {
                stack2.push(stack.pop());
            } else if(stack2.peek() == stack.peek()) {
                stack2.pop();
                stack.pop();
            } else {
                stack2.push(stack.pop());
            }
        }

        while(!stack2.isEmpty() ) {
            System.out.println(stack2.pop());
        }

    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("b");
        stack.push("a");
        stack.push("c");
        stack.push("a");

        AdjucentDuplicates(stack);
    }
    
}
