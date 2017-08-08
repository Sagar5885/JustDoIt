package LogicalExampleHackerrank;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by sdodia on 8/7/17.
 */
public class OrganizingContainersBalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            LinkedList<Integer> container = new LinkedList<Integer>();
            LinkedList<Integer> balls = new LinkedList<Integer>();
            for(int i=0; i<n; i++){
                int rowSum = 0;
                int colSum = 0;
                for(int j =0; j<n; j++){
                    rowSum += M[i][j];
                    colSum += M[j][i];
                }
                balls.add(colSum);
                container.add(rowSum);
            }

            container.removeAll(balls);
            if(container.isEmpty()){
                System.out.println("Possible");
            }else {
                System.out.println("Impossible");
            }
        }
    }
}
