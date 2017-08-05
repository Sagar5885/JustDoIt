package LogicalExampleHackerrank.ArraysExs;

import java.util.Scanner;

/**
 * Created by sdodia on 7/10/17.
 */
public class Array2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int tmp1 = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        int max = tmp1;
        for(int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                tmp1 = arr[j][i] + arr[j][i + 1] + arr[j][i + 2] + arr[j+1][i + 1] + arr[j+2][i] + arr[j+2][i + 1] + arr[j+2][i + 2];
                if (tmp1 > max) {
                    max = tmp1;
                }
            }
        }
        System.out.println(max);
    }
}
