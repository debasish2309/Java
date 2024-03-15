package Java.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue1 {

    Queue<Integer> q1 = new LinkedList<>();

    void push(int data,int c) {
        q1.add(data);
        if(c <= 0)
            return;
        c--;
        push(q1.remove(), c);
    }

    void pop() {
        if(q1.isEmpty())
            return;
        q1.remove();
    }

    int top() {
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() {
        return q1.size();
    }

    public static void main(String[] args)
    {
        StackQueue1 s = new StackQueue1();
        s.push(1, s.size()); // Value and current size
        s.push(2, s.size());
        s.push(3, s.size());
 
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
 
        System.out.println("current size: " + s.size());
    }
    
}
