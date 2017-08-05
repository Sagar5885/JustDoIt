package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 7/24/17.
 */
public class ClimbingLeaderboard2Correct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
        }
        int[] ranks = buildRanks(scores);

        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }

        for (int i:alice) {
            System.out.println(solve(scores, ranks, i));
        }

    }

    static int[] buildRanks(int[] scores) {
        int[] ranks = new int[scores.length];
        int rank = 1;
        for (int i = 0; i < ranks.length; i++) {
            if (i > 0 && scores[i] != scores[i - 1]) {
                rank++;
            }
            ranks[i] = rank;
        }
        return ranks;
    }

    static int solve(int[] scores, int[] ranks, int alice) {
        int lower = 0;
        int upper = scores.length - 1;
        int aliceRank = 1;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (alice == scores[middle]) {
                aliceRank = ranks[middle];
                break;
            } else if (alice < scores[middle]) {
                aliceRank = ranks[middle] + 1;
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }
        return aliceRank;
    }

}
