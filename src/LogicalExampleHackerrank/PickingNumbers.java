package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 7/24/17.
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        System.out.println(solve(a));
    }

    static int solve(int[] a) {
        int[] counts = new int[100];
        for (int number : a) {
            counts[number]++;
        }

        int result = Arrays.stream(counts).max().getAsInt();
        for (int i = 0; i + 1 < counts.length; i++) {
            result = Math.max(result, counts[i] + counts[i + 1]);
        }
        return result;
    }
}
