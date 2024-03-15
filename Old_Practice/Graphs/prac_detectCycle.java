package Java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class prac_detectCycle {

    static int V = 5;
    private LinkedList<Integer> adjucent[];

    public prac_detectCycle(int v) {
        adjucent = new LinkedList[v];
        for(int i = 0 ; i < adjucent.length ; i++) {
            adjucent[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source, int dest) {
        adjucent[source].add(dest);
        adjucent[dest].add(source);
    }

    private boolean DetectCycle(){
        boolean visited_nodes[] = new boolean[V];
        for(int i = 0 ; i < V ; i++) {
            visited_nodes[i] = false;
        }
        
        for(int i = 0 ;i < V ;i++) {           
            if(!visited_nodes[i])
                if(isCyclicUtil(i, visited_nodes, -1))
                    return true;
        }
        return false;
    }
    
    private boolean isCyclicUtil(int v, boolean visited[],int parent) {
        visited[v] = true;
        Integer i;


        Iterator<Integer> it = adjucent[v].iterator();
        while(it.hasNext()) {
            i = it.next();

            if(!visited[i]) {
                if(isCyclicUtil(i, visited,v))
                    return true;
            }

            else if(i != parent) 
                return true;
        System.out.println(i +" " + parent);

        }
        return false;
    }

    public static void main(String[] args) {
        prac_detectCycle dfs = new prac_detectCycle(V);
        dfs.insertEdge(1, 0);
        dfs.insertEdge(1, 2);
        dfs.insertEdge(2, 0);
        dfs.insertEdge(0, 3);
        dfs.insertEdge(3, 4);
        if(dfs.DetectCycle()) 
            System.out.println("Graph contains cycle");
        else 
            System.out.println("Graph doesnot contains cycle");
    }
    
}
