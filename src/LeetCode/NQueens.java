package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        placeQueen(new int[n][n], 0, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return res;
    }

    //Because we are trying to go horizonal in loop so need only vertical in that case.
    public static void placeQueen(int[][] board, int i, Set<Integer> diagonal, Set<Integer> diagonal2, Set<Integer> vertical){
        if(i == board.length){
            addToList(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(!diagonal.contains(i+j) && !diagonal2.contains(j-i) && !vertical.contains(j)){
                board[i][j] = 1;
                diagonal.add(i+j);
                diagonal2.add(j-i);
                vertical.add(j);
                placeQueen(board, i+1, diagonal, diagonal2, vertical);
                board[i][j] = 0;
                diagonal.remove(i+j);
                diagonal2.remove(j-i);
                vertical.remove(j);
            }
        }
    }

    private static void addToList(int[][] board) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String tmp = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 0){
                    tmp += ".";
                }else {
                    tmp += "Q";
                }
            }
            list.add(tmp);
        }
        res.add(list);
    }

    public static void main(String args[]){
        System.out.println(solveNQueens(4));
    }
}
