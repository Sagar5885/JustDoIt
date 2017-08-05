package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/20/17.
 */
public class DiagonalDifference {

    static int twoDArrDD(int n, int[][] ar) {
        int d1 = 0;
        int d2 = 0;
        for(int i=0; i<n; i++){
            d1 += ar[i][i];
        }

        int j=n-1;
        for(int i=0; i<n; i++){
            d2 += ar[i][j];
            j--;
        }

        int res = 0;
        if(d1>=d2){
            res = d1 - d2;
        }else{
            res = d2 - d1;
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] ar = new int[n][n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            for(int ar_j = 0; ar_j < n; ar_j++){
                ar[ar_i][ar_j] = in.nextInt();
            }
        }
        int result = twoDArrDD(n, ar);
        System.out.println(result);
    }
}
