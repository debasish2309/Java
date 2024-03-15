package Java.Graphs;

public class Dijsktra {

    static final int V = 9;
    int minDistance(int dist[],Boolean sptSet[]) {

        //initialize min value
        int min = Integer.MAX_VALUE, min_index =  -1;

        for(int v = 0 ; v < V; v++) {
            if(sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
                System.out.println(min_index + " " + min);
            }           
        }
        return min_index;
    }

    //A utility function to print the constructed distance array
    void printSolution(int dist[]) {
        System.out.println("vertex \t\t distance from source");
        for(int i = 0 ; i < V ; i++) 
            System.out.println(i + " \t\t " + dist[i]);
    }

    //Function that implements Dijkstra single source
    //shortest path algorithm for a graph represented using 
    //adjucency matrix representation
    void dijkstra(int graph[][], int src) {
        int dist[] = new int[V]; 
        /*
         * The output array dist[i] will hold the shortest dist form src to i
         * sptSet[i] will true if vertex i is included in shortest distence from
         * src to i is finalised
         */
        Boolean sptSet[] = new Boolean[V];
        for(int i = 0 ; i < V ;i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        //Distance of source vertext from itself is always 0
        dist[src] = 0;

        //Find shortest path for all vertices
        for(int count = 0 ; count < V-1 ; count++) {
            //Pick the min distance vertex from the set of vertices not yet processed
            //u is always equal to src in first iteration
            System.out.println();
            int u = minDistance(dist, sptSet);

            //Mark the picekd vertex as processed
            sptSet[u] = true;

            //Update dist value of the adjucent vertices of the picked vertex
            for(int v = 0 ; v < V;v++) {

                /*
                 * Update dist[v] only if it is not in sptSet,
                 * there is an edge form u to v, and total
                 * weight fo path from src to v through u is
                 * smaller than current value of dist[v]
                 */
                if(!sptSet[v] && graph[u][v] != 0
                    && dist[u] != Integer.MAX_VALUE
                    && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }
            printSolution(dist);
        }
   }

   public static void main(String[] args) {
    int graph[][]
            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        Dijsktra t = new Dijsktra();
 
        // Function call
        t.dijkstra(graph, 0);
   }
    
}
