package Java.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {

    static Queue<Integer> queue1 = new LinkedList<Integer>();

    static Queue<Integer> queue2 = new LinkedList<>();

    static void push(int x){
       
        while(!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        queue1.add(x);

        while(!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    static int pop(){
        int x = queue1.peek();
        queue1.remove();
        return x;
    }

    public static void main(String[] args) {
        push(4);
        push(3);
        push(2);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());

        push(5);
        System.out.println(pop());
    }  
}
