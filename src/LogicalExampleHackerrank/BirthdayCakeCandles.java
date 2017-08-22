package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class BirthdayCakeCandles {
    static int solve(int[] heights) {
        int maxHeight = Arrays.stream(heights).max().getAsInt();
        return (int) Arrays.stream(heights).filter(height -> height == maxHeight).count();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = solve(ar);
        System.out.println(result);
    }
}
