package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/11/17.
 */
public class TheGridSearch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        tests:
        for(int t = 0; t < T; t++)
        {
            int R = input.nextInt();
            int C = input.nextInt();
            input.nextLine();
            //Change it to int 2D Array
            int[][] Grid = new int[R][C];
            for(int i = 0; i < R; i++)
            {
                String row = input.nextLine();
                for(int j = 0; j < C; j++)
                {
                    Grid[i][j] = Character.getNumericValue(row.charAt(j));
                }
            }

            int r = input.nextInt();
            int c = input.nextInt();
            input.nextLine();
            //Change it to int 2D Array
            int[][] Pattern = new int[r][c];
            for(int i = 0; i < r; i++)
            {
                String row = input.nextLine();
                for(int j = 0; j < c; j++)
                {
                    Pattern[i][j] = Character.getNumericValue(row.charAt(j));
                }
            }


            int PatternStart = Pattern[0][0];
            for(int i = 0; i < Grid.length; i++)
            {
                for(int j = 0; j < Grid[0].length; j++)
                {
                    if(Grid[i][j] == PatternStart)
                    {
                        if(isPattern(Grid, i, j, Pattern))
                        {
                            System.out.println("YES");
                            continue tests;
                        }
                    }
                }
            }
            System.out.println("NO");
        }
    }


    public static boolean isPattern(int[][] Grid, int i, int j, int[][] Pattern)
    {
        if(i > Grid.length-Pattern.length || j > Grid[0].length-Pattern[0].length){return false;}
        int rowG = i;
        int colG = j;

        for(int rowP = 0; rowP < Pattern.length; rowP++)
        {
            for(int colP = 0; colP < Pattern[0].length; colP++)
            {
                if(Grid[rowG][colG] != Pattern[rowP][colP]){return false;}
                colG++;
            }
            colG = j;
            rowG++;
        }
        return true;
    }
}