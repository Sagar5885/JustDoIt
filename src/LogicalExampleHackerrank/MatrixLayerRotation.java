package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/18/17.
 */
public class MatrixLayerRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] ar = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        //For each ring
        for(short ringNum = 0, numRings = (short)(Math.min(m, n) >> 1); ringNum < numRings; ++ringNum){
            short maxY = (short)(m - ringNum - 1);
            short maxX = (short)(n - ringNum - 1);
            short ringLen = (short)((maxY + maxX - (ringNum << 1)) << 1);
            int[] ring = new int[ringLen];

            //Unwrap ring
            short i = 0;
            for(int x = ringNum; x <= maxX; ring[i++] = ar[ringNum][x++]){}
            for(int y = ringNum; y < maxY; ring[i++] = ar[++y][maxX]){}
            for(int x = maxX; x > ringNum; ring[i++] = ar[maxY][--x]){}
            for(int y = maxY; --y > ringNum; ring[i++] = ar[y][ringNum]){}

            //Rotate ring
            ring = rotate(ring, ringLen, r);

            //Wrap ring
            i = 0;
            for(int x = ringNum; x <= maxX; ar[ringNum][x++] = ring[i++]){}
            for(int y = ringNum; y < maxY; ar[++y][maxX] = ring[i++]){}
            for(int x = maxX; x > ringNum; ar[maxY][--x] = ring[i++]){}
            for(int y = maxY; --y > ringNum; ar[y][ringNum] = ring[i++]){}
        }

        //Print matrix
        System.out.print(matrixToStringBuffer(ar, m, n));
    }

    private static int[] rotate(int[] A, int len, int rotations){
        int i = 0;
        rotations %= len;
        int[] B = new int[len];
        for(int j = rotations; j < len; B[i++] = A[j++]){}
        for(int j = 0; i < len; B[i++] = A[j++]){}
        return B;
    }

    private static StringBuffer matrixToStringBuffer(int[][] matrix, int Y, int X){
        StringBuffer sb = new StringBuffer();
        for(int y = 0; y < Y; ++y){
            for(int x = 0; x < X; sb.append(matrix[y][x++]).append(" ")){}
            sb.append("\n");
        }
        return sb;
    }
}
