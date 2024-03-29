package Java.Graphs;

import java.util.ArrayList;

public class TransposeGraph {

    //Total number of vertices
    private static int vertices = 5;

    //Find transpose of graph represented by adj
    private static ArrayList<Integer>[] adj = new ArrayList[vertices];

    //Store the transpose of graph represented by tr
    private static ArrayList<Integer>[] tr = new ArrayList[vertices];
    
    public static void addedge(int u,int v, boolean choice) {
        if(!choice)
            adj[u].add(v);
        else
            tr[u].add(v);
    }

    public static void printGraph() {
        for(int i = 0 ; i < vertices; i++) {
            System.out.println(i + "->" );
            for(int j = 0 ; j < tr[i].size() ;j++) 
                System.out.print(tr[i].get(j) + " ");
            System.out.println();
        }
    }

    public static void getTranspose() {
        for(int i = 0 ; i < vertices; i++) {
            for(int j = 0 ; j < adj[i].size(); j++)
                addedge(adj[i].get(j), i, true);
        }
    }

    public static void main(String[] args) throws Exception {
        for(int i = 0 ; i < vertices; i++) {
            adj[i] = new ArrayList<Integer>();
            tr[i] = new ArrayList<Integer>();
        }
        addedge(0, 1, false);
        addedge(0, 4, false);
        addedge(0, 3, false);
        addedge(2, 0, false);
        addedge(3, 2, false);
        addedge(4, 1, false);
        addedge(4, 3, false);

        getTranspose();
        printGraph();
    }
    
}
