package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/24/17.
 */
public class FormingMagicSquare {
    static int minCost;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        System.out.println(solve(s));
    }

    static int solve(int[][] s) {
        minCost = Integer.MAX_VALUE;

        int[] numbers = new int[3 * 3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        search(new int[3][3], numbers, 0, 0, s);

        return minCost;
    }


    static void search(int[][] matrix, int[] numbers, int row, int col, int[][] s) {
        if (row == 3) {
            if (isMagic(matrix)) {
                int cost = 0;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        cost += Math.abs(matrix[r][c] - s[r][c]);
                    }
                }
                minCost = Math.min(minCost, cost);
            }

            return;
        }

        if (col == 3) {
            search(matrix, numbers, row + 1, 0, s);

            return;
        }

        int index = row * 3 + col;
        for (int i = index; i < numbers.length; i++) {
            swap(numbers, index, i);
            matrix[row][col] = numbers[index];
            search(matrix, numbers, row, col + 1, s);
            swap(numbers, index, i);
        }
    }

    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    static boolean isMagic(int[][] matrix) {
        final int SUM = 15;
            return matrix[0][0] + matrix[0][1] + matrix[0][2] == SUM
                && matrix[1][0] + matrix[1][1] + matrix[1][2] == SUM
                && matrix[2][0] + matrix[2][1] + matrix[2][2] == SUM
                && matrix[0][0] + matrix[1][0] + matrix[2][0] == SUM
                && matrix[0][1] + matrix[1][1] + matrix[2][1] == SUM
                && matrix[0][2] + matrix[1][2] + matrix[2][2] == SUM
                && matrix[0][0] + matrix[1][1] + matrix[2][2] == SUM
                && matrix[0][2] + matrix[1][1] + matrix[2][0] == SUM;
    }
}
