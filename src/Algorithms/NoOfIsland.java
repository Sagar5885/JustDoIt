package Algorithms;

public class NoOfIsland {
    public static void mark_current_island(char[][] arr, int x, int y, int r, int c){
        if(x<0 || x>=r || y<0 || arr[x][y]!='1'){
            return;
        }

        //Mark Current Cell as visited
        arr[x][y] = '2';

        //Mark recursive call in all 4 adjacent directions
        mark_current_island(arr, x+1, y, r, c);//Down
        mark_current_island(arr, x, y+1, r, c);//Right
        mark_current_island(arr, x-1, y, r, c);//Top
        mark_current_island(arr, x, y-1, r, c);//Left
    }

    public static int noOfIslands(char[][] arr){

        int rows = arr.length;
        if(rows == 0){
            return 0;
        }

        int cols = arr[0].length;

        int no_of_islands = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == '1'){
                    mark_current_island(arr, i, j, rows, cols);
                    no_of_islands++;
                }
            }
        }

        return no_of_islands;
    }

    public static void main(String args[]){
        char[][] arr = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(noOfIslands(arr));
    }
}
