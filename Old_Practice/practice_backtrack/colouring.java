package Java.practice_backtrack;

public class colouring {

    static int V = 4;
    
    static void printSolution(int[] colors) {
        System.out.println("Solution exists:" + "Following is the solution for the given");
        for(int i = 0 ; i < V; i++) {
            System.out.print(" " + colors[i]);
            System.out.println();
        }
    }
    
    static boolean isSafe(boolean[][] graph, int[] color) {
        for(int i = 0 ; i < V ;i++) 
            for(int j = i + 1 ; j < V;j++) 
                if(graph[i][j] && color[j] == color[i]) 
                    return false;
                
        return true;
    }

    /* This function solves the m Coloring
      problem using recursion. It returns
      false if the m colours cannot be assigned,
      otherwise, return true and prints
      assignments of colours to all vertices.
      Please note that there may be more than
      one solutions, this function prints one
      of the feasible solutions.*/
      static boolean graphColouring(boolean[][] graph,int m,int i, int[] color) {

        //if current index reached end
        if(i == V) {
            if(isSafe(graph,color)) {
                printSolution(color);
                return true;
            }
            return false;
        }

        for(int j = 1 ; j <= m ; j++) {
            color[i] = j;

            if(graphColouring(graph, m, i + 1, color))
                return true;
            color[i] = 0;
        }
        return false;
      }

      public static void main(String[] args)
    {
  
        /* Create following graph and
            test whether it is 3 colorable
            (3)---(2)
            | / |
            | / |
            | / |
            (0)---(1)
            */
        boolean[][] graph = {
            { false, true, true, true },
            { true, false, true, false },
            { true, true, false, true },
            { true, false, true, false },
        };
        int m = 3; // Number of colors
  
        // Initialize all color values as 0.
        // This initialization is needed
        // correct functioning of isSafe()
        int[] color = new int[V];
        for (int i = 0; i < V; i++)
            color[i] = 0;
  
        // Function call
        if (!graphColouring(graph, m, 0, color))
            System.out.println("Solution does not exist");
    }
}
