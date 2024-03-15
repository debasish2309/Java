package Java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Kosaraju_algo {

    private int V;
    private LinkedList<Integer> adj[];

    Kosaraju_algo(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0 ; i < v;i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //function to edd edge
    void addEdge(int s,int d) {
        adj[s].add(d);
    }

    void DFSUtil(int v, boolean visited[]) {

        //Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        int n;

        //Recur for all the vertices adjucent to this vertex
        Iterator<Integer> i = adj[v].iterator();
        while(i.hasNext()) {
            n = i.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }

    
}
