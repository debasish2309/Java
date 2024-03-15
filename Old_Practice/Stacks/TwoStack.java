package Java.Stacks;

public class TwoStack {
    int arr[];
    int size;
    int top1, top2;

    TwoStack(int n) {
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }

    // to push x element into the stack
    void push(int x) {
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        } else {
            System.out.println("Stack overflow" + x);
            return;
        }
    }

    void push2(int x) {
        if(top2 < size - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("stachoverflw by " + x);
        }
    }

    int pop1() {
        if(top1 <= size/2) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.print("Stack UnderFlow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if(top2 >= size/2 + 1) {
            int x = arr[top2];
            top2--;
            return x;
        } else {
            System.out.println("stack overflow");
            System.exit(0);
        }
        return 1;
    }

    

}

class GFG {
 
    /* Driver program to test twoStacks class */
    public static void main(String[] args)
    {
        TwoStack ts = new TwoStack(5);
        ts.push(5);
        ts.push2(10);
        ts.push2(15);
        ts.push(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is "
                         + ": " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is "
                         + ": " + ts.pop2());
    }
}
