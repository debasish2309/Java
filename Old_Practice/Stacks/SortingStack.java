package Java.Stacks;

import java.util.Stack;

//Sort a stack using a temporary stack
public class SortingStack {

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        
        Stack<Integer> tempStack = new Stack<>();
        while(!input.isEmpty()) {
            int temp = input.pop();
            if(!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
     
        // This is the temporary stack
        Stack<Integer> tmpStack=sortStack(input);
        System.out.println("Sorted numbers are:");
     
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
    
}
