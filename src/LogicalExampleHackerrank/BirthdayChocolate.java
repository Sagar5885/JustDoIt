package LogicalExampleHackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by sdodia on 7/20/17.
 */
public class BirthdayChocolate {
    static int solve(int n, int[] s, int d, int m) {
        if (m > n) {
            return 0;
        }

        int sum = IntStream.range(0, m).map(i -> s[i]).sum();
        int result = 0;
        for (int i = 0; i + m <= n; i++) {
            if (sum == d) {
                result++;
            }

            if (i + m < n) {
                sum += s[i + m] - s[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
