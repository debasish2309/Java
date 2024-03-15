package Java.Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class prac_detectCycleDirected {

    private int V = 5;
    LinkedList<Integer> adjucent[];
    private final List<Integer> adj;

    prac_detectCycleDirected(int v) {
        v = V;
        adj = new ArrayList<>(V);
        adjucent = new LinkedList[v];
        for( int i = 0 ; i < adjucent.length ;i++) {
            adjucent[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int src, int dest) {
        adjucent[src].add(dest);
    }

    public void search(int source) {
        for(int i = 0 ; i < adjucent[source].size() ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        prac_detectCycleDirected cycle = new prac_detectCycleDirected(4);
        cycle.insertEdge(0,2);
        cycle.insertEdge(1, 0);
        cycle.insertEdge(2, 3);
        cycle.insertEdge(3, 0);
        cycle.search(3);
    }
}
