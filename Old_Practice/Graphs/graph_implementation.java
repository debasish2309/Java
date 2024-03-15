package Java.Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class graph_implementation {

    private LinkedList<Integer> adjacency[];
    public graph_implementation(int v) {
        adjacency = new LinkedList[v];
        for(int i = 0 ; i < v;i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }
    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);

        System.out.print(adjacency[d]);
        System.out.print(adjacency[s]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        graph_implementation g = new graph_implementation(v);
        System.out.println("enter edges");
        for(int i = 0 ; i < e;i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);
        }
    }
    
}
