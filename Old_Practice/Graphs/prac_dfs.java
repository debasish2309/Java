package Java.Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class prac_dfs {

    private LinkedList<Integer> adjucent[];

    public prac_dfs(int v) {
        adjucent = new LinkedList[v];
        for(int i = 0 ; i < v ; i++) {
            adjucent[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source,int dest) {
        
        adjucent[source].add(dest);
        adjucent[dest].add(source);
    }

    public void dfs(int source) {
        boolean visited_nodes[] = new boolean[5];
        int parent_nodes[] = new int[5];
        Stack<Integer> stack = new Stack<>();
        stack.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;
        while(!stack.isEmpty()) {
            int p = stack.pop();
            System.out.print(p);
            for(int i : adjucent[p]) {
                if(visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    stack.add(i);
                    parent_nodes[i] = p;
                }
            }

        }

        System.out.println();
        for(int i = 0 ; i < parent_nodes.length ; i++) {
            System.out.print(parent_nodes[i]);

        }
    }

    public static void main(String[] args) {
        prac_dfs dfs = new prac_dfs(5);
        dfs.insertEdge(0, 1);
        dfs.insertEdge(1, 2);
        dfs.insertEdge(2, 3);
        dfs.insertEdge(3, 0);
        dfs.insertEdge(3, 4);
        dfs.insertEdge(0, 4);
        dfs.dfs(2);
    }
    
}
