package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/22/17.
 */
public class DrawingBook {
    static int solve(int n, int p) {
        return Math.min(p / 2, (n / 2 * 2 + 1 - p) / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
