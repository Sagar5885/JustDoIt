package LogicalExampleHackerrank.DataStructure;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class Array2DDS {
    static public int hourglasses(int[][] ar){
        int a1 = ar[0][0] + ar[0][1] + ar[0][2] + ar[1][1] + ar[2][0] + ar[2][1] + ar[2][2];
        int res = 0;
        for(int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int a2 = ar[j][i] + ar[j][i + 1] + ar[j][i + 2] + ar[j+1][i + 1] + ar[j+2][i] + ar[j+2][i + 1] + ar[j+2][i + 2];
                if (a1 > a2) {
                    res = a1;
                } else {
                    res = a2;
                    a1 = a2;
                }
            }
        }

        return res;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][] ar = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++) {
                ar[i][j] = in.nextInt();
            }
        }

//        int[][] ar = new int[6][6];
//
//        ar[0][0] = 1; ar[0][1] = 1; ar[0][2] = 1; ar[0][3] = 0; ar[0][4] = 0; ar[0][5] = 0;
//        ar[1][0] = 0; ar[1][1] = 1; ar[1][2] = 0; ar[1][3] = 0; ar[1][4] = 0; ar[1][5] = 0;
//        ar[2][0] = 1; ar[2][1] = 1; ar[2][2] = 1; ar[2][3] = 0; ar[2][4] = 0; ar[2][5] = 0;
//
//        ar[3][0] = 0; ar[3][1] = 9; ar[3][2] = 2; ar[3][3] = -4; ar[3][4] = -4; ar[3][5] = 0;
//        ar[4][0] = 0; ar[4][1] = 0; ar[4][2] = 0; ar[4][3] = -2; ar[4][4] = 0; ar[4][5] = 0;
//        ar[5][0] = 0; ar[5][1] = 0; ar[5][2] = -1; ar[5][3] = -2; ar[5][4] = -4; ar[5][5] = 0;

        System.out.print(hourglasses(ar));

    }
}
