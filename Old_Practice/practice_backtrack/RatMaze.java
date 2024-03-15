package Java.practice_backtrack;

public class RatMaze {

    static int N;

    void printSolution(int sol[][]) {
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < N; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int maze[][],int x, int y) {
        return(x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    /*
     * the function that solves the maze problemn using backtracking.
     * It mainly solves solveMazeUtil() to solve the problemn.
     * It returns the false if no path is possible,otherwise return true 
     * and prins the path in the form of 1s.There may be more than one 
     * solution but it prints only one fisible solution.
     */
    boolean solveMaze(int maze[][]) {
        int sol[][] = new int[N][N];

        if(solveMazeUtil(maze,0,0,sol) == false) {
            System.out.println("Solution doesn't exists");
            return false;
        } 

        printSolution(sol);
        return true;
        
    }

    //a recursive utility to solve the problemn
     private boolean solveMazeUtil(int maze[][],int x, int y, int sol[][]) {

        //Base case
        if(x == N-1 && y == N-1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        //chack if x y  is valid
        if(isSafe(maze, x, y) == true) {

            //check if current block is already part of solution box
            if(sol[x][y] == 1)
                return false;
            
            sol[x][y] = 1;

            //move forwardin x direction
            if(solveMazeUtil(maze, x + 1, y, sol))
                return true;

            //move in y direction
            if(solveMazeUtil(maze, x, y + 1, sol))
                return true;
            
            //if none of the move ment works backtrack
            //unmark x y  from solution path
            sol[x][y] = 0;
            return false;
        }
        return false;
    }



    public static void main(String[] args) {
        RatMaze rat = new RatMaze();
        int maze[][] = {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};
        N = maze.length;
        rat.solveMaze(maze);

    }
    
}
