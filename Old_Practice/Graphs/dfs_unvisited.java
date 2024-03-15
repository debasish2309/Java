package Java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class dfs_unvisited {

    private LinkedList<Integer> adj[];

    dfs_unvisited(int v) {
        adj = new LinkedList[v];
        for(int i = 0 ; i < v ; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    private void addEdge(int s, int d) {
        adj[s].add(d);
    }

    private void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()) {
            int n = i.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }

    private void dfs(int v) {
        boolean visited[] = new boolean[v];
        for(int i = 0 ; i < v ;i++) {
            if(visited[i] == false) 
                DFSUtil(i,visited);
        }
    }
    

    public static void main(String[] args) {
        dfs_unvisited g = new dfs_unvisited(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(
            "Following is Depth First Traversal");
        g.dfs(4);
    }
}
