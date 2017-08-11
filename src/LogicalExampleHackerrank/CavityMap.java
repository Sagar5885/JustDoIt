package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/10/17.
 */
public class CavityMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for (int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next();
        }

        if(n>2){
            for(int i=1; i<n-1; i++){
                for(int j=1; j<grid[i].length()-1; j++){
                    if(check(grid[i].charAt(j-1), grid[i].charAt(j+1), grid[i-1].charAt(j), grid[i+1].charAt(j), grid[i].charAt(j))){
                        StringBuilder myName = new StringBuilder(grid[i]);
                        myName.setCharAt(j, 'X');
                        grid[i] = String.valueOf(myName);
                    }
                }
            }

        }

        for (String s:grid) {
            System.out.println(s);
        }
    }

    public static boolean check(char a, char b, char c, char d, char ch){
        boolean res = false;
        if((Character.getNumericValue(ch) > Character.getNumericValue(a)) &&
                (Character.getNumericValue(ch) > Character.getNumericValue(b)) &&
                (Character.getNumericValue(ch) > Character.getNumericValue(c)) &&
                (Character.getNumericValue(ch) > Character.getNumericValue(d))){
            res = true;
        }

        return res;
    }
}
