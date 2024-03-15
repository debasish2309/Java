package Java.practice_backtrack;

import java.util.ArrayList;
import java.util.Arrays;

//Java program to find if there is simple path with weight more than k
public class SimplestPath {

    static class AdjListNode {
        int v ;
        int weight;

        AdjListNode(int _v, int _w) {
            v = _v;
            weight = _w;
        }
        int getV() {return v;}
        int getWeight() {return weight;}
    }

    //this class represents a dispathched path using adjucent list representation
    static class Graph {
        int V; // no of vertices

        //In the weighted graph, we need to store vertex weight pair for every edge
        ArrayList<ArrayList<AdjListNode>> adj;

        //Allocates memory for adjucency list
        Graph(int V){
            this.V = V;
            adj = new ArrayList<ArrayList<AdjListNode>>(V);
            for(int i = 0 ; i < adj.size() ;i++) {
                adj.add(new ArrayList<AdjListNode>());
            }
        }

        //Utitlity function to an edge (u,v) of weight w
        void addEdge(int u,int v,int weight) {
            AdjListNode node1 = new AdjListNode(v, weight);
            adj.get(u).add(node1);

            AdjListNode node2 = new AdjListNode(u, weight);
            adj.get(v).add(node2);
        }

        //returns true if graph has path more than k length
        boolean pathMoreThanK(int src,int k){

            //Create a path array with nothing included in path
            boolean path[] = new boolean[V];
            Arrays.fill(path, false);

            //Add source vertex to path
            path[src] = true;
            
        //    return pathMoreThanKUtil(src,k,path);
        }

        //print hte shortest path from src to all vertices
        // boolean pathMoreThanKUtil(int src, int k, boolean[] path) {

        //     //if k is 0 or negetive return true;
        //     if(k <= 0)
        //         return true;

        //     //get all vertices of source vertex src and
        //     //recursively explore all path from src
        //     ArrayList<AdjListNode> it = adj.get(src);

        //     int index = 0 ;
        //     for(int i= 0 ; i < adj.get(src).size(); i++) {
        //         AdjListNode vertex = adj.get(src).get(i);

        //         // Get adjacent vertex and weight of edge
        //          int v = vertex.v;
        //          int w = vertex.weight;

        //     }

        }


    }

    
}
