package Old_Practice.practice_backtrack;

import java.util.ArrayList;
import java.util.List;

//jav program to find all paths in graph
public class AllPaths {

    private int v;

    private ArrayList<Integer> adjList[];

    AllPaths(int vertices) {
        this.v = vertices;
        adjList = new ArrayList[v];
        for(int i = 0 ; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u , int v) {
        adjList[u].add(v);
    }

    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>(); 
        
        //add source to path
        pathList.add(s);

        //call recursively the utilitu function
        printAllPathsUtil(s,d,isVisited,pathList);
    }

    //A recursive function to print all the paths from 'u' to 'd'
    //isVisited[] keep track of vertices in current path
    //localpathlist<> stores actual vertices in the currnet path
    private void printAllPathsUtil(Integer u, Integer d, boolean isVisited[],List<Integer> localpathlist) {
        if(u.equals(d)) {
            System.out.println(localpathlist);
            return;
        }

        isVisited[u] = true;

        //recur for all vertices
        //adjucent to the currnet vertices
        for(Integer i : adjList[u]) {
            if(!isVisited[i]) { 
                localpathlist.add(i);
                printAllPathsUtil(i, d, isVisited, localpathlist);
                localpathlist.remove(i);
            }
        }
        isVisited[u] = false;
    }

    public static void main(String[] args) {
        AllPaths g = new AllPaths(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
        int s = 2;
        int d = 3;
        System.out.println("following are the diff paths from" + s +"to"+ d);
        g.printAllPaths(s, d);
    }

    
}
