package Java.Stacks;

import java.util.Stack;

//to 
public class ValidParanthesis {

    static void validParenthesis(Stack<String> stack) {

        Stack<String> stack1 = new Stack<>();

        while(!stack.isEmpty()) {
            if(stack1.isEmpty()) {
                stack1.push(stack.pop());
            }

            if(stack1.peek() == "{") {
                if(stack.peek() == "}") {
                    stack1.pop();
                    stack.pop();
                } else {
                    stack1.push(stack.pop());
                }
            }

            if(stack1.peek() == "[") {
                if(stack.peek() == "]") {
                    stack1.pop();
                    stack.pop();
                } else {
                    stack1.push(stack.pop());
                }
            }

            if(stack1.peek() == "(") {
                if(stack.peek() == ")") {
                    stack1.pop();
                    stack.pop();
                } else {
                    stack1.push(stack.pop());
                }
            }
        }

        if(stack1.isEmpty()) {
            System.out.println("Stack is empty");
        }

        while(!stack1.empty()) {
            System.out.println("stack is not empty");
        }
 
    }

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        stack.push("{");
        stack.push("}");
        stack.push("[");
        stack.push("(");
        stack.push("]");
        stack.push(")");

        validParenthesis(stack);


    }
    
}
