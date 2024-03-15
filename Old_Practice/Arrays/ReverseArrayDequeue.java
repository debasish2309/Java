package Old_Practice.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseArrayDequeue {

    int arr[] = {1,2,3,4,5,6,7};

    int d = 2;

    Deque<Integer> deq = new ArrayDeque<Integer>();
    
    for(int i : arr) {
        deq.add(i);
    }

    for (int j = 0; j < d; j++) {
        int temp = deq.remove();
        deq.addLast(temp);
    }

    System.out.println(deq);

    public static void main(String[] args) {
        
    }
    
    
}
