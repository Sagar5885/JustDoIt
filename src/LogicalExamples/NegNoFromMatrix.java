package LogicalExamples;

import java.util.Scanner;

/**
 * Created by sdodia on 9/19/17.
 * Find Total number of -ve number from nxm Matrix (Array) - Note: We have Matrix sorted with each row
 */
public class NegNoFromMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] M = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                M[i][j] = sc.nextInt();
            }
        }

        //This nested for loop is just for debugging not needed in solution
        /*for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }*/
        //Now we have matrix of nxm (Array) now we have to find total no of -ve from it with most optimal solution
        //Condition all rows are sorted so that's plus! :)

        System.out.println(count(n, m, M));

    }

    public static int count(int n, int m, int[][] M){
        int res = 0;

        int i = 0;
        int j = m-1;
        while(j>=0 && i<n){
            if(M[i][j] < 0){
                res += j+1;
                i++;
            }else {
                j--;
            }
        }

        return res;
    }
}
