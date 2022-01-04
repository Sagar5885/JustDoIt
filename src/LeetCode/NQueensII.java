package LeetCode;

public class NQueensII {

    int count=0;
    public int totalNQueens(int n) {
        // set board
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; ++i){
            for(int j=0; j<board[i].length; ++j)
                board[i][j] = '.'; //initialize board with dots
        }
        // start exploring the result
        backTracking(board, n, 0);
        return count;
    }
    public void backTracking(char[][] board, int n, int row){
        // set up return condition
        if(row == board.length){
            count++;
            return;
        }
        for(int col=0; col<n; ++col){
            if(isValid(board, row, col)){
                board[row][col] = 'Q';
                backTracking(board, n, row+1);
                board[row][col] = '.';
            }
        }
    }
    public boolean isValid(char[][] board, int row, int col){
        // since we explore the location row by row
        // we only have to check the conflicts happening in the same col, left up corner and right up corner
        for(int i=0; i<row; ++i)
            if(board[i][col] =='Q') // conflicts happen
                return false;

        // check primary diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; --i,--j){
            if(board[i][j] =='Q') // conflicts happen
                return false;
        }
        // check anti-diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board[i].length; --i, ++j){
            if(board[i][j] =='Q') // conflicts happen
                return false;
        }
        return true;
    }
}
