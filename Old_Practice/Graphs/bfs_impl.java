package Java.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bfs_impl {

    private LinkedList<Integer> adjucent[];

    public bfs_impl(int v) {
        adjucent = new LinkedList[v];
        for(int i = 0 ; i < v ; i++) {
            adjucent[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int d, int s) {
        adjucent[s].add(d);
        adjucent[d].add(s);

        System.out.print(adjucent[d]);
        System.out.print(adjucent[s]);
    }

    public void bfs(int source) {
        boolean visited_nodes[] = new boolean[adjucent.length];
        int parent_nodes[] = new int[adjucent.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;
        while(!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p);
            for(int i : adjucent[p]) {
                if(visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
    }

    public void dfs(int source) {
        boolean visited_nodes[] = new boolean[adjucent.length];
        int parent_nodes[] = new int[adjucent.length];
        Stack<Integer> s = new Stack<>();
        s.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;
        while(!s.isEmpty()) {
            int p = s.pop();
            System.out.print(p);
            for(int  i : adjucent[p]) {
                if(visited_nodes[i] != true) {
                    visited_nodes[i] = true;
                    s.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        bfs_impl impl = new bfs_impl(v);
        System.out.println("Insert Edges");
        for(int i = 0 ; i < e ; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            impl.insertEdge(d, s);
        } 
        System.out.println("Enter souece for bfs traversal");
        int source = sc.nextInt();
        impl.bfs(source); 
        impl.dfs(source);      
    }    
}
