package Java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class graph_iter_impl {

    LinkedList<Integer>[] adj;

    graph_iter_impl(int v) {
        adj = new LinkedList[v];
        for(int i = 0 ; i < adj.length; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int s, int d) {
        adj[s].add(d);
    }

    private void dfs(int s) {

        Vector<Boolean> visited = new Vector<Boolean>();
        for(int i = 0 ; i < adj.length ;i++) {
            visited.add(false);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while(stack.empty() == false) {
            s = stack.peek();
            stack.pop();
            if(visited.get(s) == false) {
                System.out.print(s + " ");
                visited.set(s, true);
            }
            Iterator<Integer> itr = adj[s].iterator();
            while(itr.hasNext()) {
                int v = itr.next();
                if(!visited.get(v))
                    stack.push(v);
            }
        }

    }

    public static void main(String[] args)
    {
        // Total 5 vertices in graph
        graph_iter_impl g = new graph_iter_impl(5);
         
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
             
        System.out.println("Following is the Depth First Traversal");
        g.dfs(0);
    }
    
}
