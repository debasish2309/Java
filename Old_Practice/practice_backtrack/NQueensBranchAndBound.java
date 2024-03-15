package Java.practice_backtrack;

// finding n queens using brancha nd bound method
public class NQueensBranchAndBound {

    static int N = 8;

    static void printSolution(int board[][]) {
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board.length ; j++) {
                System.out.println("%2d " + board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int row, int col,
                            int slashCode[][],
                            int backSlashCode[][],
                            boolean rowLookup[],
                            boolean slashCodeLookup[],
                            boolean backSlashCodeLookup[]) {

    if(slashCodeLookup[slashCode[row][col]] ||
        backSlashCodeLookup[backSlashCode[row][col]] || 
        rowLookup[row])
            return false;

        return true;
    }

    //Recursive utility function to solve N Queen problem
    static boolean solveNQueensUtil(int board[][],int col, int[][] slashCode,
                                    int backSlashCode[][], boolean rowLookup[],
                                    boolean slashCodeLookup[],
                                    boolean backSlashCodeLookup[]) {
        int N = board.length;
        
        if(col >= N) { 
            return true;
        }

        //consider this column and try placing this queen in all rows one by one
        for(int i = 0 ; i < N ; i++) {
            if(isSafe(i , col,slashCode,backSlashCode,rowLookup,slashCodeLookup,backSlashCodeLookup)) {

                //Place this queen in the board[i][col]
                board[i][col] = 1;
                rowLookup[i] = true;
                slashCodeLookup[slashCode[i][col]] = true;
                backSlashCodeLookup[slashCode[i][col]] = true;
                if(solveNQueensUtil(board, col + 1, slashCode, backSlashCode, rowLookup, slashCodeLookup, backSlashCodeLookup)){
                    return true;
                }
                board[i][col] = 0;
                rowLookup[i] = false;
                slashCodeLookup[slashCode[i][col]] = false;
                backSlashCodeLookup[slashCode[i][col]] = false;
            }
        }

        // If queen can not be place in any row
        // in this column col then return false
        return false;
    

    }

    /*
    * This function solves the N Queen problem using Branch
    * and Bound. It mainly uses solveNQueensUtil() to solve
    * the problem. It returns false if queens cannot be
    * placed, otherwise return true and prints placement of
    * queens in the form of 1s. Please note that there may
    * be more than one solutions, this function prints one
    * of the feasible solutions.
    */
    static boolean solveNQueens() {

        int board[][] = new int[N][N];
        int slashCode[][] = new int[N][N];
        int backSlashCode[][] = new int[N][N];

        //Array to tell which row is occupird
        boolean[] rowLookup = new boolean[N];
        boolean[] slashCodeLookup = new boolean[2 * N -1];
        boolean[] backSlashCodeLookup = new boolean[2 * N - 1];

        for(int r = 0 ; r < N ; r++) {
            for(int c = 0 ; c < N ; c++) {
                x[r][c] = r + c ;
                backSlashCode[r][c] = r - c + 7;
            }
            if(solveNQueensUtil( board ,0 , slashCode,
                                backSlashCode, rowLookup,
                                slashCodeLookup,
                                backSlashCodeLookup) == false) {
                System.out.println("Solution doesnot exists");
                return false;
            }
        }

        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        solveNQueens();
    }
    
}
