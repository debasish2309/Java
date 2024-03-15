package Java.Graphs;

import java.util.LinkedList;

public class prac_colorGraph {

    static int WHITE= 0 , GRAY = 1, BLACK = 2;

    static class Graph {
        int V;
        LinkedList<Integer>[] adjList;
        
        Graph(int ver) {
            V = ver;
            adjList = new LinkedList[V];
            for(int i = 0 ; i < adjList.length ; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
    }

    //utility function to add edge
    static void addEdge(Graph g, int u, int v) {
        g.adjList[u].add(v);
    }

    static boolean isCyclic(Graph g) {

        int colors[] = new int[g.V];
        for(int i = 0 ; i < g.V ; i++) {
            colors[i] = WHITE;
        } 

        //Do DFS traversal beginning with all the nodes
        for(int i = 0 ; i < g.V; i++) {
            if(colors[i] == WHITE) {
                if(DiffUtil(g,i,colors) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    //Recursive function to find if there is back edge in DFs subtree rooted with u
    static boolean DiffUtil(Graph g, int u, int[] color) {

        //GRAY: This vertex is being processed (DFS for this vertex is started
        //but not ended(or the vertex in this function call stack))
        color[u] = GRAY;

        for(Integer i : g.adjList[u]) {

            if(color[i] == GRAY) {
                return true;
            }

            if(color[i] == WHITE && DiffUtil(g, i, color) == true) {
                return true;
            }
        }
        color[u] = BLACK;
        return false;


    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        addEdge(g, 0, 1);
        addEdge(g, 0, 2);
        addEdge(g, 1, 2);
        addEdge(g, 2, 0);
        addEdge(g, 2, 3);
        addEdge(g, 3, 3);
        if (isCyclic(g))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
    
}
