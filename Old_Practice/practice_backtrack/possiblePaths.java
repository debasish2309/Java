package Java.practice_backtrack;

import java.security.cert.PolicyQualifierInfo;
import java.util.Iterator;
import java.util.LinkedList;

// find all possible paths in directed graph with no cycles
public class possiblePaths {

    private int V;

    private LinkedList<Integer> adj[];

    possiblePaths(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0 ; i < v ; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int start,int dest) {
        adj[start].add(dest);
    }

    int countPathUtil(int source, int dest, int pathCount) {
        if(source == dest) {
            pathCount++;
        } else {
            Iterator<Integer> i = adj[source].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                pathCount = countPathUtil(n, dest, pathCount);
            }
        }
        return pathCount;
    }

    int countPaths(int source, int dest) {

        int pathCount = 0;
        pathCount = countPathUtil(source,dest,pathCount);
        return pathCount;
    }

    public static void main(String[] args) {
        possiblePaths paths = new possiblePaths(5);
        paths.addEdge(0,1);
        paths.addEdge(0, 2);
        paths.addEdge(0, 3);
        paths.addEdge(1, 3);
        paths.addEdge(2, 3);
        paths.addEdge(1, 4);
        paths.addEdge(2, 4);

        int s = 0, d = 3;
        System.out.println(paths.countPaths(s,d));
    }
    
}
