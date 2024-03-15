package Java.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

//directed graph using adjucent list representation
public class transitive_closure {

    //no of vertices in graph
    private int vertices;

    //adjucent list
    private ArrayList<Integer>[] adjList;

    //to store transitive closure
    private int[][] tc;

    public transitive_closure(int vertices) {
        this.vertices = vertices;
        this.tc = new int[this.vertices][this.vertices];

        //initialize adjucency list
        initAdjList();
    }

    //utitlity to initalize the adjucency list
    private void initAdjList() {
        adjList = new ArrayList[vertices];
        for(int i = 0 ; i < vertices ; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    //add edge from u to v
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    //function to find transitive closure.It uses recursive DFSUtil
    public void transitiveClosure() {
        //Call the recursive helper function to print DFS traversal starting from 
        //all vertices one by one
        for(int i = 0 ; i < vertices; i++) {
            dfsUtil(i,i);
        }
        for(int i = 0 ; i < vertices; i++) {
            System.out.println(Arrays.toString(tc[i]));
        }
    }

    //A recursive DFS traversal function that finds all reachable
    //vertices for s
    private void dfsUtil(int s, int v) {
        //Mark reachablity from s to v as true
        if(s == v) {
            tc[s][v] = 1;
        } else {
            tc[s][v] = 1;
        }

        //find all vertices reashable through v
        for(int adj : adjList[v]) {
            if(tc[s][adj] == 0) {
                dfsUtil(s, adj);
            }
        }
    }

    public static void main(String[] args) {
        transitive_closure g = new transitive_closure(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Transitive closure " +
                "matrix is");
 
        g.transitiveClosure();
    }
    
}
