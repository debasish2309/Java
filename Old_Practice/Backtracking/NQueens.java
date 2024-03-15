package Old_Practice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    private boolean isSafe(int row, int col, char[][] boards) {

        //horizontal
        for(int j = 0 ; j < boards.length ;j++) {
            if(boards[row][j] == 'Q')
                return false;
        }

        //vetrical
        for(int i = 0 ; i < boards.length ; i++) {
            if(boards[i][col] == 'Q') 
                return false;
        }

        //upperleft
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--,r-- ) {
            if(boards[r][c] == 'Q')
                return false;
        }

        //upperright
        r = row;
        for(int c = col; c < boards.length && r >= 0; c++,r-- ) {
            if(boards[r][c] == 'Q')
                return false;
        }

        //lowerleft
        r = row;
        for(int c = col; c >= 0 && r < boards.length; c--,r++ ) {
            if(boards[r][c] == 'Q')
                return false;
        }

        //lowerright
        r = row;
        for(int c = col; c < boards.length && r < boards.length; c++,r++ ) {
            if(boards[r][c] == 'Q')
                return false;
        }

        return true;
    } 

    private void saveBoard(char[][] boards, List<List<String>> allboards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i = 0 ; i < boards.length;i++) {
            row = "";
            for(int j = 0 ;j < boards[0].length ; j++) {
                if(boards[i][j] == 'Q') 
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
    }

    public void helper(char[][] boards,List<List<String>> allboards,int col ) {

        if(col == boards.length) {
            saveBoard(boards, allboards);
            return;
        }
        for(int row = 0 ; row < boards.length; row++) {
            if(isSafe(row, col,boards)) {
                boards[row][col] = 'Q';
                helper(boards, allboards, col + 1);
                boards[row][col] = '.';

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allboards,0);
        return allboards;

    }

    public static void main(String[] args) {
        NQueens queens = new NQueens();
        queens.solveNQueens(4);
    }
    
}
