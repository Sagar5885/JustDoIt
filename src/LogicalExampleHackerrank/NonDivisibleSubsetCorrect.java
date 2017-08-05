package LogicalExampleHackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 8/3/17.
 */
public class NonDivisibleSubsetCorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] remainders = new int[k];
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            remainders[ai % k]++;
        }

        int result = 0;
        for (int i = 0; i * 2 <= k; i++) {
            int opposite = (k - i) % k;
            if (i == opposite) {
                result += Math.min(remainders[i], 1);
            } else {
                result += Math.max(remainders[i], remainders[opposite]);
            }
        }
        System.out.println(result);

        sc.close();
    }
}
