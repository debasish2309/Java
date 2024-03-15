package Java.Stacks;

import java.util.Queue;
import java.util.Stack;

public class QueueImpl {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enQueue(int x) {

        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    static int deQueue() {
        if(stack1.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        int x = stack1.peek();
        stack1.pop();
        return x;
    }

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }
    
}
