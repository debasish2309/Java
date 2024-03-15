package Java.practice_backtrack;

public class KnightsTour {

    static int N = 8;

    //a utility function to checkif i,j are valid indexed of N*N chessboard
    static boolean isSafe(int x, int y, int sol[][]) {
        return(x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    //Autitlty function to print solution matrix sol[x][y]
    public static void printSolution(int sol[][]) {
        for(int i = 0; i < N ; i++){ 
            for(int y = 0 ; y < N; y++){           
                System.out.print(sol[i][y] + " "); 
            }         
            System.out.println();
        }
    }
    

    /*
     * this function solves the knight tour problemn using backtracking.
     * This function is mainly uses solveKUtil() to solve the problemn.
     * It returns false if no complete tour is possible, otherwise returns true
     * and prints the tour.
     * Please note that there may be more than one solution,
     * the funcion prins one of the feasible solution
     */
     static boolean solveKT() {
        int sol[][] = new int[8][8];

        //initialization of solution matrix
        for(int x = 0  ;x < N; x++) {
            for(int y = 0 ; y < N ; y++) {
                sol[x][y] = -1;
            }
        }

        /*
         * xMove and yMove define next move for knight
         * xMove is the next value of x coodinate
         * yMove is the next value of y coodinate
         */
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        //since the knight is initally at first block
        sol[0][0] = 0;

        /*
         * start from 0,0 and explore all tours using solveKUtil()
         */
        if(!solveKTUtil(0,0,1,sol,xMove,yMove)) {
            System.out.println("Solution does not exists");
            return false;
        }
        else {
            printSolution(sol);
        }
        return true;
    }

    //recursive utility to solve knoght tour 
    static boolean solveKTUtil(int x, int y, int movei,int sol[][],int xMove[],int yMove[]) {
        int k,next_x,next_y;
        
        if(movei == N* N) 
            return true;

        /*
        Try all moves from the current coodinate x, y
         */ 
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1,sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y]= -1; // backtracking
            }
        } 
        return false;
    }

    public static void main(String args[])
    {
        // Function Call
        solveKT();
    }
    
}
