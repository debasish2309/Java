package Java.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjMatrix {

   // Scanner sc = new Scanner(System.in);

    //n is the no of vertices
    //m is the no of edges
    // int n = sc.nextInt();
    // int m = sc.nextInt();

    // int[][] adjmat = new int[n + 1][n + 1];
    // for(int i = 0 ; i < m ; i++) {
    //     int u = sc.nextInt();
    //     int v = sc.nextInt();
    //     adjmat[u][v] = 1;
    //     adjmat[u][v] = 1;
    // }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for(int i = 0 ; i < adj.size() ; i++) {
            System.out.println("\n Adjucent list of matrix" + i);
            System.out.println("head");
            for(int j = 0 ; j < adj.get(i).size() ; j++) {
                System.out.print( "->" + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        //Creating a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0 ; i < V; i++)
             adj.add(new ArrayList<Integer>());

        //Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }
    
}
