package Java.Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class graph_impl {

    private LinkedList<Integer> adjacency[];

    public graph_impl(int v) {
        adjacency = new LinkedList[v];
        for(int i = 0 ; i < v ;i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertEdge(int s,int d) {
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
        graph_impl impl = new graph_impl(v);
        System.out.println("Insert edges");
        for(int i = 0 ; i < e ; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            impl.insertEdge(s, d);
        }
    }



    
}
