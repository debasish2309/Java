package Java.practice_backtrack;

public class NQueensNew {

    final int N = 8;

    private void printSolution(int[][] board) {
        for(int i = 0; i < N ; i++) {
            for(int j = 0 ; j < N ; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }

    }

    private boolean isSafe(int board[][],int row, int col) {
        int i,j;

        //check row on left side
        for(i = 0 ; i < col ; i++) {
            if(board[row][i] == 1) {
                return false;
            }
        }

        //check upper diagonl on the left side
        for(i = row,j = col;j >= 0 && i >= 0; i--, j--) {
            if(board[i][j] == 1)
                return false;
        }

        //chech the lower diagonal of the board
        for(i = row,j = col; j >= 0 && i < N; j--,i++){
            if(board[i][j] == 1)
                return false;
        }
        
        return true;
    }

    /* recursive utilitu function to solve the N Queens problemn */
    private boolean SolveNQUtil(int board[][],int col) {

        //base case
        if(col >= N )
            return true;

        //consider try placing the queen at the place
        for(int i = 0 ; i < N ; i++) {
            if(isSafe(board,i, col)) {
                board[i][col] = 1;

                //recurhte function till we can place the queen
                if(SolveNQUtil(board, col + 1) == true) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    private boolean SolveNQ(){

        int board[][] = {{0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0}, 
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0}};
        if(SolveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;

    }

    public static void main(String[] args) {
        NQueensNew queens = new NQueensNew();
        queens.SolveNQ();

    }
}
