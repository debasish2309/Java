package Java.practice_backtrack;

public class HamiltonCycle {

    final int v = 5;
    int path[];

    boolean isSafe(int v, int graph[][],int path[], int pos) {

        //cehck is vertes is the adjucent vertex of the previous added vertex
        if(graph[path[pos - 1]][v] == 0)
            return false;

        /*check if the vertex is already been included
         * this step can be optimised by creating array of size v
         */
        for(int i = 0 ; i < v ; i++)
            if(path[i] == v)
                return false;

        return true;
    }

    

    void printSolution(int path[]) {
        System.out.println("Solution exists: " + "is one hamilton cycle");
        for(int i = 0 ; i < v ; i++) {
            System.out.println(" " + path[i] + " ");
        }
        System.out.println(" " + path[0] + " ");
    }
    
}
