package Jan_Practice.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[5].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    //TIme complexity O(V+E)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    //Time Complexity O(V^V)
    public static void printAllPaths(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar) {
        if(curr == tar){
            System.out.println(path);
            return;
        }

        for(int i = 0 ; i < graph[curr].size() ; i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                vis[curr] = true;
                printAllPaths(graph,vis,e.dest,path + e.dest,tar);
                vis[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        /*
         * 1---3
         * / |\
         * 0 | 5 ---6
         * \ |/
         * 2---4
         */

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        /*
         * boolean vis[] = new boolean[V];
         * for (int i = 0; i < V; i++) {
         * if (vis[i] == false) {
         * // bfs(graph, V, vis, i);
         * dfs(graph, 0, vis);
         * }
         * }
         * System.out.println();
         * // dfs(graph, 0, vis);
         * // bfs(graph, V);
         * System.out.println();
         */
        int src = 0,tar = 5;
        printAllPaths(graph, new boolean[V], src, "0", tar);
    }
}
